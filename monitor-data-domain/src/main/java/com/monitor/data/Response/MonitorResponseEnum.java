package com.monitor.data.Response;

/**
 * 错误code 自定义封装
 */
public enum MonitorResponseEnum {
    SUCCESS(1, "成功"),
    ERROR(2, "服务器错误"),
    FAIL(3, "返回失败");

    private int value;
    private String desc;

    private MonitorResponseEnum(int value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
