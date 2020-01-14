package com.organization.community.service.impl;

import com.organization.common.utils.ShiroUtils;
import com.organization.community.dao.BaseInfoDao;
import com.organization.community.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.organization.community.domain.InfoDO;


/**
 * @author Vince
 */
@Service
public class BaseInfoServiceImpl implements BaseInfoService {
	@Autowired
	private BaseInfoDao infoDao;

	@Override
	public InfoDO get(Integer id){
		return infoDao.get(id);
	}

	@Override
	public List<InfoDO> list(Map<String, Object> map){
		return infoDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return infoDao.count(map);
	}

	@Override
	public int save(InfoDO info){
		info.setPreparer(ShiroUtils.getUser().getUsername());
		info.setUpdateTime(new Date());
		return infoDao.save(info);
	}

	@Override
	public int update(InfoDO info){
		info.setUpdateTime(new Date());
		return infoDao.update(info);
	}

	@Override
	public int remove(Integer id){
		return infoDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids){
		return infoDao.batchRemove(ids);
	}

}
