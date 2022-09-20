package human20220920;

import java.io.IOException;

public class 테스트 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		questionStep1_1();

	}
	public static void questionStep1_1() throws IOException {
	      //당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
	      //다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
	      //1. 안심 돈가스 : 9000원
	      //2. 등심 돈가스 : 8000원
	      //(단, 고객을 확하기하기 위해 
	      //만원이상이면 10%할인, 2만원이상이면 20%할인을 하는
	      //만원 단위별로 10%씩 증가하는 
	      //최대 50%할인 대박세일을 진행하려 합니다)
	      
	      //keycode, totalPrice, discountPrice변수 메모리 영역을 할당
	      //0이라는 숫자를 넣는다!
	      int keycode = 0;
	      int totalPrice = 0;
	      int discountPrice = 0;
	      
	      //메뉴를 다 받을 때까지 while돌도록 만듬
	      while(true) {
	         //keycode가 13, 10모두 아닐 경우에 {}코드영역 실행
	         //keycode != 13 : keycode가 13이 아니면, 참!(true)
	         // A && B : A조건 B조건 모두 성립해야 true >> {}코드영역 실행
	         if (keycode != 13 && keycode != 10) {
	            System.out.println("---------------------");
	            System.out.println("1. 안심 돈가스 : 9000원");
	            System.out.println("2. 등심 돈가스 : 8000원");
	            System.out.println("3. 주문 완료");
	         }
	         //in.read(); 메서드로 키보드의 키 코드를 받아서
	         //변수 keycode에 저장 (enter key 13 10코드 존재)
	         keycode = System.in.read();
	         if(keycode == 49) {
	            totalPrice += 9000; // totalPrice = totalProce + 9000;
	         }else if(keycode == 50) {
	            totalPrice += 8000;
	         }else if(keycode == 51) {
	            //3번 키 51코드를 누르면 break;로 while종료
	            break;
	         }
	      }
	      
	      //if문은 조건절이 성립되면 하단에 있는 if else문 조건은 확인하지 않음
	      //범위 계산 예) 1만원 이상 2만원이상 확인 할 필요없이
	      //앞에 if문에서 1만원이하 경우를 확인했으므로 
	      //두 번째 if문 1만원 이하의 조건은 따로 확인 할 필요 없음
	      if(totalPrice<10000) {
	         //할인0%
	         discountPrice = totalPrice;
	      }else if(totalPrice<20000) {
	         //할인10%
	         discountPrice = (int)(totalPrice * 0.9);
	      }else if(totalPrice<30000) {
	         //할인20%
	         discountPrice = (int)(totalPrice * 0.8);
	      }else if(totalPrice<40000) {
	         //할인30%
	         discountPrice = (int)(totalPrice * 0.7);
	      }else if(totalPrice<50000) {
	         //할인40%
	         discountPrice = (int)(totalPrice * 0.6);
	      }else if(totalPrice<60000) {
	         //할인50%
	         discountPrice = (int)(totalPrice * 0.5);
	      }
	      
	      System.out.println("할인 전 금액은 "+totalPrice+" 입니다");
	      System.out.println("할인 후 금액은 "+discountPrice+" 입니다");
	      
//	      //Scanner 타입으로 scan변수이름 선언
//	      //new Scanner Scanner객체를 "새로 생성하여" scan 변수에 할당(저장)
//	      //단, 인자값 System.in을 을 넣어서 키보드와 연동되도록 지정
//	      Scanner scan = new Scanner(System.in);
//	      System.out.println("결제 금액은?");
//	      //scan변수에 있는 Scanner를 가져다가 nextInt()메서드를 실행하여
//	      //사용자가 입력한 키보드 값을 price변수에 할당(저장)
//	      int price = scan.nextInt();
//	      //(price * 0.6) 소수점 연산이므로 int타입이 아님!
//	      //int타입은 소수점 연산보다 범위가 작으므로
//	      //(int)타입으로 강제 형변환하여 price 타입 int와 동일하게 맞춰서 할당(저장)
//	      price = (int)(price * 0.6);
//	      System.out.println("할인 된 금액 = "+price);
//	      //(price>5000)? price는 5000보다 큰가? true / false 확인
//	      // A결과 : B결과 // true이면 A결과, false이면 B결과 출력
//	      System.out.println((price>5000)? "5000원보다 비쌉니다":"5000원보다 쌉니다");
	   }

}
