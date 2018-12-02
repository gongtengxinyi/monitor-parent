package com.monitor.data.api;

import com.monitor.data.dto.ItemDescDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ItemDescManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.2230000+08:00
 * Version 1.0
 */
public interface ItemDescService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取商品描述表(
	* @param id
	* @return
	*/
	public ItemDescDto get(Long id);
	
	
	/**
	* 插入 商品描述表
	* @param itemDescDto
	* @return
	*/
	public Long insert(ItemDescDto itemDescDto);
	
	
	/**
	* 插入 商品描述表  可空字段过滤null值
	* @param itemDescDto
	* @return
	*/
	public Long insertByItemDesc(ItemDescDto itemDescDto);
	
	/**
	* 更新所有字段 商品描述表
	* @param itemDescDto
	* @return
	*/
	public Long update(ItemDescDto itemDescDto);
	
	/**
	* 更新 商品描述表  可空字段过滤null值
	* @param itemDescDto
	* @return
	*/
	public Long updateByItemDesc(ItemDescDto itemDescDto);
	
	/**
	* 逻辑删除 
	* @param itemDescDto
	* @return
	*/
	public Long delete(ItemDescDto itemDescDto);
	
	
	/**
	* 根据主键ID逻辑删除 商品描述表  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取商品描述表 ForList(
	* @param itemDescDto
	* @return List<ItemDescDto>
	*/
	public List<ItemDescDto> findPageList(Page page, ItemDescDto itemDescDto);
    	/**
	* 获取商品描述表 ForList(
	* @param itemDescDto
	* @return List<ItemDescDto>
	*/
	public List<ItemDescDto> queryItemDesc(ItemDescDto itemDescDto);
}
