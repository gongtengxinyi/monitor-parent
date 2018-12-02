package com.monitor.data.api;

import com.monitor.data.dto.OrderShippingDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 OrderShippingManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.6030000+08:00
 * Version 1.0
 */
public interface OrderShippingService{
	
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
	public OrderShippingDto get(Long id);
	
	
	/**
	* 插入 
	* @param orderShippingDto
	* @return
	*/
	public Long insert(OrderShippingDto orderShippingDto);
	
	
	/**
	* 插入   可空字段过滤null值
	* @param orderShippingDto
	* @return
	*/
	public Long insertByOrderShipping(OrderShippingDto orderShippingDto);
	
	/**
	* 更新所有字段 
	* @param orderShippingDto
	* @return
	*/
	public Long update(OrderShippingDto orderShippingDto);
	
	/**
	* 更新   可空字段过滤null值
	* @param orderShippingDto
	* @return
	*/
	public Long updateByOrderShipping(OrderShippingDto orderShippingDto);
	
	/**
	* 逻辑删除 
	* @param orderShippingDto
	* @return
	*/
	public Long delete(OrderShippingDto orderShippingDto);
	
	
	/**
	* 根据主键ID逻辑删除   
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取 ForList(
	* @param orderShippingDto
	* @return List<OrderShippingDto>
	*/
	public List<OrderShippingDto> findPageList(Page page, OrderShippingDto orderShippingDto);
    	/**
	* 获取 ForList(
	* @param orderShippingDto
	* @return List<OrderShippingDto>
	*/
	public List<OrderShippingDto> queryOrderShipping(OrderShippingDto orderShippingDto);
}
