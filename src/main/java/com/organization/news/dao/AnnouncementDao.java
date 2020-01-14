package com.organization.news.dao;

import com.organization.news.domain.AnnouncementDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 通知公告
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-07 23:43:46
 */
@Mapper
public interface AnnouncementDao {

	AnnouncementDO get(Integer id);
	
	List<AnnouncementDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(AnnouncementDO announcement);
	
	int update(AnnouncementDO announcement);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
