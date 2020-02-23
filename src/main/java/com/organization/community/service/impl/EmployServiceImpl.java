package com.organization.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.organization.community.dao.EmployDao;
import com.organization.community.domain.EmployDO;
import com.organization.community.service.EmployService;



@Service
public class EmployServiceImpl implements EmployService {
	@Autowired
	private EmployDao employDao;

	@Override
	public EmployDO get(Integer id){
		return employDao.get(id);
	}

	@Override
	public List<EmployDO> list(Map<String, Object> map){
		return employDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return employDao.count(map);
	}

	@Override
	public int save(EmployDO employ){
		return employDao.save(employ);
	}

	@Override
	public int update(EmployDO employ){
		return employDao.update(employ);
	}

	@Override
	public int remove(Integer id){
		return employDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids){
		return employDao.batchRemove(ids);
	}

	@Override
	public EmployDO getOne(Integer organId) {
		Map map = new HashMap();
		map.put("organInfoId",organId);
		map.put("sort","year");
		map.put("order","desc");
		map.put("offset",0);
		map.put("limit",1);
		List<EmployDO> list = employDao.list(map);
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

}
