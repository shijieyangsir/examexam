package com.itheima.controller;


import com.itheima.domain.keshi;
import com.itheima.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class KeShiController {

    @Autowired
    private KeShiService keShiService;
    @ResponseBody
    @RequestMapping(value = "/keShi",method = RequestMethod.GET)
    public List<keshi> keShiFindAll(){
        List<keshi> keshiList = keShiService.findAll();
        return keshiList;
    }



}
