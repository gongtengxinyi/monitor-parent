package com.monitor.data.dao;


import com.monitor.data.pojo.ItemCat;

import java.util.List;

/**
 * monitor3.0 ItemCatDao 接口.
 * Version 1.0
 */
public interface ItemCatDao{

    /**
	* 可空字段过滤null值
	* @param itemCat
	* @return
	*/
	public int insertByItemCat(ItemCat itemCat);
	
	/**
	* 可空字段过滤null值
	* @param itemCat
	* @return
	*/
	public int updateByItemCat(ItemCat itemCat);

	/**
     * 获取OrgInfo ForList(
     * @param itemCat
     * @return List<OrgInfoDto>
     */
	public List<ItemCat> queryItemCat(ItemCat itemCat);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param itemCat
	* @return
	*/
	public int delete(ItemCat itemCat);
}
