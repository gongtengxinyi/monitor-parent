package com.monitor.data.dao;


import com.monitor.data.pojo.ItemParamItem;

import java.util.List;

/**
 * monitor3.0 ItemParamItemDao 接口.
 * Version 1.0
 */
public interface ItemParamItemDao {

    /**
	* 可空字段过滤null值
	* @param itemParamItem
	* @return
	*/
	public int insertByItemParamItem(ItemParamItem itemParamItem);
	
	/**
	* 可空字段过滤null值
	* @param itemParamItem
	* @return
	*/
	public int updateByItemParamItem(ItemParamItem itemParamItem);

	/**
     * 获取OrgInfo ForList(
     * @param itemParamItem
     * @return List<OrgInfoDto>
     */
	public List<ItemParamItem> queryItemParamItem(ItemParamItem itemParamItem);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param itemParamItem
	* @return
	*/
	public int delete(ItemParamItem itemParamItem);
}
