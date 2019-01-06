package com.monitor.data.dao;


import com.monitor.data.dto.UserDto;
import com.monitor.data.pojo.User;

import java.util.List;

/**
 * monitor3.0 UserDao 接口.
 * Version 1.0
 */
public interface UserDao {

    /**
	* 可空字段过滤null值
	* @param user
	* @return
	*/
	public int insertByUser(User user);
	
	/**
	* 可空字段过滤null值
	* @param user
	* @return
	*/
	public int updateByUser(User user);

	/**
     * 获取OrgInfo ForList(
     * @param user
     * @return List<OrgInfoDto>
     */
	public List<User> queryUser(User user);
	
	/**
	* 根据主键ID逻辑删除  
	* @param id
	* @return
	*/
	public int deleteByPrimaryKey(Long id);

		/**
	* 逻辑删除 
	* @param user
	* @return
	*/
	public int delete(User user);

	List<User> findListByDto(UserDto userDto);
}
