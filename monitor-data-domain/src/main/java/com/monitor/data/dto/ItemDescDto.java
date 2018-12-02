package com.monitor.data.dto;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0 商品描述表 Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.2180000+08:00
* Version 1.0
*/
public class ItemDescDto implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public ItemDescDto() {
    }
	/*
    public ItemDescDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * 商品ID
     */
	private Long itemId;
	/**
     * 商品描述
     */
	private String itemDesc;
	/**
     * 创建时间
     */
	private Date created;
	/**
     * 更新时间
     */
	private Date updated;
	/**
     * id
     */
	private Long id;
  
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
     * get商品描述
     */
	public String getItemDesc() {
		return itemDesc;
	}

    /**
     * set商品描述
     */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
     * get创建时间
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