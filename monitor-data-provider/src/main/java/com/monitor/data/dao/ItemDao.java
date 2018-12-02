package com.monitor.data.dao;


import com.monitor.data.pojo.Item;

import java.util.List;

/**
 * monitor3.0 ItemDao 接口.
 * Version 1.0
 */
public interface ItemDao {

    /**
	* 可空字段过滤null值
	* @param item
	* @return
	*/
	public int insertByItem(Item item);
	
	/**
	* 可空字段过滤null值
	* @param item
	* @return
	*/
	public int updateByItem(Item item);

	/**
     * 获取OrgInfo ForList(
     * @param item
     * @return List<OrgInfoDto>
     */
	public List<Item> queryItem(Item item);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param item
	* @return
	*/
	public int delete(Item item);
}
