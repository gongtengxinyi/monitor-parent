package com.monitor.data.dao;


import com.monitor.data.pojo.ItemDesc;

import java.util.List;

/**
 * monitor3.0 ItemDescDao 接口.
 * Version 1.0
 */
public interface ItemDescDao {

    /**
	* 可空字段过滤null值
	* @param itemDesc
	* @return
	*/
	public int insertByItemDesc(ItemDesc itemDesc);
	
	/**
	* 可空字段过滤null值
	* @param itemDesc
	* @return
	*/
	public int updateByItemDesc(ItemDesc itemDesc);

	/**
     * 获取OrgInfo ForList(
     * @param itemDesc
     * @return List<OrgInfoDto>
     */
	public List<ItemDesc> queryItemDesc(ItemDesc itemDesc);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param itemDesc
	* @return
	*/
	public int delete(ItemDesc itemDesc);
}
