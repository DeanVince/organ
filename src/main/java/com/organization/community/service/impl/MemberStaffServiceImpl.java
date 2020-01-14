package com.organization.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
		return memberStaffDao.save(memberStaff);
	}
	
	@Override
	public int update(MemberStaffDO memberStaff){
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
	
}
