package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.Dept2Dao;
import com.example.demo.entity.Dept2;

@SpringBootTest
public class Dept2DaoTest {
  @Autowired
  Dept2Dao dept2Dao;
  
  @Test
  public void findAllTest() {
    List<Dept2> list = dept2Dao.findAll();
    for(Dept2 d:list) {
      System.out.println(d);
    }
  }
}
