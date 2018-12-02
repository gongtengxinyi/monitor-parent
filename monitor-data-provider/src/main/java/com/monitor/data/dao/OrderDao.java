package com.monitor.data.dao;

import com.monitor.data.datasource.DataSource;
import com.monitor.data.datasource.DataSources;
import com.monitor.data.pojo.Order;
import com.monitor.data.splitTable.TableSplit;

import java.util.List;

/**
 * monitor3.0 OrderDao 接口.
 * Version 1.0
 *
 *  @DataSource(DataSources.MASTER)
 *     Security selectByPrimaryKey(String fSecuritykey);
 *     @DataSource(DataSources.SLAVE)
 *     Security selectByPrimaryKey2(String fSecuritykey);
 *
 */

@TableSplit(value="order",strategy="order")
public interface OrderDao{

    /**
	* 可空字段过滤null值
	* @param order
	* @return
	*/
   @DataSource(DataSources.MASTER)
	public int insertByOrder(Order order);
	
	/**
	* 可空字段过滤null值
	* @param order
	* @return
	*/
	public int updateByOrder(Order order);

	/**
     * 获取OrgInfo ForList(
     * @param order
     * @return List<OrgInfoDto>
     */
	public List<Order> queryOrder(Order order);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param order
	* @return
	*/
	public int delete(Order order);
}
