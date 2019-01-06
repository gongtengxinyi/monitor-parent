package com.monitor.data.Enum;

public enum RabbitBizType {
    ORDER(1, "订单同步ES"),
    MASTERDATA(2, "基础数据缓存同步redis"),
    OTHER(3, "其他应用");
    private Integer bizType;
    private String desc;
    RabbitBizType(Integer bizType, String desc) {
        this.bizType = bizType;
        this.desc = desc;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
