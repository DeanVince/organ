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

import com.organization.pre.domain.TypeDO;
import com.organization.pre.service.TypeService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 机构类别
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-12 15:03:29
 */

@Controller
@RequestMapping("/pre/type")
public class TypeController {
	@Autowired
	private TypeService typeService;

	@GetMapping()
	@RequiresPermissions("pre:type:type")
	String Type(){
	    return "pre/type/type";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("pre:type:type")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TypeDO> typeList = typeService.list(query);
		int total = typeService.count(query);
		PageUtils pageUtils = new PageUtils(typeList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("pre:type:add")
	String add(){
	    return "pre/type/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("pre:type:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		TypeDO type = typeService.get(id);
		model.addAttribute("type", type);
	    return "pre/type/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("pre:type:add")
	public R save( TypeDO type){
		if(typeService.save(type)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("pre:type:edit")
	public R update( TypeDO type){
		typeService.update(type);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("pre:type:remove")
	public R remove( Integer id){
		if(typeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("pre:type:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		typeService.batchRemove(ids);
		return R.ok();
	}

}
