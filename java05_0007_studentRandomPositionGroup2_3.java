package human20220927;

import java.util.ArrayList;

public class java05_0007_studentRandomPositionGroup2_3 {

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
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)
//      fix(); // fix()메서드를 가져와서 실행 (num02 전역변수 값을 박준석으로 바꿈)
//      test(); // test()메서드를 가져와서 실행 (콘솔창에 num02출력)

	   //1)만약 positionArray 배열의 길이를 10으로 늘리고 싶다면
	   //init()메서드를 어떻게 수정하시겠습니까?
	   //ex)인자값,매개변수 활용해서 만들어보세요
	   //2)init()메서드를 사용하여
	   //positionArray배열의 길이는 12 이고,
	   //안에 값은 (칸마다) 김준석1, 김준석2, 김준석3,...김준석12까지 들어가도록 수정해보세요
	   //인자값, 매개변수 사용하시고, (문자열 + 숫자) 사용하세요
	   //1. 변수는 1개 데이터만 담을 수 있다
	   //2. 매개변수는 각 데이터를 담아서 메서드에서 사용할 수 있다
	   //3) init()메서드를 사용하여
	   //positionArray 배열의 길이는 25칸이고, 안에 값은 "-"넣는다
	   //단, positonArray의 13번째 칸에 본인의 이름을 넣어서 출력하시오
	   //ex) if문을 써서 특정 i의 값이 되면 본인의 이름을 넣도록 코드를 작성!
	   //4) init() 메서드를 사용하여
	   //positonArray 배열의 길이는 25칸이고, 안에 값은 "-"넣는다
	   //단, 배열의 짝수 일 때에는 "~"표시로 저장하시오
      init("-",5);
      //positionArray.size() : arrayList(가변) 배열의 칸 길이를 알려줌
      //intList.length : 고정배열의 칸 길이를 알려줌
      System.out.println(positionArray.size());

      for(int i =0; i<positionArray.size();i++) {
    	  System.out.println(positionArray.get(i) + ":" + (i+1));
      }


      String tempName = "";
      int randomNumber = 0;
      
      //for문 : 반복문 : 특정 조건이 성립할 때까지 코드 {}를 반복하겠다.
      //조건절 : i < positionArray.size();
      //i의 값이 positionArray.size();크기보다 작을 때까지!
      for (int i = 0; i < positionArray.size(); i++) {
    	  //if(조건식) : 조건식이 true 일 때 코드 {} 실행
    	  //positionArray 배열의 i번째 칸의 값이 "-"과 같으면(equals)
    	  //A.equals("-") : 문자열 "-"과 A의 값을 비교하겠다!
    	  //positionArray.get(i) : 배열의 i번째 값을 가져오겠다(get)
    	  //equals() 메서드를 쓰면 비교에 따라서 같으면 true,
    	  //다르면 false가 반환됨(result : 결과값)
         if (positionArray.get(i).equals("-")) {
        	 //반복문 for(;;) : 조건이 없음 -> 무한반복
            for (;;) {
            	//random_count0_24();메서드를 실행하여 결과값을
            	//randomNumber 변수에 할당(저장)
               randomNumber = random_count0_24();
               //studentNumArray 배열에 ?번째 값을 출력
               //? = randomNumber으로 랜덤으로 값을 출력한 정수
               //tempName 변수에 학생이름을 저장
               tempName = studentNumArray.get(randomNumber);
               //tempName.equals("-") :
               //tempName 변수 값이 "-"이면 true
               //그 true의 값을 !(반전)을 하면 false
               //그러므로 if문 조건이 성립되지 않는다!
               if (!tempName.equals("-")) {
            	   //위에 조건이 성립되면
            	   //tempName 변수값은 학생 이름이고
            	   //tempName을 positionArray배열의 i번째 칸에 저장
            	   //A.set(i, tempName)
            	   //A배열의 i번째 칸에 tempName변수 값을 저장
                  positionArray.set(i, tempName);
                  studentNumArray.set(randomNumber, "-");
                  break;
               }
            }

         }

      }
      System.out.println(positionArray);
      System.out.println(studentNumArray);
      view_position(positionArray);

      // 1-1. 본인의 자리가 맨 앞자리가 아니면 앞자리로 바꾸는 기능을 구현하시오
      //1)본인의 이름을 equals로 검색하고,
      //positionArray 배열의 위치가 0번째가 아니면,
      //0번째로 바꾸시오
    	  int finderNum = 0;
          for(int i = 0; i < positionArray.size(); i++) {
    		  if(positionArray.get(i).equals("권지혜")) {
    			  finderNum = i;
    			  break;
    		  }
    	  }
//           if(positionArray.get(0).equals("권지혜")) {
//    		  System.out.println("권지혜씨는 0번째 위치 입니다.");
//    	  } else {
//    		  //0번째 배열에 본인 이름 넣기
//    		  //2)그리고, 0번째에 있던 친구의 이름을 전에 있던 본인의 위치로 이동하시오.
//    		  positionArray.set(finderNum,positionArray.get(0));
//    		  positionArray.set(0,"권지혜");
//    		  System.out.println("권지혜씨는 0번째 위치 아닙니다.");
//    	  }
//    	  view_position(positionArray);
      
      
      

      // 1-2. 본인의 자리가 우측이면 좌측으로 바꾸는 기능을 구현하시오
//          if(finderNum%2==1) {
//        	  System.out.println("권지혜씨 자리가 우측입니다.");
//        	  positionArray.set(finderNum, positionArray.get(finderNum-1));
//    		  positionArray.set((finderNum-1),"권지혜");
//    	  }
//          view_position(positionArray);

      // 1-3. 본인의 자리가 홀로 자리이면 짝궁이 있는 자리로 바꾸는 기능을 구현하시오
          if(finderNum == 4) {
        	 System.out.println("권지혜씨 위치는 홀로 자리입니다.");
        	 int randomNum = 0;
        	 randomNum = (int)(Math.random()*4);
        	 positionArray.set(4,positionArray.get(randomNum));
        	 positionArray.set(randomNum, "권지혜"); 			 
          } else {
        	  System.out.println("권지혜씨 위치는 홀로 자리 아닙니다.");
          }
          view_position(positionArray);
      // 1-4. 본인의 자리가 첫 번째이면 마지막으로 바꿀 수 있는 기능을 구현하시오

      // 2-1. 본인의 이름을 임의로 바꿀 수 있는 기능을 구현하시오

      // 2-2. 임의의 학생을 추가하여 자리를 재배치 할 수 있는 기능을 구현하시오

      // 3-1. 자리 재배치를 했을 때 본인의 자리가 몇 번이었는지
      // 기록을 남기고 출력하시오

      // 3-2. 자기는 혼자 자리를 앉는지 확인하는 메서드를 만들고,
      // 만일 혼자 자리가 아니면, 자리를 재배치 하도록 코드를 구현하시오

   }

   //private : 접근제한자로써 init()메서드는 같은 class내에서만 쓸 수 있음
   //예 ) 여기 클래스에서 여러 메서드들이 있는데, 클래스 내부에서만 쓸 수 있고,
   //외부 클래스(다른 자바파일 등등...)에서는 init()메서드를 호출하여 쓸 수 없음
   //<> public
   //static : 한 개만 있음! <> 인스턴스
   //void : 메서드를 실행하면 return 값이 없음
   //예 ) String abc = init(); (x) init()메서드는 void이므로
   //abc변수에 무언가의 값을 저장 할 수 없음.
   //(int money) : 매개변수
   //데이터를 전달하여 받는 매개체 + 변수 (매개변수)
   //(int money = 10);
   //int money 타입과 변수이름으로 선언 = 10;
   private static void init(String name1, int number) {
	   //초기식 : int i = 0;
	   //조건식 : i < 5; (for문 돌 때마다 i의 값을 확인하는데
	   //5보다 작을 때까지 for문은 계속 돈다)
	   //증감식 : i++ : for문 한 번 돌 때 마다 i의 값은 1씩 증가
      for (int i = 0; i < number; i++) {
    	  //전역변수 positionArray 배열에 순서대로
    	  //0번째 배열칸에 "-"추가(add)
    	  //1번째 배열칸에 "-"추가(add)
    	  //2번째 배열칸에 "-"추가(add)...
    	  //매개변수 name의 값을 add()로 저장
    	  //name + (1+i) : i는 숫자, 1도 숫자, name은 문자열
    	  //문자열이 우선순위 형변환이므로
    	  //좌측 name변수 타입으로 모두 변환되어 출력
    	  //ex) 김준석51
    	  //()괄호를 써서 숫자 연산부터 한 뒤에 name(문자열)으로 같이 형변환

           positionArray.add(name1);
   		  
   	  }
           
    	 

      

      //전역변수 studentNumArray 배열에 순서대로
      //전역변수 num01의 값을 추가(add)
      //추가 : 배열의 끝에 추가적으로 저장
      studentNumArray.add(num01);
      studentNumArray.add(num02);
      studentNumArray.add(num03);
      studentNumArray.add(num04);
      studentNumArray.add(num05);

   }
   


   private static int random_count0_24() {
       //Math.random() : 0.0...~0.99..사이 수를 랜덤으로 출력
	   //0.00..*25 = 0;
	   //0.99..*25 = 24.999...;1보다 작은 수를 곱하므로 결론적으로 24.999값이 출력됨.
	   //(int) 형변환하므로 소수점 삭제
	   //0~24 숫자(정수) 중에 한 개 출력
	   return (int) (Math.random() * 5);
   }

   private static void view_position(ArrayList<String> positionArray) {
      System.out.println("[문]--------------------------");
      for (int i = 1; i <= positionArray.size(); i++) {
         if (i % 2 == 0) {
            System.out.printf(positionArray.get(i - 1) + "/ ");
            System.out.println();
         } else {
            System.out.printf(positionArray.get(i - 1) + "/ ");
         }
      }
      System.out.println();
   }

}