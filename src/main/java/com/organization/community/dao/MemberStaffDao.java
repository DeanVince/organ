package com.organization.community.dao;

import com.organization.community.domain.MemberStaffDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 会员机构人数情况表
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
@Mapper
public interface MemberStaffDao {

	MemberStaffDO get(Integer id);

	List<MemberStaffDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(MemberStaffDO memberStaff);

	int update(MemberStaffDO memberStaff);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
