package com.monitor.data.api;

import com.monitor.data.dto.ContentCategoryDto;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

/**
 * 物流云 ContentCategoryManager 接口.
 * Author： dingjianlei@jd.com
 * DateTime: 2018-12-01T22:57:10.9920000+08:00
 * Version 1.0
 */
public interface ContentCategoryService{
	
	/**
	 * 测试服务可用性的方法
	 * @param message
	 * @return
	 */
	public String echo(String message);
		
	/**
	* 获取内容分类(
	* @param id
	* @return
	*/
	public ContentCategoryDto get(Long id);
	
	
	/**
	* 插入 内容分类
	* @param contentCategoryDto
	* @return
	*/
	public Long insert(ContentCategoryDto contentCategoryDto);
	
	
	/**
	* 插入 内容分类  可空字段过滤null值
	* @param contentCategoryDto
	* @return
	*/
	public Long insertByContentCategory(ContentCategoryDto contentCategoryDto);
	
	/**
	* 更新所有字段 内容分类
	* @param contentCategoryDto
	* @return
	*/
	public Long update(ContentCategoryDto contentCategoryDto);
	
	/**
	* 更新 内容分类  可空字段过滤null值
	* @param contentCategoryDto
	* @return
	*/
	public Long updateByContentCategory(ContentCategoryDto contentCategoryDto);
	
	/**
	* 逻辑删除 
	* @param contentCategoryDto
	* @return
	*/
	public Long delete(ContentCategoryDto contentCategoryDto);
	
	
	/**
	* 根据主键ID逻辑删除 内容分类  
	* @param id
	* @return
	*/
	public Long deleteByPrimaryKey(Long id);
	
	/**
	* 获取内容分类 ForList(
	* @param contentCategoryDto
	* @return List<ContentCategoryDto>
	*/
	public List<ContentCategoryDto> findPageList(Page page, ContentCategoryDto contentCategoryDto);
    	/**
	* 获取内容分类 ForList(
	* @param contentCategoryDto
	* @return List<ContentCategoryDto>
	*/
	public List<ContentCategoryDto> queryContentCategory(ContentCategoryDto contentCategoryDto);
}
