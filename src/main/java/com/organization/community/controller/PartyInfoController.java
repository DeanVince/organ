package com.organization.community.controller;

import java.util.List;
import java.util.Map;

import com.organization.common.utils.ShiroUtils;
import com.organization.system.domain.UserDO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.organization.community.domain.PartyInfoDO;
import com.organization.community.service.PartyInfoService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 协会党建情况表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:43
 */

@Controller
@RequestMapping("/community/partyInfo")
public class PartyInfoController {
	@Autowired
	private PartyInfoService partyInfoService;

	@GetMapping()
	@RequiresPermissions("community:partyInfo:partyInfo")
	String PartyInfo(){
	    return "community/partyInfo/partyInfo";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("community:partyInfo:partyInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		UserDO user = ShiroUtils.getUser();
		if(!"admin".equals(user.getUsername())){
			Long deptId = user.getDeptId();
			params.put("deptId",deptId);
		}
		//查询列表数据
        Query query = new Query(params);
		List<PartyInfoDO> partyInfoList = partyInfoService.list(query);
		int total = partyInfoService.count(query);
		PageUtils pageUtils = new PageUtils(partyInfoList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("community:partyInfo:add")
	String add(){
	    return "community/partyInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("community:partyInfo:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		PartyInfoDO partyInfo = partyInfoService.get(id);
		model.addAttribute("partyInfo", partyInfo);
	    return "community/partyInfo/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("community:partyInfo:add")
	public R save( PartyInfoDO partyInfo){
		if(partyInfoService.save(partyInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("community:partyInfo:edit")
	public R update( PartyInfoDO partyInfo){
		partyInfoService.update(partyInfo);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("community:partyInfo:remove")
	public R remove( Integer id){
		if(partyInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("community:partyInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		partyInfoService.batchRemove(ids);
		return R.ok();
	}

}
