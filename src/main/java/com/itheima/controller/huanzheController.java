package com.itheima.controller;

import com.itheima.domain.huanzhe;
import com.itheima.service.huanzheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("huanzhe")
public class huanzheController {
    @Autowired
    private huanzheService huanzheService;

    @RequestMapping("findall")
    public String findall(Model model,String pname){
        List<huanzhe> all = huanzheService.findAll(pname);
        model.addAttribute("huangZheList",all);
        model.addAttribute("pname",pname);
        return "patients-list";
    }

    @RequestMapping("save")

    public String save(huanzhe huanzhe){
        huanzheService.addhuanzhe(huanzhe);
        return "subscribe-form";
    }


}
