package com.organization.community.service;

import com.organization.community.domain.NewsDO;

import java.util.List;
import java.util.Map;

/**
 * 社团新闻表
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
public interface NewsService {
	
	NewsDO get(Integer id);
	
	List<NewsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NewsDO news);
	
	int update(NewsDO news);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
