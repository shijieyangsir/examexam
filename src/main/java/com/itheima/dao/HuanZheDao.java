package com.itheima.dao;

import com.itheima.domain.huanzhe;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface HuanZheDao {


    @Select("<script>SELECT h.`id`,h.`name`,h.`gender`,k.`kname` FROM  huanzhe h,keshi k " +
            "WHERE h.`did` = k.`id` " +
            "<if test='name!=null and name!=\"\"'> and name like concat('%',#{name},'%') </if></script>")
    @Results({
        @Result(column="id",property="id"),
        @Result(column="name",property="name"),
        @Result(column="gender",property="gender"),
        @Result(column="kname",property="keshi.kname")
    })
    List<huanzhe> findAll(@Param("name") String name);

    @Insert("insert into huanzhe values (null,#{name},#{gender},#{did},null)")
    void  addhuanzhe(huanzhe huanzhe);









}
