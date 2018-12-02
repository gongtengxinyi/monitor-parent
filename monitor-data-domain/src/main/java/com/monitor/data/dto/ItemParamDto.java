package com.monitor.data.dto;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0 商品规则参数 Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.2920000+08:00
* Version 1.0
*/
public class ItemParamDto implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public ItemParamDto() {
    }
	/*
    public ItemParamDto(String warehouseNo, String distributeNo, String orgNo) {
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
     * 商品类目ID
     */
	private Long itemCatId;
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
     * get商品类目ID
     */
	public Long getItemCatId() {
		return itemCatId;
	}

    /**
     * set商品类目ID
     */
	public void setItemCatId(Long itemCatId) {
		this.itemCatId = itemCatId;
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