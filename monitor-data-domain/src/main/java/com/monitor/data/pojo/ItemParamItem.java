package com.monitor.data.pojo;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0 商品规格和商品的关系表 Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.3610000+08:00
* Version 1.0
*/
public class ItemParamItem implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public ItemParamItem() {
    }
	/*
    public ItemParamItemDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * id
     */
	private Long id;
	/**
     * 商品ID
     */
	private Long itemId;
	/**
     * 参数数据，格式为json格式
     */
	private String paramData;
	/**
     * created
     */
	private Date created;
	/**
     * updated
     */
	private Date updated;
  
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
	/**
     * get商品ID
     */
	public Long getItemId() {
		return itemId;
	}

    /**
     * set商品ID
     */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	/**
     * get参数数据，格式为json格式
     */
	public String getParamData() {
		return paramData;
	}

    /**
     * set参数数据，格式为json格式
     */
	public void setParamData(String paramData) {
		this.paramData = paramData;
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
}