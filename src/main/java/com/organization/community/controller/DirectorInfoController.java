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

import com.organization.community.domain.DirectorInfoDO;
import com.organization.community.service.DirectorInfoService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 社团组织理事信息表
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 18:39:41
 */

@Controller
@RequestMapping("/community/directorInfo")
public class DirectorInfoController {
	@Autowired
	private DirectorInfoService directorInfoService;

	@GetMapping()
	@RequiresPermissions("community:directorInfo:directorInfo")
	String DirectorInfo(){
	    return "community/directorInfo/directorInfo";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("community:directorInfo:directorInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DirectorInfoDO> directorInfoList = directorInfoService.list(query);
		int total = directorInfoService.count(query);
		PageUtils pageUtils = new PageUtils(directorInfoList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("community:directorInfo:add")
	String add(){
	    return "community/directorInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("community:directorInfo:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		DirectorInfoDO directorInfo = directorInfoService.get(id);
		model.addAttribute("directorInfo", directorInfo);
	    return "community/directorInfo/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("community:directorInfo:add")
	public R save( DirectorInfoDO directorInfo){
		if(directorInfoService.save(directorInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("community:directorInfo:edit")
	public R update( DirectorInfoDO directorInfo){
		directorInfoService.update(directorInfo);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("community:directorInfo:remove")
	public R remove( Integer id){
		if(directorInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("community:directorInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		directorInfoService.batchRemove(ids);
		return R.ok();
	}

}
