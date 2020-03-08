package com.organization.community.service.impl;

import com.organization.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.organization.community.dao.MemberInfomationDao;
import com.organization.community.domain.MemberInfomationDO;
import com.organization.community.service.MemberInfomationService;



@Service
public class MemberInfomationServiceImpl implements MemberInfomationService {
	@Autowired
	private MemberInfomationDao memberInfomationDao;

	@Override
	public MemberInfomationDO get(Integer id){
		return memberInfomationDao.get(id);
	}

	@Override
	public List<MemberInfomationDO> list(Map<String, Object> map){
		return memberInfomationDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return memberInfomationDao.count(map);
	}

	@Override
	public int save(MemberInfomationDO memberInfomation){
		String name = ShiroUtils.getUser().getUsername();
		memberInfomation.setPreparer(name);
		return memberInfomationDao.save(memberInfomation);
	}

	@Override
	public int update(MemberInfomationDO memberInfomation){
		String name = ShiroUtils.getUser().getUsername();
		memberInfomation.setPreparer(name);
		memberInfomation.setUpdateTime(new Date());
		return memberInfomationDao.update(memberInfomation);
	}

	@Override
	public int remove(Integer id){
		return memberInfomationDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids){
		return memberInfomationDao.batchRemove(ids);
	}

}
