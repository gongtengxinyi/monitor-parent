package com.monitor.data.api;


import com.monitor.data.dto.ItemParamDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ItemParamManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.2960000+08:00
 * Version 1.0
 */
public interface ItemParamService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取商品规则参数(
	* @param id
	* @return
	*/
	public ItemParamDto get(Long id);
	
	
	/**
	* 插入 商品规则参数
	* @param itemParamDto
	* @return
	*/
	public Long insert(ItemParamDto itemParamDto);
	
	
	/**
	* 插入 商品规则参数  可空字段过滤null值
	* @param itemParamDto
	* @return
	*/
	public Long insertByItemParam(ItemParamDto itemParamDto);
	
	/**
	* 更新所有字段 商品规则参数
	* @param itemParamDto
	* @return
	*/
	public Long update(ItemParamDto itemParamDto);
	
	/**
	* 更新 商品规则参数  可空字段过滤null值
	* @param itemParamDto
	* @return
	*/
	public Long updateByItemParam(ItemParamDto itemParamDto);
	
	/**
	* 逻辑删除 
	* @param itemParamDto
	* @return
	*/
	public Long delete(ItemParamDto itemParamDto);
	
	
	/**
	* 根据主键ID逻辑删除 商品规则参数  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取商品规则参数 ForList(
	* @param itemParamDto
	* @return List<ItemParamDto>
	*/
	public List<ItemParamDto> findPageList(Page page, ItemParamDto itemParamDto);
    	/**
	* 获取商品规则参数 ForList(
	* @param itemParamDto
	* @return List<ItemParamDto>
	*/
	public List<ItemParamDto> queryItemParam(ItemParamDto itemParamDto);
}
