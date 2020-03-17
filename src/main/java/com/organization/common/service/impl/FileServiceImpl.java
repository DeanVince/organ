package com.organization.common.service.impl;

import com.organization.common.config.OrganConfig;
import com.organization.common.utils.ShiroUtils;
import com.organization.system.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.organization.common.dao.FileDao;
import com.organization.common.domain.FileDO;
import com.organization.common.service.FileService;
import org.springframework.util.StringUtils;


@Service
public class FileServiceImpl implements FileService {
	@Autowired
	private FileDao sysFileMapper;

	@Autowired
	private OrganConfig organConfig;
	@Override
	public FileDO get(Long id){
		return sysFileMapper.get(id);
	}

	@Override
	public List<FileDO> list(Map<String, Object> map){
		UserDO user = ShiroUtils.getUser();
		if(!"admin".equals(user.getUsername())){
			map.put("deptId",user.getDeptId() );
		}
		return sysFileMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		UserDO user = ShiroUtils.getUser();
		if(!"admin".equals(user.getUsername())){
			map.put("deptId",user.getDeptId() );
		}
		return sysFileMapper.count(map);
	}

	@Override
	public int save(FileDO sysFile){
		UserDO user = ShiroUtils.getUser();
		sysFile.setDeptId(Math.toIntExact(user.getDeptId()));
		sysFile.setUsername(user.getUsername());
		return sysFileMapper.save(sysFile);
	}

	@Override
	public int update(FileDO sysFile){
		return sysFileMapper.update(sysFile);
	}

	@Override
	public int remove(Long id){
		return sysFileMapper.remove(id);
	}

	@Override
	public int batchRemove(Long[] ids){
		return sysFileMapper.batchRemove(ids);
	}

    @Override
    public Boolean isExist(String url) {
		Boolean isExist = false;
		if (!StringUtils.isEmpty(url)) {
			String filePath = url.replace("/files/", "");
			filePath = organConfig.getUploadPath() + filePath;
			File file = new File(filePath);
			if (file.exists()) {
				isExist = true;
			}
		}
		return isExist;
	}
	}
