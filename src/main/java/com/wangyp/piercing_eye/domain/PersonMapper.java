package com.wangyp.piercing_eye.domain;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person")
    List<Person> findAll();
}
