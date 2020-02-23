package com.organization.common.controller;

import org.springframework.stereotype.Controller;
import com.organization.common.utils.ShiroUtils;
import com.organization.system.domain.UserDO;

@Controller
public class BaseController {
	public  UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}
