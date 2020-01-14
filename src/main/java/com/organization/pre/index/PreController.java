package com.organization.pre.index;

import com.organization.common.controller.BaseController;
import com.organization.common.utils.PageUtils;
import com.organization.common.utils.Query;
import com.organization.community.domain.NewsDO;
import com.organization.community.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Vince
 * @Date: 2020-01-12 10:19
 * @Description:
 */
@Controller
@RequestMapping("pre")
public class PreController extends BaseController {
    @Autowired
    private NewsService newsService;

    @GetMapping("index")
    String index(Model model) {
        Map<String, Object> params = new HashMap();
        params.put("limit",6);
        params.put("newsType","通知公告");
        List<NewsDO> announmentList = newsService.list(new Query(params));
        model.addAttribute("announmentList",announmentList);
        params.put("newsType","组织风采");
        List<NewsDO> activityList = newsService.list(new Query(params));
        model.addAttribute("activityList",activityList);
        params.put("newsType","评选推荐");
        List<NewsDO> recommend = newsService.list(new Query(params));
        model.addAttribute("recommend",recommend);
        params.put("newsType","党建工作");
        List<NewsDO> partyList = newsService.list(new Query(params));
        model.addAttribute("partyList",partyList);
        Map<String, Object> params1 = new HashMap();
        params1.put("limit",6);
        params1.put("newsType","政策法规");
        List<NewsDO> policiesList = newsService.list(new Query(params1));
        model.addAttribute("policiesList",policiesList);
        model.addAttribute("user",getUser());
        return "pre/index";
    }

    @GetMapping("organization")
    String organization() {
        return "pre/organization";
    }

    @GetMapping("party")
    String party(Model model) {
        model.addAttribute("user",getUser());
        putList(model,"党建工作");
        return "pre/party";
    }


    @GetMapping("infomation")
    String info(Model model) {
        model.addAttribute("user",getUser());
        return "pre/info";
    }


    @GetMapping("announce")
    String announce(Model model) {
        putList(model,"通知公告");
        return "pre/announce";
    }

    @GetMapping("manager")
    String manager(Model model) {
        putList(model,"政策法规");
        return "pre/manager";
    }

    private void putList(Model model,String type) {
        Map<String, Object> params = new HashMap();
        params.put("newsType", type);
        List<NewsDO> list = newsService.list(new Query(params));
        model.addAttribute("list", list);
        model.addAttribute("user",getUser());
    }
}
