package human20220919;

import java.util.Scanner;

public class java03_memoryAndNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questionStep1_1();

	}

	public static void questionStep1_1() {
		// 당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
		// 다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
		// 1. 안심 돈가스 : 9000
		// 2. 등심 돈가스 : 8000원
		// (단, 고객을 확보하기하기 위해
		// 만원이상이면 10%할인, 2만원이상이면 20%할인을 하는
		// 만원 단위별로 10%씩 증가하는
		// 최대 50%할인 대박세일을 진행하려 합니다)

		// Scanner 타입으로 scan변수 이름 선언
		// new Scanner Scanner 객체를 "새로 생성하여" scan 변수에 할당(저장)
		// 단, 인자값 System.in을 넣어서 키보드와 연동되도록 지정
		Scanner scan = new Scanner(System.in);
		System.out.println("안녕하세요 돈가스집입니다");
		System.out.println("메뉴를 선택해 주십시오.");
		System.out.println("1. 안심돈가스 : 가격 9000원");
		System.out.println("2. 등심돈가스 : 가격 8000원");
		int menuChoice1 = scan.nextInt();
		System.out.println("개수를 입력해 주십시오.");
		int menuCount1 = scan.nextInt();
		System.out.println("추가하실 메뉴가 있으십니까?");
		System.out.println("1.예     2.아니오");
		int answer = scan.nextInt();
		int menuChoice2 = 0;
		int menuCount2 = 0;
		if(answer == 1) {
			System.out.println("메뉴를 선택해 주십시오.");
			System.out.println("1. 안심돈가스 : 가격 9000원");
			System.out.println("2. 등심돈가스 : 가격 8000원");
			menuChoice2 = scan.nextInt();
			System.out.println("개수를 입력해 주십시오.");
			menuCount2 = scan.nextInt();
		}
		System.out.println("결제 금액은?");
		int totalPrice = 0;
		String menuString = "";
		int price1 = 0;
		if(menuChoice1 == 1) {
			menuString = "안심돈가스";
			price1 = 9000;
		}else if(menuChoice1 == 2) {
			menuString = "등심돈가스";
			price1 = 8000;
		}
		int price2 = 0;
		if(menuChoice2 == 1) {
			menuString = "안심돈가스";
			price2 = 9000;
		}else if(menuChoice2 == 2) {
			menuString = "등심돈가스";
			price2 = 8000;
		}
		totalPrice = menuCount1*price1+menuCount2*price2;
		if(totalPrice<10000) {
			System.out.println(totalPrice"원");
		} else if (totalPrice>=10000 && totalPrice<20000) {
			System.out.println((int)(totalPrice*0.9)"원");
		} else if (totalPrice>=20000 && totalPrice<30000) {
			System.out.println((int)(totalPrice*0.8)"원");
		}else if (totalPrice>=30000 && totalPrice<40000) {
			System.out.println((int)(totalPrice*0.7)"원");
		}else if (totalPrice>=40000 && totalPrice<50000) {
			System.out.println((int)(totalPrice*0.6)"원");
		}else if (totalPrice>=50000) {
			System.out.println((int)(totalPrice*0.5)"원");
		}
		
		// scan변수에 있는 Scanner를 가져다가 nextInt() 메서드를 실행하여
		// 사용자가 입력한 키보드 값을 price변수에 할당(저장)
		//int price = scan.nextInt();
		// (price*0.6) 소수점 연산이므로 int 타입이 아님!
		// int타입은 소수점 연산보다 범위가 작으므로
		// (int)타입으로 강제 형변환하여 price 타입 int와 동일하게 할당(저장)
		//price = (int) (price * 0.6);
		//System.out.println("할인 된 금액 =" + price);
		// (price>5000)? price는 5000보다 큰가? true/false 확인
		// A결과 : B결과//true이면 A false이면 B 결과 출력
		//System.out.println((price > 5000) ? "5000원보다 비쌉니다" : "5000원보다 쌉니다");
	}

}
