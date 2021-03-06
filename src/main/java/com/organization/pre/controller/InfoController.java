package com.organization.pre.controller;

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

import com.organization.pre.domain.InfoDO;
import com.organization.pre.service.InfoService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 机构基本信息
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 15:03:29
 */

@Controller
@RequestMapping("/pre/info")
public class InfoController {
	@Autowired
	private InfoService infoService;

	@GetMapping()
	@RequiresPermissions("pre:info:info")
	String Info(){

	    return "pre/info/info";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("pre:info:info")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<InfoDO> infoList = infoService.list(query);
		int total = infoService.count(query);
		PageUtils pageUtils = new PageUtils(infoList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("pre:info:add")
	String add(){
	    return "pre/info/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("pre:info:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		InfoDO info = infoService.get(id);
		model.addAttribute("info", info);
	    return "pre/info/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("pre:info:add")
	public R save( InfoDO info){
		if(infoService.save(info)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("pre:info:edit")
	public R update( InfoDO info){
		infoService.update(info);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("pre:info:remove")
	public R remove( Integer id){
		if(infoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("pre:info:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		infoService.batchRemove(ids);
		return R.ok();
	}

}
