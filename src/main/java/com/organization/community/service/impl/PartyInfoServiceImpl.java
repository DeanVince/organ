package com.organization.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.organization.community.dao.PartyInfoDao;
import com.organization.community.domain.PartyInfoDO;
import com.organization.community.service.PartyInfoService;



@Service
public class PartyInfoServiceImpl implements PartyInfoService {
	@Autowired
	private PartyInfoDao partyInfoDao;
	
	@Override
	public PartyInfoDO get(Integer id){
		return partyInfoDao.get(id);
	}
	
	@Override
	public List<PartyInfoDO> list(Map<String, Object> map){
		return partyInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return partyInfoDao.count(map);
	}
	
	@Override
	public int save(PartyInfoDO partyInfo){
		return partyInfoDao.save(partyInfo);
	}
	
	@Override
	public int update(PartyInfoDO partyInfo){
		return partyInfoDao.update(partyInfo);
	}
	
	@Override
	public int remove(Integer id){
		return partyInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return partyInfoDao.batchRemove(ids);
	}
	
}
