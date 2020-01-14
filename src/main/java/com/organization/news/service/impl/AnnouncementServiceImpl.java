package com.organization.news.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.organization.news.dao.AnnouncementDao;
import com.organization.news.domain.AnnouncementDO;
import com.organization.news.service.AnnouncementService;



@Service
public class AnnouncementServiceImpl implements AnnouncementService {
	@Autowired
	private AnnouncementDao announcementDao;
	
	@Override
	public AnnouncementDO get(Integer id){
		return announcementDao.get(id);
	}
	
	@Override
	public List<AnnouncementDO> list(Map<String, Object> map){
		return announcementDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return announcementDao.count(map);
	}
	
	@Override
	public int save(AnnouncementDO announcement){
		return announcementDao.save(announcement);
	}
	
	@Override
	public int update(AnnouncementDO announcement){
		return announcementDao.update(announcement);
	}
	
	@Override
	public int remove(Integer id){
		return announcementDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return announcementDao.batchRemove(ids);
	}
	
}
