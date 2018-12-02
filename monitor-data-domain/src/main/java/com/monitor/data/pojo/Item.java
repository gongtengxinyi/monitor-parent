package com.monitor.data.pojo;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0 商品表 Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.0650000+08:00
* Version 1.0
*/
public class Item implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public Item() {
    }
	/*
    public ItemDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * 商品id，同时也是商品编号
     */
	private Long id;
	/**
     * 商品标题
     */
	private String title;
	/**
     * 商品卖点
     */
	private String sellPoint;
	/**
     * 商品价格，单位为：分
     */
	private Long price;
	/**
     * 库存数量
     */
	private int num;
	/**
     * 商品条形码
     */
	private String barcode;
	/**
     * 商品图片
     */
	private String image;
	/**
     * 所属类目，叶子类目
     */
	private Long cid;
	/**
     * 商品状态，1-正常，2-下架，3-删除
     */
	private Integer status;
	/**
     * 创建时间
     */
	private Date created;
	/**
     * 更新时间
     */
	private Date updated;

	/**
     * get商品id，同时也是商品编号
     */
	public Long getId() {
		return id;
	}

    /**
     * set商品id，同时也是商品编号
     */
	public void setId(Long id) {
		this.id = id;
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
     * get商品卖点
     */
	public String getSellPoint() {
		return sellPoint;
	}

    /**
     * set商品卖点
     */
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	/**
     * get商品价格，单位为：分
     */
	public Long getPrice() {
		return price;
	}

    /**
     * set商品价格，单位为：分
     */
	public void setPrice(Long price) {
		this.price = price;
	}
	/**
     * get库存数量
     */
	public int getNum() {
		return num;
	}

    /**
     * set库存数量
     */
	public void setNum(int num) {
		this.num = num;
	}
	/**
     * get商品条形码
     */
	public String getBarcode() {
		return barcode;
	}

    /**
     * set商品条形码
     */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
     * get商品图片
     */
	public String getImage() {
		return image;
	}

    /**
     * set商品图片
     */
	public void setImage(String image) {
		this.image = image;
	}
	/**
     * get所属类目，叶子类目
     */
	public Long getCid() {
		return cid;
	}

    /**
     * set所属类目，叶子类目
     */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
     * get商品状态，1-正常，2-下架，3-删除
     */

	public Date getCreated() {
		return created;
	}

    /**
     * set创建时间
     */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
     * get更新时间
     */
	public Date getUpdated() {
		return updated;
	}

    /**
     * set更新时间
     */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}