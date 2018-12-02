package com.monitor.data.dao;

import com.monitor.data.pojo.OrderItem;

import java.util.List;

/**
 * monitor3.0 OrderItemDao 接口.
 * Version 1.0
 */
public interface OrderItemDao {

    /**
	* 可空字段过滤null值
	* @param orderItem
	* @return
	*/
	public int insertByOrderItem(OrderItem orderItem);
	
	/**
	* 可空字段过滤null值
	* @param orderItem
	* @return
	*/
	public int updateByOrderItem(OrderItem orderItem);

	/**
     * 获取OrgInfo ForList(
     * @param orderItem
     * @return List<OrgInfoDto>
     */
	public List<OrderItem> queryOrderItem(OrderItem orderItem);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param orderItem
	* @return
	*/
	public int delete(OrderItem orderItem);
}
