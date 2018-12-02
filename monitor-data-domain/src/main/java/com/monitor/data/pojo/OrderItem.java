package com.monitor.data.pojo;

import java.io.Serializable;

/**
* monitor3.0  Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.5220000+08:00
* Version 1.0
*/
public class OrderItem implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public OrderItem() {
    }
	/*
    public OrderItemDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * id
     */
	private String id;
	/**
     * 商品id
     */
	private String itemId;
	/**
     * 订单id
     */
	private String orderId;
	/**
     * 商品购买数量
     */
	private Integer num;
	/**
     * 商品标题
     */
	private String title;
	/**
     * 商品单价
     */
	private Long price;
	/**
     * 商品总金额
     */
	private Long totalFee;
	/**
     * 商品图片地址
     */
	private String picPath;
  
	/**
     * getid
     */
	public String getId() {
		return id;
	}

    /**
     * setid
     */
	public void setId(String id) {
		this.id = id;
	}
	/**
     * get商品id
     */
	public String getItemId() {
		return itemId;
	}

    /**
     * set商品id
     */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
     * get订单id
     */
	public String getOrderId() {
		return orderId;
	}

    /**
     * set订单id
     */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
     * get商品购买数量
     */
	public Integer getNum() {
		return num;
	}

    /**
     * set商品购买数量
     */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
     * get商品标题
     */
	public String getTitle() {
		return title;
	}

    /**
     * set商品标题
     */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
     * get商品单价
     */
	public Long getPrice() {
		return price;
	}

    /**
     * set商品单价
     */
	public void setPrice(Long price) {
		this.price = price;
	}
	/**
     * get商品总金额
     */
	public Long getTotalFee() {
		return totalFee;
	}

    /**
     * set商品总金额
     */
	public void setTotalFee(Long totalFee) {
		this.totalFee = totalFee;
	}
	/**
     * get商品图片地址
     */
	public String getPicPath() {
		return picPath;
	}

    /**
     * set商品图片地址
     */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
}