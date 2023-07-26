package example;

// 표준의 중요성 
// 자동변역채팅을 제공하는 게임을 만들자
// A가 B에 의존할 때 B가 코드를 변경하면 A쪽도 변경하는 상황이 벌어진다
// 코드를 변경했을 때 변경사항은 적용되야하지만 코드변경해서는 안된다
// SOLID -> Open Closed 원칙 (개방 폐쇄 원칙)
//      기능 개선에 대해서는 열려 있고 코드 변경에 대해서는 닫혀있다

// 게임 개발회사 
class 자동번역채팅 {
//  private 한국어to영어 t1; => 에러
  private 일본어to한국어 t2;
  private 영어to일본어 t3;
}




// 자동번역기 회사
class KoreantoEnglish { }
class 일본어to한국어 {  }
class 영어to일본어    {  }



public class Test1 {

}