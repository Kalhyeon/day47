package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.EmpDao;
import com.example.demo.entity.Emp;

// 태스트는 만든 메서드가 제대로 동작하는 지 확인하는 작업이다.

// @Autowired 를 실행하려면 JUnit 이 스프링을 실행해야 한다.
@SpringBootTest
public class EmpDaoTest {
  @Autowired
  EmpDao empDao;

//  UnsatisfiedDependencyException : @Autowired 실패
//  JUnit 메서드는 무조건 public void 이며 매개변수는 없다.
  @Test
  public void findAllTest() {
    List<Emp> list = empDao.findAll();
    for(Emp i:list) {
      System.out.println(i);
    }
  }
}
