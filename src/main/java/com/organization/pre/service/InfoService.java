package com.organization.pre.service;

import com.organization.pre.domain.InfoDO;

import java.util.List;
import java.util.Map;

/**
 * 机构基本信息
 * 
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 15:03:29
 */
public interface InfoService {
	
	InfoDO get(Integer id);
	
	List<InfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InfoDO info);
	
	int update(InfoDO info);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
