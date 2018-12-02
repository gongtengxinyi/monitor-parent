package com.monitor.data.dto;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0  Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:10.8860000+08:00
* Version 1.0
*/
public class ContentDto implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public ContentDto() {
    }
	/*
    public ContentDto(String warehouseNo, String distributeNo, String orgNo) {
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
     * 内容类目ID
     */
	private Long categoryId;
	/**
     * 内容标题
     */
	private String title;
	/**
     * 子标题
     */
	private String subTitle;
	/**
     * 标题描述
     */
	private String titleDesc;
	/**
     * 链接
     */
	private String url;
	/**
     * 图片绝对路径
     */
	private String pic;
	/**
     * 图片2
     */
	private String pic2;
	/**
     * 内容
     */
	private String content;
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
     * get内容类目ID
     */
	public Long getCategoryId() {
		return categoryId;
	}

    /**
     * set内容类目ID
     */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
     * get内容标题
     */
	public String getTitle() {
		return title;
	}

    /**
     * set内容标题
     */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
     * get子标题
     */
	public String getSubTitle() {
		return subTitle;
	}

    /**
     * set子标题
     */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	/**
     * get标题描述
     */
	public String getTitleDesc() {
		return titleDesc;
	}

    /**
     * set标题描述
     */
	public void setTitleDesc(String titleDesc) {
		this.titleDesc = titleDesc;
	}
	/**
     * get链接
     */
	public String getUrl() {
		return url;
	}

    /**
     * set链接
     */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
     * get图片绝对路径
     */
	public String getPic() {
		return pic;
	}

    /**
     * set图片绝对路径
     */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
     * get图片2
     */
	public String getPic2() {
		return pic2;
	}

    /**
     * set图片2
     */
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	/**
     * get内容
     */
	public String getContent() {
		return content;
	}

    /**
     * set内容
     */
	public void setContent(String content) {
		this.content = content;
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