package com.organization.news.service;

import com.organization.news.domain.AnnouncementDO;

import java.util.List;
import java.util.Map;

/**
 * 通知公告
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-07 23:43:46
 */
public interface AnnouncementService {
	
	AnnouncementDO get(Integer id);
	
	List<AnnouncementDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AnnouncementDO announcement);
	
	int update(AnnouncementDO announcement);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
