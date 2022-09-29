package human20220929;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class java05_0007_studentRandomPositionGroup3_2 {

   // 20220929 history
   // 1. 이중배열과 데이터 전달

   static ArrayList<String> studentNumArray = new ArrayList<>();
   static ArrayList<String> positionArray = new ArrayList<>();
   static ArrayList<ArrayList<String>> position2Array = new ArrayList<>();

   static Scanner scan = new Scanner(System.in);

   static String num01 = "김준석";
   static String num02 = "김준석";
   static String num03 = "김민기";
   static String num04 = "김정환";
   static String num05 = "김지희";

   public static void main(String[] args) throws InterruptedException {
      // 초기 배열 선언 및 값 대입
      init(5, "-");
      // 랜덤으로 포지션 지정 및 저장
      randomPostionSort();

      view_position();

      System.out.println("--------Q.2-1--------");

      // 2-1. 본인의 이름을 임의로 바꿀 수 있는 기능(메서드)을 구현하시오
      // 메서드 실행 -> 특정 이름 검색 -> 동명이인일 경우를 고려
      // 1) 본인의 이름을 검색할 수 있는 if문과 scanner를 사용하여
      // 변수에 저장 할 수 있는 기능을 추가하시오
      // 2) 동명이인 일경우는 어떻게 처리할지 생각하시오
      // hint1. ArrayList<ArrayList<String> 타입 또는
      // ArrayList<String[] 타입에 대해 구글링하시오
      
      //1. 숫자를 문자열로 바꾸고 문자열을 모두 더하기
      //칸의 위치가 2,3
      //=23
      //1의 자리 3과 10의자리 20/10 = 2 index를 나눗셈하고 같이 위치를
      //저장
      //2. 배열(arrayList)
      
      //정적타입에서는 변수1 데이터를 다른 변수2에 저장하는 행위가 어려움
      //타입이 다르기 때문에 저장할려면 많은 코드가 필요하기 때문
      //javascript 혹은 PYTHON 언어에서는 타입이
      //var(let:변수) 타입 또는 const(상수) 타입 2가지 밖에 없음
      //정적타입에서는 String, int, double..
      //ArrayList, map, list... 타입이 많고, 맞춰줘야 함
      //그러므로 자바 개발자라면 특정 타입에 있는 데이터를 꺼내서
      //다른 타입 변수에 저장하는 것을 능숙하게 해야함!
      //1중 배열 positionArray의 데이터를 2중배열에 넣기
      formatArry();     
      
      System.out.println("이름을 입력하세요");
      String inputName = scan.nextLine();
      ArrayList<Integer> positionIndexList = new ArrayList<>();
      for(int i = 0; i<positionArray.size(); i++) {
         if(positionArray.get(i).equals(inputName)) {
            positionIndexList.add(i);
         }
      }
      System.out.println(positionIndexList);
      
      System.out.println("바꿀 이름을 입력하시오");
      inputName = scan.nextLine();
      int count = 1;
      for(int i = 0; i<positionArray.size(); i++) {
         for(int j = 0; j<positionIndexList.size(); j++) {
            if(positionIndexList.get(j) == i) {
               positionArray.set(i, inputName+count);
               count++;
            }
         }
      }
      //선언부는 String
      //실질적인 값은 Long타입이기 때문에 String으로 형변환이 필요
      //Long.toString(String); 
       String nowTime2 = Long.toString(System.nanoTime());
      //2중배열에 값 바꾸기 : 배열 새로만들어서 position2Array의 i번 째 배열에
      //갈아끼우기
//      ArrayList<String> temp = new ArrayList<>();

       for(int i = 0; i<positionIndexList.size(); i++) {
         ArrayList<String> tempArray = new ArrayList<>();
         tempArray.add(inputName);
         tempArray.add(nowTime2+count);
         count++;
         position2Array.set(positionIndexList.get(i), tempArray);
      }
      
      System.out.println("-------확인-------");
      for(int i = 0; i<position2Array.size(); i++) {
         for(int j = 0; j<position2Array.get(i).size(); j++) {
            System.out.print(position2Array.get(i).get(j));
         }
         System.out.println();
      }
      
//      for(int i = 0; i<position2Array.size(); i++) {
//         for(int j = 0; j<positionIndexList.size(); j++) {
//            if(positionIndexList.get(j) == i) {
//               temp.add(inputName);
//               temp.add("test");
//               position2Array.set(i, temp);
//            }
//         }
//      }
      
      view_position();
      
      ArrayList<ArrayList<String>> postionSecondVer = 
            new ArrayList<>();
      
      ArrayList<String> nameSave = new ArrayList<>();
      nameSave.add("김준석");
      nameSave.add("1");
      postionSecondVer.add(nameSave);
      
      ArrayList<String> nameSave1 = new ArrayList<>();
      nameSave1.add("박준석");
      nameSave1.add("1");
      postionSecondVer.add(nameSave1);
      
      ArrayList<String> nameSave2 = new ArrayList<>();
      nameSave2.add("김준석");
      nameSave2.add("2");
      postionSecondVer.add(nameSave2);
      
      for(int i = 0; i<postionSecondVer.size(); i++) {
         System.out.println(postionSecondVer.get(i));
         System.out.println(postionSecondVer.get(i).get(0)
               +postionSecondVer.get(i).get(1)
               );
      }
      
      

      searchName("김준석");

      ArrayList<ArrayList<?>> test2 = new ArrayList<>();

      ArrayList<String> arr1 = new ArrayList<>();
      ArrayList<String> arr2 = new ArrayList<>();
      ArrayList<String> arr3 = new ArrayList<>();
      ArrayList<Integer> arr4 = new ArrayList<>();

      String test1 = "김준석20220929";
      
      String[] abc = new String[2];
      abc[0] = "김준석";
      abc[1] = "20220929";
      
   
      
      arr1.add("김준석1");
      arr1.add("김준석2");
      arr2.add("박준석1");
      arr2.add("박준석2");
      arr4.add(2);
      arr4.add(5);


      // 예제) 김준석1의 id는 abcd1 이고 pw 12341234이다
      // 김준석2의 id는 abcd2 이고 pw 123qq이다
      // 김준석3의 id는 abcd55 이고 pw 123aa이다
      // 이것을 저장하는 배열을 만들어 보시오

      ArrayList<ArrayList<String>> saveAccount = new ArrayList<>();

      ArrayList<String> account1 = new ArrayList<>();
      account1.add("김준석1");
      account1.add("abcd1");
      account1.add("12341234");
      account1.add(Long.toString(System.nanoTime()));

      ArrayList<String> account2 = new ArrayList<>();
      account2.add("김준석2");
      account2.add("abcd2");
      account2.add("123qq");
      account2.add(Long.toString(System.nanoTime()));

      ArrayList<String> account3 = new ArrayList<>();
      account3.add("김준석3");
      account3.add("abcd55");
      account3.add("123aa");
      account3.add(Long.toString(System.nanoTime()));

      saveAccount.add(account1);
      saveAccount.add(account2);
      saveAccount.add(account3);
      // id가 abcd55인 사람의 이름을 출력하시오
      for (int i = 0; i < saveAccount.size(); i++) {
         if (saveAccount.get(i).get(1).equals("abcd55")) {
            System.out.println("abcd55 는 " + i + "번째 배열에 있습니다");
         }
      }

      // hint2. 데이터 입력시간은 동일 할 수 없는 이유에 대해 생각해보세요
      // 컴퓨터는 순차적으로 일을 처리하므로, 코드 한 줄씩 실행할 때마다
      // 그 순서는 명확해진다 -> 다른 줄의 코드는 각각 다른 시간에 실행된다
      // -> 변수는 동일한 시간에 선언되고 저장될 수 없다
      //

      // 2-2. 임의의 학생을 추가하여 자리를 재배치 할 수 있는 기능을 구현하시오
      // 1) 배열의 위치를 1개씩 뒤로 밀어서 학생이름을 저장하시오
      // ex) i번째에 "김준석", i+1번째에 "박준석", i+2번째에 "이준석"이라면
      // i+1번째에 "김준석", i+2번째에 "박준석", i+3번째에 "이준석" 덮어쓰기(혹은 추가)
      // 2) 특정 위치 (i칸)에 임의의 학생이름을 덮어써서 저장하시오

   }

   private static void formatArry() {
      // postionArray <-> postion2Array
      //1) positionArray 배열의 값을 꺼낸다 > 바로 2중배열에 저장
      //2) positionArray 배열의 값을 꺼낸다 > 저장하는 배열을 만들어서
      //position2Array에 저장
      String temp = "";
      for(int i =0; i<positionArray.size(); i++) {
         temp = positionArray.get(i);
         ArrayList<String> tempList = new ArrayList<>();
         //학생이름을 저장한 temp변수의 값을
         //templist 배열에 순차적으로 추가 저장
         //temp변수 코드를 작성하면, 코드 안에 있는 실질적인 값(String)을
         //꺼내서 출력하고 tempList배열에 추가
         tempList.add(temp);
         position2Array.add(tempList);
      }
      System.out.println("---formatArry---");
      for(int i=0; i<position2Array.size(); i++) {
         //position2Array 배열은 배열 안에 배열이 있으므로
         //i번째 에 있는 배열을 꺼내서 
         //그 배열 안에 있는 0번째 배열의 String값을 출력
         System.out.println(position2Array.get(i).get(0));
      }
   }

   private static void randomPostionSort() {
      String tempName = "";
      int randomNumber = 0;

      for (int i = 0; i < positionArray.size(); i++) {
         if (positionArray.get(i).equals("-")) {
            for (;;) {
               randomNumber = random_count0_24();
               tempName = studentNumArray.get(randomNumber);
               if (!tempName.equals("-")) {
                  positionArray.set(i, tempName);
                  studentNumArray.set(randomNumber, "-");
                  break;
               }
            }
         }
      }
   }

   private static void switchArray(int i, String string) {
      positionArray.set(0, positionArray.get(i));
      positionArray.set(i, string);

   }

   // int number = 5;
   // =(대입연산자) 우측에 있는 5라는 데이터는 main()메서드에서
   // 받아온 인자값
   // 인자값을 좌측에 있는 int number변수
   // (지역변수:init() 메서드 내에서만 살아 있음)에 저장
   private static void init(int number, String string1) {
      for (int i = 0; i < number; i++) {
         positionArray.add(string1);
      }
      studentNumArray.add(num01);
      studentNumArray.add(num02);
      studentNumArray.add(num03);
      studentNumArray.add(num04);
      studentNumArray.add(num05);
   }

   private static void positionArraySet(int beforPosition, int afterPosition, String name) {
      positionArray.set(beforPosition, positionArray.get(afterPosition));
      positionArray.set(afterPosition, name);
   }

   private static int random_count0_24() {
      // Math.random() : 0.0.. ~ 0.99.. 사이 수를 랜덤으로 출력
      // 0.00..*25 = 0;
      // 0.99..*25 = 24.99..; 1*25 = 25 -> 1보다 작은 수를 곱하므로
      // 결론적으로 24.99..값이 출력됨!
      // (int) 형변환하므로 소수점 삭제
      // 0~24 숫자(정수) 중에 한 개 출력
      return (int) (Math.random() * 5);
   }

   private static void view_position() {
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

   private static void searchName(String name) {
      // 1개이면 1사람, 2개이상이면 동명이인..
      int count = 0;
      for (int i = 0; i < positionArray.size(); i++) {
         if (positionArray.get(i).equals(name)) {
            count++;
         }
      }
      if (count == 1) {
         // 사람이름 바꾸기 메서드
         changeName(name);
      } else if (count > 1) {
         // 동명이인
         // 아래 메서드는 모든 이름을 바꾸게 됩니다!
         // 특정 동명이인만 바꿀 수 있도록 기준과 코드를 구현하시오
         // 기준 : 이름을 입력한 순서(날짜, 시간)으로 정렬하여 구분..
         changeName(name);
      }

   }

   private static void changeName(String name) {
      System.out.println("바꾸고 싶은 이름을 입력하시오");
      String temp = scan.nextLine();
      for (int i = 0; i < positionArray.size(); i++) {
         if (positionArray.get(i).equals(name)) {
            positionArray.set(i, temp);
         }
      }

   }

}