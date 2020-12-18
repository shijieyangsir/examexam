package com.itheima.service.impl;

import com.itheima.dao.KeShiDao;
import com.itheima.domain.keshi;
import com.itheima.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeShiServiceImpl implements KeShiService {
    @Autowired
    private KeShiDao keShiDao;
    @Override
    public List<keshi> findAll() {
        List<keshi> keshiList = keShiDao.findAll();
        return keshiList;
    }
}
