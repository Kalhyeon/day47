package example;


// 게임 개발회사 
class 자동번역채팅3 {
  private 번역기3 번역기;
  public void 번역하기() {
    // 자식들의 메소드 이름을 통일해야 한다
    번역기.번역();
  }
}


// 추상 메소드 : 표준 (메소드 이름)을 지키도록 강요
//        추상 메소드를 하나라도 가지는 클래스를 추상 클래스라고 한다
//        추상 클래스는 객체를 만들 수 없다
//        추상 클래스에 abstract 키워드가 없으면 오류
// 자동번역기 회사
abstract class 번역기3 { 
  abstract public void 번역();
}
//class KoreantoEnglish3 extends 번역기3 { }
//class 일본어to한국어3 extends 번역기3 { }
//class 영어to일본어3 extends 번역기3 { }
// => 셋 모두 에러



public class Test3 {

}