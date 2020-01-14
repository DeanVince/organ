package com.organization.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.organization.community.dao.DirectorInfoDao;
import com.organization.community.domain.DirectorInfoDO;
import com.organization.community.service.DirectorInfoService;



@Service
public class DirectorInfoServiceImpl implements DirectorInfoService {
	@Autowired
	private DirectorInfoDao directorInfoDao;
	
	@Override
	public DirectorInfoDO get(Integer id){
		return directorInfoDao.get(id);
	}
	
	@Override
	public List<DirectorInfoDO> list(Map<String, Object> map){
		return directorInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return directorInfoDao.count(map);
	}
	
	@Override
	public int save(DirectorInfoDO directorInfo){
		return directorInfoDao.save(directorInfo);
	}
	
	@Override
	public int update(DirectorInfoDO directorInfo){
		return directorInfoDao.update(directorInfo);
	}
	
	@Override
	public int remove(Integer id){
		return directorInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return directorInfoDao.batchRemove(ids);
	}
	
}
