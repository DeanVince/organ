package com.organization.community.dao;

import com.organization.community.domain.EmployDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 社团信息人员情况表
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
@Mapper
public interface EmployDao {

	EmployDO get(Integer id);

	List<EmployDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(EmployDO employ);

	int update(EmployDO employ);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
