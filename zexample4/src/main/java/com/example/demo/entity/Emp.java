package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data = @Getter + @Setter
// 엔티티는 테이블과 같은 클래스이다.
// 마이바티스에서 사용할 클래스는 반드시 기본 생성자가 있어야 한다.
// 하나는 emp, 여러 개는 List<Emp>
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
  private Long empno;
  private String ename;
  private Long sal;
  private Long comm;
  private Long deptno;
}
