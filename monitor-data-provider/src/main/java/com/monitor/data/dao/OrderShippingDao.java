package com.monitor.data.dao;


import com.monitor.data.pojo.OrderShipping;

import java.util.List;

/**
 * monitor3.0 OrderShippingDao 接口.
 * Version 1.0
 */
public interface OrderShippingDao  {

    /**
	* 可空字段过滤null值
	* @param orderShipping
	* @return
	*/
	public int insertByOrderShipping(OrderShipping orderShipping);
	
	/**
	* 可空字段过滤null值
	* @param orderShipping
	* @return
	*/
	public int updateByOrderShipping(OrderShipping orderShipping);

	/**
     * 获取OrgInfo ForList(
     * @param orderShipping
     * @return List<OrgInfoDto>
     */
	public List<OrderShipping> queryOrderShipping(OrderShipping orderShipping);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param orderShipping
	* @return
	*/
	public int delete(OrderShipping orderShipping);
}
