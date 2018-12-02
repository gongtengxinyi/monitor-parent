package com.monitor.data.dao;


import com.monitor.data.pojo.Content;

import java.util.List;

/**
 * monitor3.0 ContentDao 接口.
 * Version 1.0
 */
public interface ContentDao  {

    /**
	* 可空字段过滤null值
	* @param content
	* @return
	*/
	public int insertByContent(Content content);
	
	/**
	* 可空字段过滤null值
	* @param content
	* @return
	*/
	public int updateByContent(Content content);

	/**
     * 获取OrgInfo ForList(
     * @param content
     * @return List<OrgInfoDto>
     */
	public List<Content> queryContent(Content content);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param content
	* @return
	*/
	public int delete(Content content);
}
