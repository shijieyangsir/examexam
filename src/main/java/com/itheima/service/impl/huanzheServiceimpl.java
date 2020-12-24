package com.itheima.service.impl;

import com.itheima.dao.HuanZheDao;
import com.itheima.domain.huanzhe;
import com.itheima.service.huanzheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class huanzheServiceimpl implements huanzheService {

    @Autowired
    private HuanZheDao huanZheDao;
    @Override
    public List<huanzhe> findAll(String name) {

        List<huanzhe> all = huanZheDao.findAll(name);
        return all;
    }

    @Override
    public void addhuanzhe(huanzhe huanzhe) {
        huanZheDao.addhuanzhe(huanzhe);
    }
}
