package com.organization.community.dao;

import com.organization.community.domain.MemberInfomationDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 协会会员情况
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
@Mapper
public interface MemberInfomationDao {

	MemberInfomationDO get(Integer id);

	List<MemberInfomationDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(MemberInfomationDO memberInfomation);

	int update(MemberInfomationDO memberInfomation);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
