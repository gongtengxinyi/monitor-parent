package com.monitor.data.api;

import com.monitor.data.dto.ItemDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ItemManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.0710000+08:00
 * Version 1.0
 */
public interface ItemService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取商品表(
	* @param id
	* @return
	*/
	public ItemDto get(Long id);
	
	
	/**
	* 插入 商品表
	* @param itemDto
	* @return
	*/
	public Long insert(ItemDto itemDto);
	
	
	/**
	* 插入 商品表  可空字段过滤null值
	* @param itemDto
	* @return
	*/
	public Long insertByItem(ItemDto itemDto);
	
	/**
	* 更新所有字段 商品表
	* @param itemDto
	* @return
	*/
	public Long update(ItemDto itemDto);
	
	/**
	* 更新 商品表  可空字段过滤null值
	* @param itemDto
	* @return
	*/
	public Long updateByItem(ItemDto itemDto);
	
	/**
	* 逻辑删除 
	* @param itemDto
	* @return
	*/
	public Long delete(ItemDto itemDto);
	
	
	/**
	* 根据主键ID逻辑删除 商品表  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取商品表 ForList(
	* @param itemDto
	* @return List<ItemDto>
	*/
	public List<ItemDto> findPageList(Page page, ItemDto itemDto);
    	/**
	* 获取商品表 ForList(
	* @param itemDto
	* @return List<ItemDto>
	*/
	public List<ItemDto> queryItem(ItemDto itemDto);
}
