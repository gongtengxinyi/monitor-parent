package com.monitor.data.dao;

import com.monitor.data.pojo.ItemParam;

import java.util.List;

/**
 * monitor3.0 ItemParamDao 接口.
 * Version 1.0
 */
public interface ItemParamDao  {

    /**
	* 可空字段过滤null值
	* @param itemParam
	* @return
	*/
	public int insertByItemParam(ItemParam itemParam);
	
	/**
	* 可空字段过滤null值
	* @param itemParam
	* @return
	*/
	public int updateByItemParam(ItemParam itemParam);

	/**
     * 获取OrgInfo ForList(
     * @param itemParam
     * @return List<OrgInfoDto>
     */
	public List<ItemParam> queryItemParam(ItemParam itemParam);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param itemParam
	* @return
	*/
	public int delete(ItemParam itemParam);
}
