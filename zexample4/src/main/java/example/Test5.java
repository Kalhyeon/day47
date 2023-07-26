package example;

// Object 클래스 : 자바의 모든 클래스의 부모
// ▼ 부모 클래스가 있는 상태
class Apple  {
}
class Banana {  
}
class Orange {
}

class 염산 {
}
public class Test5 {
  public static void main(String[] args) {
    // Object 참조변수는 아래처럼 쓸 수 있다 하지만 실제 사용 X
    // Object로 하면 뭐가 나올지 모름
    // 자바의 모든 객체가 가질 메소드를 정해준다 -> 추상 메소드가 아니라 기본 구현된 메소드
    // Object는 클래스다
    Object ob = new Apple();
    ob = new Banana();
    ob = new Orange();
    
    ob = new 염산();
  }
}