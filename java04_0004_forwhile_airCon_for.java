package human20220920;

import java.io.IOException;

public class java04_0004_forwhile_airCon_for {

   public static void main(String[] args) throws IOException {
      long startNanotime = 0;
      long endNanotime = 0;
      
      int keycode = 0;
      int currentTemper = 30;
      //for(;;) 무한for문 : 조건식이 없어서 for문을 계속 돌게 하는 구문
      for (;;) {
         endNanotime = System.nanoTime();
         System.out.println("연산속도는 " + (endNanotime - startNanotime) / 1000000000.0);
         System.out.println("-----------------------------------");
         System.out.println("1. 온도1감소 |2. 온도1증가 | 3. 최저온도냉방");
         //무한for문
         for (;;) {
            //49 13 10코드를 순차적으로 받게 됨
            keycode = System.in.read();
            startNanotime = System.nanoTime();
            if (keycode != 13 && keycode != 10) {
               break;
            }
         }
         if (keycode == 49) {
            currentTemper--;
         } else if (keycode == 50) {
            currentTemper++;
         } else if (keycode == 51) {
            currentTemper = 18;
         }

         if (currentTemper < 18) {
            currentTemper = 18;
         }
         System.out.println("현재 온도는 " + currentTemper);
      }

   }

}