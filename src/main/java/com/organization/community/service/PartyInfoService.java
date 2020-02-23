package com.organization.community.service;

import com.organization.community.domain.MemberStaffDO;
import com.organization.community.domain.PartyInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 协会党建情况表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:43
 */
public interface PartyInfoService {

	PartyInfoDO get(Integer id);

	List<PartyInfoDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(PartyInfoDO partyInfo);

	int update(PartyInfoDO partyInfo);

	int remove(Integer id);

	int batchRemove(Integer[] ids);

	PartyInfoDO getOne(Integer organId);
}
