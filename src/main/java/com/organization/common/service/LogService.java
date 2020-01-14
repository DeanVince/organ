package com.organization.common.service;

import org.springframework.stereotype.Service;

import com.organization.common.domain.LogDO;
import com.organization.common.domain.PageDO;
import com.organization.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
