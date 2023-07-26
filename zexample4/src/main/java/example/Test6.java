package example;

import lombok.EqualsAndHashCode;
import lombok.ToString;

// Object : hashCode(), equals(), toString()를 정해준다
//      hashCode() - 객체를 구별하는 번호를 리턴
//      equals() - 객체의 값을 비교
//      toString() - 객체를 문자열로 변환해서 리턴(객체 값을 확인할 때 사용)

@EqualsAndHashCode
@ToString
class 사과 {
  String 생산지;
  int price = 2000;
  int 무게;
  public Boolean equals(사과 apple) {
    return this.price==apple.price;
  }
}
public class Test6 {
  public static void main(String[] args) {
    사과 a1 = new 사과();
    사과 a2 = new 사과();
    
    // ==연산자는 같은 객체 (hashCode가 같다)인 경우에 true
    System.out.println(a1==a2);
    
    // 객체의 값을 비교할 때는 equals 메소드를 사용하자 -> Object
    // Object가 ==와 똑같이 hashCode를 비교하게 기본 구현(에러 방지)
    System.out.println(a1.equals(a2));
  }
}