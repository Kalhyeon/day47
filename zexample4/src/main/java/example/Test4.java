package example;


// 게임 개발회사 
class 자동번역채팅4 {
  private 번역기4 번역기;
  public void 번역하기() {
    // 자식들의 메소드 이름을 통일해야 한다
    번역기.번역();
  }
}

// 자동번역기 회사
// 인터페이스(표준)는 상수와 추상 메소드만 가진다
// 키워드는 extends 대신 implements를 사용한다
// extends의 부모는 1개만 가능 : class 자식 extends 부모 { }
// implements의 부모는 여러개 가능 : class 자식 implements 부모, 양부모, 대부모...
// 물론 당연히 class 자식 extends 부모 implements 양부모 { }

interface 번역기4 { 
  public void 번역();
}
abstract class KoreantoEnglish4 implements 번역기4 { }
abstract class 일본어to한국어4 implements 번역기4 { }
abstract class 영어to일본어4 implements 번역기4 { }




public class Test4 {

}