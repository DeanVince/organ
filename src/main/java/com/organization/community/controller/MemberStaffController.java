package com.organization.community.controller;

import java.util.List;
import java.util.Map;

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

import com.organization.community.domain.MemberStaffDO;
import com.organization.community.service.MemberStaffService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 会员机构人数情况表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */

@Controller
@RequestMapping("/community/memberStaff")
public class MemberStaffController {
	@Autowired
	private MemberStaffService memberStaffService;

	@GetMapping()
	@RequiresPermissions("community:memberStaff:memberStaff")
	String MemberStaff(){
	    return "community/memberStaff/memberStaff";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("community:memberStaff:memberStaff")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MemberStaffDO> memberStaffList = memberStaffService.list(query);
		int total = memberStaffService.count(query);
		PageUtils pageUtils = new PageUtils(memberStaffList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("community:memberStaff:add")
	String add(){
	    return "community/memberStaff/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("community:memberStaff:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		MemberStaffDO memberStaff = memberStaffService.get(id);
		model.addAttribute("memberStaff", memberStaff);
	    return "community/memberStaff/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("community:memberStaff:add")
	public R save( MemberStaffDO memberStaff){
		if(memberStaffService.save(memberStaff)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("community:memberStaff:edit")
	public R update( MemberStaffDO memberStaff){
		memberStaffService.update(memberStaff);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("community:memberStaff:remove")
	public R remove( Integer id){
		if(memberStaffService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("community:memberStaff:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		memberStaffService.batchRemove(ids);
		return R.ok();
	}

}
