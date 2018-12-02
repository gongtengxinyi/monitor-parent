package com.monitor.data.api;

import com.monitor.data.dto.ItemCatDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ItemCatManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.1490000+08:00
 * Version 1.0
 */
public interface ItemCatService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取商品类目(
	* @param id
	* @return
	*/
	public ItemCatDto get(Long id);
	
	
	/**
	* 插入 商品类目
	* @param itemCatDto
	* @return
	*/
	public Long insert(ItemCatDto itemCatDto);
	
	
	/**
	* 插入 商品类目  可空字段过滤null值
	* @param itemCatDto
	* @return
	*/
	public Long insertByItemCat(ItemCatDto itemCatDto);
	
	/**
	* 更新所有字段 商品类目
	* @param itemCatDto
	* @return
	*/
	public Long update(ItemCatDto itemCatDto);
	
	/**
	* 更新 商品类目  可空字段过滤null值
	* @param itemCatDto
	* @return
	*/
	public Long updateByItemCat(ItemCatDto itemCatDto);
	
	/**
	* 逻辑删除 
	* @param itemCatDto
	* @return
	*/
	public Long delete(ItemCatDto itemCatDto);
	
	
	/**
	* 根据主键ID逻辑删除 商品类目  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取商品类目 ForList(
	* @param itemCatDto
	* @return List<ItemCatDto>
	*/
	public List<ItemCatDto> findPageList(Page page, ItemCatDto itemCatDto);
    	/**
	* 获取商品类目 ForList(
	* @param itemCatDto
	* @return List<ItemCatDto>
	*/
	public List<ItemCatDto> queryItemCat(ItemCatDto itemCatDto);
}
