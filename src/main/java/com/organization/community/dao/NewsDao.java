package com.organization.community.dao;

import com.organization.community.domain.NewsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 社团新闻表
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */
@Mapper
public interface NewsDao {

	NewsDO get(Integer id);

	List<NewsDO> list(Map<String, Object> map);

	List<NewsDO> preList(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(NewsDO news);

	int update(NewsDO news);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
