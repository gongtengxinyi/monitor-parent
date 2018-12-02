package com.monitor.data.api;

import com.monitor.data.dto.OrderDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 OrderManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.4380000+08:00
 * Version 1.0
 */
public interface OrderService{
	
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
	public OrderDto get(Long id);
	
	
	/**
	* 插入 
	* @param orderDto
	* @return
	*/
	public Long insert(OrderDto orderDto);
	
	
	/**
	* 插入   可空字段过滤null值
	* @param orderDto
	* @return
	*/
	public Long insertByOrder(OrderDto orderDto);
	
	/**
	* 更新所有字段 
	* @param orderDto
	* @return
	*/
	public Long update(OrderDto orderDto);
	
	/**
	* 更新   可空字段过滤null值
	* @param orderDto
	* @return
	*/
	public Long updateByOrder(OrderDto orderDto);
	
	/**
	* 逻辑删除 
	* @param orderDto
	* @return
	*/
	public Long delete(OrderDto orderDto);
	
	
	/**
	* 根据主键ID逻辑删除   
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取 ForList(
	* @param orderDto
	* @return List<OrderDto>
	*/
	public List<OrderDto> findPageList(Page page, OrderDto orderDto);
    	/**
	* 获取 ForList(
	* @param orderDto
	* @return List<OrderDto>
	*/
	public List<OrderDto> queryOrder(OrderDto orderDto);
}
