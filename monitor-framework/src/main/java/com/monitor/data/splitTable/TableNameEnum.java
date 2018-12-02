package com.monitor.data.splitTable;

/**
 */
public enum TableNameEnum {
    ORDER("order", "order表");

    private String value;
    private String desc;

    private TableNameEnum(String value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
