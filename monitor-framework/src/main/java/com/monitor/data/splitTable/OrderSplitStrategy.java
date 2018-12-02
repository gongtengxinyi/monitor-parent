package com.monitor.data.splitTable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.monitor.data.pojo.Order;
import com.monitor.utils.JsonUtil;
import org.apache.ibatis.mapping.BoundSql;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * order 分表策略  阉割版本  TODO:后期利用语义分析进行替换
 */
public class OrderSplitStrategy implements Strategy{
    private Logger logger =LoggerFactory.getLogger(this.getClass());
    @Override
    public String convert(String tableName, Object object, BoundSql boundSql) {
        //进行order 分表
        if(object instanceof Order){
            Order order =(Order)object;
            if(order.getUserId()==null){
                String boundSqlJson="";
                try {
                    boundSqlJson = JsonUtil.convertObject2String(boundSql);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                logger.error("boundsql:{}  传入参数order的userId为空",boundSqlJson);
            }
            String tableSuffix = String.valueOf(order.getUserId() % 10 + 1);
            if(Integer.parseInt(tableSuffix)<10){
                tableSuffix="0"+tableSuffix;
            }
            StringBuffer sb =new StringBuffer();
            StringBuffer tableReal = sb.append(tableName).append("_").append(tableSuffix);
            logger.info("分表后的表名{}",tableReal);
            return tableReal.toString();
        }
        return null;
    }
}
