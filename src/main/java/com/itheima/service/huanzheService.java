package com.itheima.service;

import com.itheima.domain.huanzhe;

import java.util.List;

public interface huanzheService {




    List<huanzhe> findAll(String name);


    void  addhuanzhe(huanzhe huanzhe);
}
