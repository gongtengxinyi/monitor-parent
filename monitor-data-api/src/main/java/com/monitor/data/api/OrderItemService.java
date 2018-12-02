package com.monitor.data.api;

import com.monitor.data.dto.OrderItemDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 OrderItemManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.5270000+08:00
 * Version 1.0
 */
public interface OrderItemService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取(
	* @param id
	* @return
	*/
	public OrderItemDto get(Long id);
	
	
	/**
	* 插入 
	* @param orderItemDto
	* @return
	*/
	public Long insert(OrderItemDto orderItemDto);
	
	
	/**
	* 插入   可空字段过滤null值
	* @param orderItemDto
	* @return
	*/
	public Long insertByOrderItem(OrderItemDto orderItemDto);
	
	/**
	* 更新所有字段 
	* @param orderItemDto
	* @return
	*/
	public Long update(OrderItemDto orderItemDto);
	
	/**
	* 更新   可空字段过滤null值
	* @param orderItemDto
	* @return
	*/
	public Long updateByOrderItem(OrderItemDto orderItemDto);
	
	/**
	* 逻辑删除 
	* @param orderItemDto
	* @return
	*/
	public Long delete(OrderItemDto orderItemDto);
	
	
	/**
	* 根据主键ID逻辑删除   
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取 ForList(
	* @param orderItemDto
	* @return List<OrderItemDto>
	*/
	public List<OrderItemDto> findPageList(Page page, OrderItemDto orderItemDto);
    	/**
	* 获取 ForList(
	* @param orderItemDto
	* @return List<OrderItemDto>
	*/
	public List<OrderItemDto> queryOrderItem(OrderItemDto orderItemDto);
}
