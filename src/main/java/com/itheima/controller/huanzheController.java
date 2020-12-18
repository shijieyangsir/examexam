package com.itheima.controller;

import com.itheima.domain.huanzhe;
import com.itheima.service.huanzheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("huanzhe")
public class huanzheController {
    @Autowired
    private huanzheService huanzheService;

    @RequestMapping("findall")
    public String findall(Model model){



        return null;
    }


    @RequestMapping("save")

    public String save(huanzhe huanzhe){
        huanzheService.addhuanzhe(huanzhe);
        return "success";
    }


}
