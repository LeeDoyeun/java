package human20220927;


import java.util.ArrayList;

public class java05_0007_studentRandomPositionGroup_2 {

   static ArrayList<String> positionArray = new ArrayList<>();



   public static void main(String[] args) {
	   //2)init()메서드를 사용하여
	   //positionArray배열의 길이는 12 이고,
	   //안에 값은 (칸마다) 김준석1, 김준석2, 김준석3,...김준석12까지 들어가도록 수정해보세요
	   //인자값, 매개변수 사용하시고, (문자열 + 숫자) 사용하세요
	   //1. 변수는 1개 데이터만 담을 수 있다
	   //2. 매개변수는 각 데이터를 담아서 메서드에서 사용할 수 있다
      init(12, "김준석");
      for(int i = 0; i < positionArray.size(); i++) {
    	  System.out.println(positionArray.get(i));
      }



   }

   private static void init(int number, String name) {
      for (int i = 0; i < number; i++) {
         positionArray.add(name+(i+1));
         
      }

   }

}