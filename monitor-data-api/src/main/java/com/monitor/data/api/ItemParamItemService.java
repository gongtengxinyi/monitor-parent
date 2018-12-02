package com.monitor.data.api;


import com.monitor.data.dto.ItemParamItemDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ItemParamItemManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.3660000+08:00
 * Version 1.0
 */
public interface ItemParamItemService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取商品规格和商品的关系表(
	* @param id
	* @return
	*/
	public ItemParamItemDto get(Long id);
	
	
	/**
	* 插入 商品规格和商品的关系表
	* @param itemParamItemDto
	* @return
	*/
	public Long insert(ItemParamItemDto itemParamItemDto);
	
	
	/**
	* 插入 商品规格和商品的关系表  可空字段过滤null值
	* @param itemParamItemDto
	* @return
	*/
	public Long insertByItemParamItem(ItemParamItemDto itemParamItemDto);
	
	/**
	* 更新所有字段 商品规格和商品的关系表
	* @param itemParamItemDto
	* @return
	*/
	public Long update(ItemParamItemDto itemParamItemDto);
	
	/**
	* 更新 商品规格和商品的关系表  可空字段过滤null值
	* @param itemParamItemDto
	* @return
	*/
	public Long updateByItemParamItem(ItemParamItemDto itemParamItemDto);
	
	/**
	* 逻辑删除 
	* @param itemParamItemDto
	* @return
	*/
	public Long delete(ItemParamItemDto itemParamItemDto);
	
	
	/**
	* 根据主键ID逻辑删除 商品规格和商品的关系表  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取商品规格和商品的关系表 ForList(
	* @param itemParamItemDto
	* @return List<ItemParamItemDto>
	*/
	public List<ItemParamItemDto> findPageList(Page page, ItemParamItemDto itemParamItemDto);
    	/**
	* 获取商品规格和商品的关系表 ForList(
	* @param itemParamItemDto
	* @return List<ItemParamItemDto>
	*/
	public List<ItemParamItemDto> queryItemParamItem(ItemParamItemDto itemParamItemDto);
}
