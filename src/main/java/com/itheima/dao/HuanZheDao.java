package com.itheima.dao;

import com.itheima.domain.huanzhe;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HuanZheDao {


    @Select("SELECT h.`id`,h.`name`,h.`gender`,k.`kname` FROM  huanzhe h,keshi k WHERE h.`did` = k.`id`")
    @Results({
        @Result(column="id",property="id"),
        @Result(column="name",property="name"),
        @Result(column="gender",property="gender"),
        @Result(column="kname",property="keshi.kname")
    })
    List<huanzhe> findAll();

    @Insert("insert into huanzhe values (null,#{name},#{gender},#{did},null)")
    void  addhuanzhe(huanzhe huanzhe);









}
