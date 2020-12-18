package com.itheima.dao;

import com.itheima.domain.keshi;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KeShiDao {

    @Select("select *from keshi")
    List<keshi> findAll();


}
