package com.monitor.data.pojo;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0 商品类目 Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.1440000+08:00
* Version 1.0
*/
public class ItemCat implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public ItemCat() {
    }
	/*
    public ItemCatDto(String warehouseNo, String distributeNo, String orgNo) {
        this.warehouseNo = warehouseNo;
        this.distributeNo = distributeNo;
        this.orgNo = orgNo;
		
    }
	*/

	/**
     * 类目ID
     */
	private Long id;
	/**
     * 父类目ID=0时，代表的是一级的类目
     */
	private Long parentId;
	/**
     * 类目名称
     */
	private String name;
	/**
     * 状态。可选值:1(正常),2(删除)
     */
	private Integer status;
	/**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
	private Integer sortOrder;
	/**
     * 该类目是否为父类目，1为true，0为false
     */
	private Integer isParent;
	/**
     * 创建时间
     */
	private Date created;
	/**
     * 创建时间
     */
	private Date updated;
  
	/**
     * get类目ID
     */
	public Long getId() {
		return id;
	}

    /**
     * set类目ID
     */
	public void setId(Long id) {
		this.id = id;
	}
	/**
     * get父类目ID=0时，代表的是一级的类目
     */
	public Long getParentId() {
		return parentId;
	}

    /**
     * set父类目ID=0时，代表的是一级的类目
     */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
     * get类目名称
     */
	public String getName() {
		return name;
	}

    /**
     * set类目名称
     */
	public void setName(String name) {
		this.name = name;
	}
	/**
     * get状态。可选值:1(正常),2(删除)
     */
	public Integer getStatus() {
		return status;
	}

    /**
     * set状态。可选值:1(正常),2(删除)
     */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
     * get排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
	public Integer getSortOrder() {
		return sortOrder;
	}

    /**
     * set排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
     * get该类目是否为父类目，1为true，0为false
     */
	public Integer getIsParent() {
		return isParent;
	}

    /**
     * set该类目是否为父类目，1为true，0为false
     */
	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
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
     * get创建时间
     */
	public Date getUpdated() {
		return updated;
	}

    /**
     * set创建时间
     */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}