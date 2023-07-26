package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.Dept2Dao;

@Controller
public class Dept2Controller {
  @Autowired
  Dept2Dao dept2Dao;
  
//  / 로 들어오거나 /list 로 들어오거나 => 주소를 2개 지정
  @GetMapping({"/", "/list"})
  public String list(Model model) {
//    컨트롤러에서 리턴은 JSP 의 이름
//    JSP 에서 출력할 데이터 model 은 Model 에 저장한다.
    model.addAttribute("list", dept2Dao.findAll());
    return "list";
  }
}
