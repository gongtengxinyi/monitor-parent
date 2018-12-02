package com.monitor.data.api;

import com.monitor.data.dto.ContentDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ContentManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:10.9030000+08:00
 * Version 1.0
 */
public interface ContentService{
	
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
	public ContentDto get(Long id);
	
	
	/**
	* 插入 
	* @param contentDto
	* @return
	*/
	public Long insert(ContentDto contentDto);
	
	
	/**
	* 插入   可空字段过滤null值
	* @param contentDto
	* @return
	*/
	public Long insertByContent(ContentDto contentDto);
	
	/**
	* 更新所有字段 
	* @param contentDto
	* @return
	*/
	public Long update(ContentDto contentDto);
	
	/**
	* 更新   可空字段过滤null值
	* @param contentDto
	* @return
	*/
	public Long updateByContent(ContentDto contentDto);
	
	/**
	* 逻辑删除 
	* @param contentDto
	* @return
	*/
	public Long delete(ContentDto contentDto);
	
	
	/**
	* 根据主键ID逻辑删除   
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取 ForList(
	* @param contentDto
	* @return List<ContentDto>
	*/
	public List<ContentDto> findPageList(Page page, ContentDto contentDto);
    	/**
	* 获取 ForList(
	* @param contentDto
	* @return List<ContentDto>
	*/
	public List<ContentDto> queryContent(ContentDto contentDto);
}
