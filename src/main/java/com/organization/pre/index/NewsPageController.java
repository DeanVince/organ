package com.organization.pre.index;

import com.organization.community.domain.NewsDO;
import com.organization.community.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Vince
 * @Date: 2020-02-22 15:06
 * @Description:
 */
@Controller
@RequestMapping("pre")
public class NewsPageController {

    @Autowired
    private NewsService newsService;

    @GetMapping("news/{id}")
    String news(@PathVariable("id") int id, Model model){
        NewsDO newsDO = newsService.get(id);
        String type = type(newsDO.getNewsType());
        model.addAttribute("newsDO",newsDO);
        return "pre/news/"+type;
    }


    String type(String chType){
        String type="";
        switch (chType){
            case "党建工作" :
                type = "party";
                break;
            case "通知公告" :
                type = "announce";
                break;
            case "组织风采" :
                type = "announce";
                break;
            case "评选推荐" :
                type = "announce";
                break;
            case "政策法规" :
                type = "manager";
                break;
            default: type="index";
        }
        return type;
    }
}
