package com.organization.community.service.impl;

import com.organization.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
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
		String name = ShiroUtils.getUser().getUsername();
		partyInfo.setPreparer(name);
		return partyInfoDao.save(partyInfo);
	}

	@Override
	public int update(PartyInfoDO partyInfo){
		String name = ShiroUtils.getUser().getUsername();
		partyInfo.setPreparer(name);
		partyInfo.setUpdateTime(new Date());
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

	@Override
	public PartyInfoDO getOne(Integer organId) {
		Map map = new HashMap(5);
		map.put("organInfoId",organId);
		map.put("sort","year");
		map.put("order","desc");
		map.put("offset",0);
		map.put("limit",1);
		List<PartyInfoDO> list = partyInfoDao.list(map);
		if (!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

}
