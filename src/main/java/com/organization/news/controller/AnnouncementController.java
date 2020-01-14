package com.organization.news.controller;

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

import com.organization.news.domain.AnnouncementDO;
import com.organization.news.service.AnnouncementService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 通知公告
 *
 * @author vince
 * @email 1992lcg@163.com
 * @date 2020-01-07 23:43:46
 */

@Controller
@RequestMapping("/news/announcement")
public class AnnouncementController {
	@Autowired
	private AnnouncementService announcementService;

	@GetMapping()
	@RequiresPermissions("news:announcement:announcement")
	String Announcement(){
	    return "news/announcement/announcement";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("news:announcement:announcement")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AnnouncementDO> announcementList = announcementService.list(query);
		int total = announcementService.count(query);
		PageUtils pageUtils = new PageUtils(announcementList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("news:announcement:add")
	String add(){
	    return "news/announcement/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("news:announcement:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		AnnouncementDO announcement = announcementService.get(id);
		model.addAttribute("announcement", announcement);
	    return "news/announcement/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("news:announcement:add")
	public R save( AnnouncementDO announcement){
		if(announcementService.save(announcement)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("news:announcement:edit")
	public R update( AnnouncementDO announcement){
		announcementService.update(announcement);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("news:announcement:remove")
	public R remove( Integer id){
		if(announcementService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("news:announcement:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		announcementService.batchRemove(ids);
		return R.ok();
	}

}
