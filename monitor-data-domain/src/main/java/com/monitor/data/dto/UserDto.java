package com.monitor.data.dto;

import java.io.Serializable;
import java.util.Date;

/**
* monitor3.0 用户表 Domain 实体类
* Author:dingjianlei@jd.com
* DateTime:2018-12-01T22:57:11.6800000+08:00
* Version 1.0
*/
public class UserDto implements Serializable {

    /**
     *
     */
    private static final Long serialVersionUID = 1L;
	
		public UserDto() {
    }
	/*
    public UserDto(String warehouseNo, String distributeNo, String orgNo) {
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
     * 用户名
     */
	private String username;
	/**
     * 密码，加密存储
     */
	private String password;
	/**
     * 注册手机号
     */
	private String phone;
	/**
     * 注册邮箱
     */
	private String email;
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
     * get用户名
     */
	public String getUsername() {
		return username;
	}

    /**
     * set用户名
     */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
     * get密码，加密存储
     */
	public String getPassword() {
		return password;
	}

    /**
     * set密码，加密存储
     */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
     * get注册手机号
     */
	public String getPhone() {
		return phone;
	}

    /**
     * set注册手机号
     */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
     * get注册邮箱
     */
	public String getEmail() {
		return email;
	}

    /**
     * set注册邮箱
     */
	public void setEmail(String email) {
		this.email = email;
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