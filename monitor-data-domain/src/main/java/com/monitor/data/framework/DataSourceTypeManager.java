package com.monitor.data.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据源管理
 */
public class DataSourceTypeManager {
    private static Logger logger =LoggerFactory.getLogger(DataSourceTypeManager.class);
    /**
     * 注意：数据源标识保存在线程变量中，避免多线程操作数据源时互相干扰
     */
    private static final ThreadLocal<String> THREAD_DATA_SOURCE = new ThreadLocal<String>();

    public static String getDataSource() {
        return THREAD_DATA_SOURCE.get();
    }

    public static void setDataSource(String dataSource) {
        logger.info("设置使用数据源{}",dataSource);
        THREAD_DATA_SOURCE.set(dataSource);
    }

    public static void clearDataSource() {
        logger.info("清除目前使用的数据源{}完成",getDataSource());
        THREAD_DATA_SOURCE.remove();
    }

}
