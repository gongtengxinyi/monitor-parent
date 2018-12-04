package com.monitor.data.api;

import com.monitor.data.Response.MonitorResponse;
import com.monitor.data.dto.UserDto;
import com.monitor.data.pojo.User;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 物流云 UserManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:11.6890000+08:00
 * Version 1.0
 */
public interface UserService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取用户表(
	* @param id
	* @return
	*/
	public UserDto get(Long id);
	
	
	/**
	* 插入 用户表
	* @param userDto
	* @return
	*/
	public Long insert(UserDto userDto);
	
	
	/**
	* 插入 用户表  可空字段过滤null值
	* @param userDto
	* @return
	*/
	public Long insertByUser(UserDto userDto);
	
	/**
	* 更新所有字段 用户表
	* @param userDto
	* @return
	*/
	public Long update(UserDto userDto);
	
	/**
	* 更新 用户表  可空字段过滤null值
	* @param userDto
	* @return
	*/
	public Long updateByUser(UserDto userDto);
	
	/**
	* 逻辑删除 
	* @param userDto
	* @return
	*/
	public Long delete(UserDto userDto);
	
	
	/**
	* 根据主键ID逻辑删除 用户表  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);

    	/**
	* 获取用户表 ForList(
	* @param userDto
	* @return List<UserDto>
	*/
	public List<UserDto> queryUser(UserDto userDto);

    MonitorResponse login(User user, HttpServletResponse response);

    MonitorResponse getUserLoginToken(User user);

    User getUserByLoginId(User user);
}
