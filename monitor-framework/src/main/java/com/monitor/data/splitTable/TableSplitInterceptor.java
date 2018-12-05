package com.monitor.data.splitTable;

import com.sky.utils.StringUtil;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Properties;

@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class TableSplitInterceptor implements Interceptor {
    private Logger logger=LoggerFactory.getLogger(this.getClass());
    private static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
    private static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY);

        BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
        // Configuration configuration = (Configuration) metaStatementHandler
        // .getValue("delegate.configuration");
        Object parameterObject = metaStatementHandler.getValue("delegate.boundSql.parameterObject");
        doSplitTable(metaStatementHandler,boundSql);
        // 传递给下一个拦截器处理
        return invocation.proceed();

    }

    @Override
    public Object plugin(Object target) {
        // 当目标类是StatementHandler类型时，才包装目标类，否者直接返回目标本身,减少目标被代理的次数
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

    @Override
    public void setProperties(Properties properties) {
    }

    private void doSplitTable(MetaObject metaStatementHandler,BoundSql boundSql) throws ClassNotFoundException{
        String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
        Object object = boundSql.getParameterObject();

        if (originalSql != null && !originalSql.equals("")) {
//            if(order==null){
//                logger.error("语句{} 参数对象order为空",originalSql);
//                return;
//            }
            String logOriginalSql=StringUtil.deleteBlank(originalSql);
            logger.info("分表前的SQL："+logOriginalSql);
            MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
            String id = mappedStatement.getId();
            String className = id.substring(0, id.lastIndexOf("."));
            Class<?> classObj = Class.forName(className);
            // 根据配置自动生成分表SQL
            TableSplit tableSplit = classObj.getAnnotation(TableSplit.class);
            if (tableSplit != null && tableSplit.split()) {
                StrategyManager strategyManager = ContextHelper.getStrategyManager();
                Strategy strategy=strategyManager.getStrategy(tableSplit.strategy());//获取分表策略来处理分表
                //开始埋坑
                String convertedSql=originalSql.replaceAll(tableSplit.value(), strategy.convert(tableSplit.value(),object,boundSql));
                metaStatementHandler.setValue("delegate.boundSql.sql",convertedSql);
                String convertSqlLog=StringUtil.deleteBlank(convertedSql);
                logger.info("分表后的SQL："+convertSqlLog);
            }
        }
    }

}
