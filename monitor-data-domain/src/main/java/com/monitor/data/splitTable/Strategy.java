package com.monitor.data.splitTable;

import org.apache.ibatis.mapping.BoundSql;

public interface Strategy {
    /**
     * 传入一个需要分表的表名，返回一个处理后的表名
     * Strategy必须包含一个无参构造器
     * @param tableName
     * @return
     */
    public String convert(String tableName, Object object, BoundSql boundSql);
}
