package com.monitor.data.pojo;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0  Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.4320000+08:00
* Version 1.0
*/
public class Order implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public Order() {
    }
	/*
    public OrderDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * 订单id
     */
	private Long id;
	/**
     * 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
	private String payment;
	/**
     * 支付类型，1、在线支付，2、货到付款
     */
	private Integer paymentType;
	/**
     * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
	private String postFee;
	/**
     * 状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
     */
	private Integer status;
	/**
     * 订单创建时间
     */
	private Date createTime;
	/**
     * 订单更新时间
     */
	private Date updateTime;
	/**
     * 付款时间
     */
	private Date paymentTime;
	/**
     * 发货时间
     */
	private Date consignTime;
	/**
     * 交易完成时间
     */
	private Date endTime;
	/**
     * 交易关闭时间
     */
	private Date closeTime;
	/**
     * 物流名称
     */
	private String shippingName;
	/**
     * 物流单号
     */
	private String shippingCode;
	/**
     * 用户id
     */
	private Long userId;
	/**
     * 买家留言
     */
	private String buyerMessage;
	/**
     * 买家昵称
     */
	private String buyerNick;
	/**
     * 买家是否已经评价
     */
	private Integer buyerRate;
  
	/**
     * get订单id
     */
	public Long getId() {
		return id;
	}

    /**
     * set订单id
     */
	public void setId(Long id) {
		this.id = id;
	}
	/**
     * get实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
	public String getPayment() {
		return payment;
	}

    /**
     * set实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
	public void setPayment(String payment) {
		this.payment = payment;
	}
	/**
     * get支付类型，1、在线支付，2、货到付款
     */
	public Integer getPaymentType() {
		return paymentType;
	}

    /**
     * set支付类型，1、在线支付，2、货到付款
     */
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	/**
     * get邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
	public String getPostFee() {
		return postFee;
	}

    /**
     * set邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}
	/**
     * get状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
     */
	public Integer getStatus() {
		return status;
	}

    /**
     * set状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭
     */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
     * get订单创建时间
     */
	public Date getCreateTime() {
		return createTime;
	}

    /**
     * set订单创建时间
     */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
     * get订单更新时间
     */
	public Date getUpdateTime() {
		return updateTime;
	}

    /**
     * set订单更新时间
     */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
     * get付款时间
     */
	public Date getPaymentTime() {
		return paymentTime;
	}

    /**
     * set付款时间
     */
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	/**
     * get发货时间
     */
	public Date getConsignTime() {
		return consignTime;
	}

    /**
     * set发货时间
     */
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}
	/**
     * get交易完成时间
     */
	public Date getEndTime() {
		return endTime;
	}

    /**
     * set交易完成时间
     */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
     * get交易关闭时间
     */
	public Date getCloseTime() {
		return closeTime;
	}

    /**
     * set交易关闭时间
     */
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	/**
     * get物流名称
     */
	public String getShippingName() {
		return shippingName;
	}

    /**
     * set物流名称
     */
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	/**
     * get物流单号
     */
	public String getShippingCode() {
		return shippingCode;
	}

    /**
     * set物流单号
     */
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	/**
     * get用户id
     */
	public Long getUserId() {
		return userId;
	}

    /**
     * set用户id
     */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
     * get买家留言
     */
	public String getBuyerMessage() {
		return buyerMessage;
	}

    /**
     * set买家留言
     */
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	/**
     * get买家昵称
     */
	public String getBuyerNick() {
		return buyerNick;
	}

    /**
     * set买家昵称
     */
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	/**
     * get买家是否已经评价
     */
	public Integer getBuyerRate() {
		return buyerRate;
	}

    /**
     * set买家是否已经评价
     */
	public void setBuyerRate(Integer buyerRate) {
		this.buyerRate = buyerRate;
	}
}