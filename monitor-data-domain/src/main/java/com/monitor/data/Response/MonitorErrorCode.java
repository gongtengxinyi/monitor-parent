package com.monitor.data.Response;

/**
 * 错误code 自定义封装
 */
public enum MonitorErrorCode {
    NULL_OBJ("E001", "对象为空"),
    ERROR_ADD_USER("E002", "添加用户失败"),
    UNKNOWN_ERROR("E003", "系统繁忙，请稍后再试....");

    private String value;
    private String desc;

    private MonitorErrorCode(String value, String desc) {
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
