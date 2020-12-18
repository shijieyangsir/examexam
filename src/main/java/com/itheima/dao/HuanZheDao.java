package com.itheima.dao;

import com.itheima.domain.huanzhe;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HuanZheDao {


    @Select("select *from huanzhe")
    List<huanzhe> findAll();

    @Insert("insert into huanzhe values (null,#{name},#{gender},#{did},null)")
    void  addhuanzhe(huanzhe huanzhe);









}
