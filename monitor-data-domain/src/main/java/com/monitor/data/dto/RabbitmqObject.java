package com.monitor.data.dto;

/**
 * 统一封装一下消息体
 */
public class RabbitmqObject {
    private Integer bizType;//业务区分
    private Object object;

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
