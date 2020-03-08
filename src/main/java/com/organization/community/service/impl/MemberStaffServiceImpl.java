package com.organization.community.service.impl;

import com.organization.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.organization.community.dao.MemberStaffDao;
import com.organization.community.domain.MemberStaffDO;
import com.organization.community.service.MemberStaffService;



@Service
public class MemberStaffServiceImpl implements MemberStaffService {
	@Autowired
	private MemberStaffDao memberStaffDao;

	@Override
	public MemberStaffDO get(Integer id){
		return memberStaffDao.get(id);
	}

	@Override
	public List<MemberStaffDO> list(Map<String, Object> map){
		return memberStaffDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return memberStaffDao.count(map);
	}

	@Override
	public int save(MemberStaffDO memberStaff){
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		memberStaff.setYear(year);
		String name = ShiroUtils.getUser().getUsername();
		memberStaff.setPreparer(name);
		return memberStaffDao.save(memberStaff);
	}

	@Override
	public int update(MemberStaffDO memberStaff){
		String name = ShiroUtils.getUser().getUsername();
		memberStaff.setPreparer(name);
		memberStaff.setUpdateTime(new Date());
		return memberStaffDao.update(memberStaff);
	}

	@Override
	public int remove(Integer id){
		return memberStaffDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids){
		return memberStaffDao.batchRemove(ids);
	}

	@Override
	public MemberStaffDO getOne(Integer comId) {
		Map map = new HashMap();
		map.put("organInfoId",comId);
		map.put("sort","year");
		map.put("order","desc");
		map.put("offset",0);
		map.put("limit",1);
		List<MemberStaffDO> list = memberStaffDao.list(map);
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

}
