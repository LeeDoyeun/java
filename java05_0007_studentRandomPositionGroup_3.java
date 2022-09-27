package human20220927;


import java.util.ArrayList;

public class java05_0007_studentRandomPositionGroup_3 {

   static ArrayList<String> positionArray = new ArrayList<>();



   public static void main(String[] args) {
	   //3) init()메서드를 사용하여
	   //positionArray 배열의 길이는 25칸이고, 안에 값은 "-"넣는다
	   //단, positonArray의 13번째 칸에 본인의 이름을 넣어서 출력하시오
	   //ex) if문을 써서 특정 i의 값이 되면 본인의 이름을 넣도록 코드를 작성!
      init(25, "-","이도연");
      for(int i = 0; i < positionArray.size(); i++) {
    	  System.out.println(positionArray.get(i));
      }



   }

   private static void init(int number, String name1, String name2) {
      for (int i = 0; i < number; i++) {
         if(i!=12) {
        	 positionArray.add(name1);
         }else {
        	 positionArray.add(name2);
         }
         
      }

   }

}