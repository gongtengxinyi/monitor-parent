package com.monitor.data.dao;

import com.monitor.data.pojo.ContentCategory;

import java.util.List;

/**
 * monitor3.0 ContentCategoryDao 接口.
 * Version 1.0
 */
public interface ContentCategoryDao{

    /**
	* 可空字段过滤null值
	* @param contentCategory
	* @return
	*/
	public int insertByContentCategory(ContentCategory contentCategory);
	
	/**
	* 可空字段过滤null值
	* @param contentCategory
	* @return
	*/
	public int updateByContentCategory(ContentCategory contentCategory);

	/**
     * 获取OrgInfo ForList(
     * @param contentCategory
     * @return List<OrgInfoDto>
     */
	public List<ContentCategory> queryContentCategory(ContentCategory contentCategory);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param contentCategory
	* @return
	*/
	public int delete(ContentCategory contentCategory);
}
