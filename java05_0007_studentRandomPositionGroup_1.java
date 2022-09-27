package human20220927;


import java.util.ArrayList;

public class java05_0007_studentRandomPositionGroup_1 {

   // 동적타입, 정적타입(타입을 정확하게 선언함(Java..))
   // static 변수가 딱 1개만 존재
   // ArrayList<> : 가변배열 타입 선언
   // ArrayList<String> : 가변배열 칸 안에는 String타입만 들어갈 수 있다
   // studentNumArray : 변수 이름 (호출할 때 이름)
   // =(대입연산자) : 우측에 있는 값을 좌측 변수에 할당(저장)
   // new ArrayList<>(); : ArrayList도구를 새로 만들어서 좌측에 저장
   // 좌측 타입과 우측 도구(타입)은 동일해야 함
   // 간략화 : String abc = "김준석";
   // 원본 : String abc = new String("김준석");
   static ArrayList<String> studentNumArray = new ArrayList<>();
   static ArrayList<String> positionArray = new ArrayList<>();

   static String num01 = "권지혜";
   static String num02 = "김건희";
   static String num03 = "김민기";
   static String num04 = "김정환";
   static String num05 = "김지희";

   // 위에까지 내용(변수들..)은 필드로써 여러가지 메서드들이 접근하여
   // 저장 혹은 수정을 할 수 있음

   private static void test() {
      System.out.println(num02);
   }

   private static void fix() {
      num02 = "박준석";
   }

   public static void main(String[] args) {
//      String num01 = "김준석";
      // num01 은 전역변수(필드), 지역변수(메서드 안에 선언된 변수)
      // 모두 같은 이름인데, 호출 할 때는 지역변수로 호출 됨

      // 호출되는 시점에서 가장 가까운 변수를 가져옴
//      System.out.println(num01);
      
      // 메서드 안에서 필드 값을 바꿀 수 있음
      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)
      fix(); // fix()메서드를 가져와서 실행 (num02 전역변수 값을 박준석으로 바꿈)
      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)

      init(10);
      for(int i = 0; i < positionArray.size(); i++) {
    	  System.out.println(positionArray.get(i));
      }
      //1)만약 positionArray 배열의 길이를 10으로 늘리고 싶다면
	   //init()메서드를 어떻게 수정하시겠습니까?
	   //ex)인자값,매개변수 활용해서 만들어보세요


   }

   private static void init(int number) {
      for (int i = 0; i < number; i++) {
         positionArray.add("-");
         
      }

   }

}