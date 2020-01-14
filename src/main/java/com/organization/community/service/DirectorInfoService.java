package com.organization.community.service;

import com.organization.community.domain.DirectorInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 社团组织理事信息表
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:41
 */
public interface DirectorInfoService {
	
	DirectorInfoDO get(Integer id);
	
	List<DirectorInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DirectorInfoDO directorInfo);
	
	int update(DirectorInfoDO directorInfo);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
