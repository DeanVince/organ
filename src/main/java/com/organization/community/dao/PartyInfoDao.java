package com.organization.community.dao;

import com.organization.community.domain.PartyInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 协会党建情况表
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:43
 */
@Mapper
public interface PartyInfoDao {

	PartyInfoDO get(Integer id);

	List<PartyInfoDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(PartyInfoDO partyInfo);

	int update(PartyInfoDO partyInfo);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
