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

import com.organization.community.domain.NewsDO;
import com.organization.community.service.NewsService;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.common.utils.R;

/**
 * 社团新闻表
 *
 * @author vince
 * @date 2020-01-12 18:39:42
 */

@Controller
@RequestMapping("/community/news")
public class NewsController {
	@Autowired
	private NewsService newsService;

	@GetMapping()
	@RequiresPermissions("community:news:news")
	String News(){
	    return "community/news/news";
	}

	@ResponseBody
	@GetMapping("/list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		UserDO user = ShiroUtils.getUser();
		if(!"admin".equals(user.getUsername())){
			Long deptId = user.getDeptId();
			params.put("deptId",deptId);
		}
		//查询列表数据
        Query query = new Query(params);
		List<NewsDO> newsList = newsService.list(query);
		int total = newsService.count(query);
		PageUtils pageUtils;
		pageUtils = new PageUtils(newsList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("community:news:add")
	String add(){
	    return "community/news/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("community:news:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		NewsDO news = newsService.get(id);
		model.addAttribute("news", news);
	    return "community/news/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("community:news:add")
	public R save( NewsDO news){
		if(newsService.save(news)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("community:news:edit")
	public R update( NewsDO news){
		newsService.update(news);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("community:news:remove")
	public R remove( Integer id){
		if(newsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("community:news:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		newsService.batchRemove(ids);
		return R.ok();
	}

}
