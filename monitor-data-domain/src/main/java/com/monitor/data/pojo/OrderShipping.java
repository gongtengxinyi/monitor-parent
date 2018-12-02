package com.monitor.data.pojo;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0  Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.5970000+08:00
* Version 1.0
*/
public class OrderShipping implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public OrderShipping() {
    }
	/*
    public OrderShippingDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * 订单ID
     */
	private Long orderId;
	/**
     * 收货人全名
     */
	private String receiverName;
	/**
     * 固定电话
     */
	private String receiverPhone;
	/**
     * 移动电话
     */
	private String receiverMobile;
	/**
     * 省份
     */
	private String receiverState;
	/**
     * 城市
     */
	private String receiverCity;
	/**
     * 区/县
     */
	private String receiverDistrict;
	/**
     * 收货地址，如：xx路xx号
     */
	private String receiverAddress;
	/**
     * 邮政编码,如：310001
     */
	private String receiverZip;
	/**
     * created
     */
	private Date created;
	/**
     * updated
     */
	private Date updated;
	/**
     * id
     */
	private Long id;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
     * get收货人全名
     */
	public String getReceiverName() {
		return receiverName;
	}

    /**
     * set收货人全名
     */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
     * get固定电话
     */
	public String getReceiverPhone() {
		return receiverPhone;
	}

    /**
     * set固定电话
     */
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	/**
     * get移动电话
     */
	public String getReceiverMobile() {
		return receiverMobile;
	}

    /**
     * set移动电话
     */
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	/**
     * get省份
     */
	public String getReceiverState() {
		return receiverState;
	}

    /**
     * set省份
     */
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	/**
     * get城市
     */
	public String getReceiverCity() {
		return receiverCity;
	}

    /**
     * set城市
     */
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	/**
     * get区/县
     */
	public String getReceiverDistrict() {
		return receiverDistrict;
	}

    /**
     * set区/县
     */
	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
	}
	/**
     * get收货地址，如：xx路xx号
     */
	public String getReceiverAddress() {
		return receiverAddress;
	}

    /**
     * set收货地址，如：xx路xx号
     */
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	/**
     * get邮政编码,如：310001
     */
	public String getReceiverZip() {
		return receiverZip;
	}

    /**
     * set邮政编码,如：310001
     */
	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
	}
	/**
     * getcreated
     */
	public Date getCreated() {
		return created;
	}

    /**
     * setcreated
     */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
     * getupdated
     */
	public Date getUpdated() {
		return updated;
	}

    /**
     * setupdated
     */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/**
     * getid
     */
	public Long getId() {
		return id;
	}

    /**
     * setid
     */
	public void setId(Long id) {
		this.id = id;
	}
}