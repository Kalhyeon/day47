package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Dept2;

@Mapper
public interface Dept2Dao {
  @Select("select * from dept2")
  public List<Dept2> findAll();
}
