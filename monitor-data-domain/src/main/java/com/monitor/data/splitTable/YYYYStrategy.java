package com.monitor.data.splitTable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class YYYYStrategy implements Strategy{

    @Override
    public String convert(String tableName) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
        StringBuilder sb=new StringBuilder(tableName);
        sb.append("_");
        sb.append(sdf.format(new Date()));
        return sb.toString();
    }

}