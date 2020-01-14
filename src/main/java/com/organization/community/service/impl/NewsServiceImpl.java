package com.organization.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.organization.community.dao.NewsDao;
import com.organization.community.domain.NewsDO;
import com.organization.community.service.NewsService;



@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsDao;

	@Override
	public NewsDO get(Integer id){
		return newsDao.get(id);
	}

	@Override
	public List<NewsDO> list(Map<String, Object> map){
		return newsDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return newsDao.count(map);
	}

	@Override
	public int save(NewsDO news){

		return newsDao.save(news);
	}

	@Override
	public int update(NewsDO news){
		news.setUpdateTime(new Date());
		return newsDao.update(news);
	}

	@Override
	public int remove(Integer id){
		return newsDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids){
		return newsDao.batchRemove(ids);
	}

}
