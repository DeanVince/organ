package com.organization.pre.dao;

import com.organization.pre.domain.TypeDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 机构类别
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 15:03:29
 */
@Mapper
public interface TypeDao {

	TypeDO get(Integer id);

	List<TypeDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(TypeDO type);

	int update(TypeDO type);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
