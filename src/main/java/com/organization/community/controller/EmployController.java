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

import com.organization.community.domain.EmployDO;
import com.organization.community.service.EmployService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 社团信息人员情况表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:42
 */

@Controller
@RequestMapping("/community/employ")
public class EmployController {
	@Autowired
	private EmployService employService;

	@GetMapping()
	@RequiresPermissions("community:employ:employ")
	String Employ(){
	    return "community/employ/employ";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("community:employ:employ")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<EmployDO> employList = employService.list(query);
		int total = employService.count(query);
		PageUtils pageUtils = new PageUtils(employList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("community:employ:add")
	String add(){
	    return "community/employ/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("community:employ:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		EmployDO employ = employService.get(id);
		model.addAttribute("employ", employ);
	    return "community/employ/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("community:employ:add")
	public R save( EmployDO employ){
		if(employService.save(employ)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("community:employ:edit")
	public R update( EmployDO employ){
		employService.update(employ);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("community:employ:remove")
	public R remove( Integer id){
		if(employService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("community:employ:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		employService.batchRemove(ids);
		return R.ok();
	}

}
