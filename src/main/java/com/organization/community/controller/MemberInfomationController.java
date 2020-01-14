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

import com.organization.community.domain.MemberInfomationDO;
import com.organization.community.service.MemberInfomationService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 协会会员情况
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */

@Controller
@RequestMapping("/community/memberInfomation")
public class MemberInfomationController {
	@Autowired
	private MemberInfomationService memberInfomationService;

	@GetMapping()
	@RequiresPermissions("community:memberInfomation:memberInfomation")
	String MemberInfomation(){
	    return "community/memberInfomation/memberInfomation";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("community:memberInfomation:memberInfomation")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MemberInfomationDO> memberInfomationList = memberInfomationService.list(query);
		int total = memberInfomationService.count(query);
		PageUtils pageUtils = new PageUtils(memberInfomationList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("community:memberInfomation:add")
	String add(){
	    return "community/memberInfomation/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("community:memberInfomation:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		MemberInfomationDO memberInfomation = memberInfomationService.get(id);
		model.addAttribute("memberInfomation", memberInfomation);
	    return "community/memberInfomation/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("community:memberInfomation:add")
	public R save( MemberInfomationDO memberInfomation){
		if(memberInfomationService.save(memberInfomation)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("community:memberInfomation:edit")
	public R update( MemberInfomationDO memberInfomation){
		memberInfomationService.update(memberInfomation);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("community:memberInfomation:remove")
	public R remove( Integer id){
		if(memberInfomationService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("community:memberInfomation:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		memberInfomationService.batchRemove(ids);
		return R.ok();
	}

}
