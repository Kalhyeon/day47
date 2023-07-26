package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Emp;

// EmpDao가 스프링 클래스면 @Repository를 사용한다.
// EmpDao는 인터페이스이기 때문에 객체를 마이바티스가 만들어서
// 스프링에 등록해야한다.
@Mapper
public interface EmpDao {
  // 어노테이션 뒤에 괄호 내에 어떤 값을 지정할 수 있다.
  // 세미콜론 (;)이 있으면 안된다 => Invalid Character 에러
  @Select("select * from emp")
  // ▲ 실행하려면 메소드가 필요함 / 이름은 내 마음대로 주면됨 / 
  // 값이 여러개로 받아올 때 List.타입이 안맞으면 에러
  public List<Emp> findAll();
}