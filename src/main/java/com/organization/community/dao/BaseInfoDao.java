package com.organization.community.dao;

import com.organization.community.domain.InfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 社团基本情况表
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
@Mapper
public interface BaseInfoDao {

	InfoDO get(Integer id);

	List<InfoDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(InfoDO info);

	int update(InfoDO info);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
