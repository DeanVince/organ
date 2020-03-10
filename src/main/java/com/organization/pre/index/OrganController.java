package com.organization.pre.index;

import com.organization.common.controller.BaseController;
import com.organization.community.domain.*;
import com.organization.community.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Vince
 * @Date: 2020-02-22 22:54
 * @Description:
 */
@Controller
@RequestMapping("/pre/organ")
public class OrganController extends BaseController {

    @Autowired
    private BaseInfoService baseInfoService;

    @Autowired
    private DirectorInfoService directorInfoService;

    @Autowired
    private EmployService employService;

    @Autowired
    private MemberInfomationService memberInfomationService;

    @Autowired
    private MemberStaffService memberStaffService;

    @Autowired
    private PartyInfoService partyInfoService;

    @GetMapping("basic/{id}")
    String basic(@PathVariable int id, Model model){
        putBasic(id, model);
        return "pre/organ/basic";
    }

    @GetMapping("director/{id}")
    String director(@PathVariable int id, Model model){
        putBasic(id, model);
        return "pre/organ/director";
    }

    @GetMapping("employee/{id}")
    String employee(@PathVariable int id, Model model){
        EmployDO employDO = employService.getOne(id);
        model.addAttribute("employDO",employDO);
        putBasic(id, model);
        return "pre/organ/employee";
    }

    @GetMapping("member/{id}")
    String member(@PathVariable int id, Model model){
        putBasic(id, model);
        return "pre/organ/member";
    }

    @GetMapping("memberstaff/{id}")
    String memberstaff(@PathVariable int id, Model model){
        MemberStaffDO memberStaffDO = memberStaffService.getOne(id);
        model.addAttribute("memberStaffDO",memberStaffDO);
        putBasic(id, model);
        return "pre/organ/memberstaff";
    }



    @GetMapping("party/{id}")
    String party(@PathVariable int id, Model model){
        PartyInfoDO partyInfoDO = partyInfoService.getOne(id);
        model.addAttribute("partyInfoDO",partyInfoDO);
        putBasic(id, model);
        return "pre/organ/party";
    }

    private void putBasic(int id, Model model) {
        InfoDO infoDO = baseInfoService.get(id);
        model.addAttribute("infoDo",infoDO);
        model.addAttribute("user",getUser());
    }
}
