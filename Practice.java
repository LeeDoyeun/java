package human20221011;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// 1번
//		int x = 10;
//		int y = 4 ;
//		(1) int result = x/y;
//		(2) double result = (double) x/y;
//		System.out.println(result);

		// 2번
//		double a = 3.5;
//		double b = 4.7;
//		double result = a + (int)b; //문제 정답
//		System.out.println(result);

		// 3번
//		String a = "3.4";
//		String b = "4";
//		int result = (int)Double.parseDouble(a)*Integer.parseInt(b);
//		System.out.println(result);

		// 4번
//		String a = "10";
//		int b = 3;
//		double c = 4.5;
//		int result = (int) Math.pow(Integer.parseInt(a),b) + (int)(c*b);
//		System.out.println(result);

		// 5번
//		for(int x = 1; x<5; x++) {
//			for(int y = 1; y<3; y++) {
//				int result = 2*x +4*y;
//				if(result == 10) {
//					System.out.println("----x와 y 순서로 출력됩니다.---");
//					System.out.println(x);
//					System.out.println(y);
//				}
//			}
//		}

		// 6번
//		int a = (int)(Math.random()*100);
//		int b = (int)(Math.random()*100);
//		if(a>b) {
//			System.out.println("a는" + a + "-" + "b는" + b);
//		} else {
//			System.out.println("b는" + b + "-" + "a는" + a);
//		}

		// 7번
//		int a = (int)(Math.random()*2);
//		int b = (int)(Math.random()*2);
//		int c = (int)(Math.random()*2);
//		int d = (int)(Math.random()*2);
//		if(a+b+c+d == 0) {
//			System.out.println(a+"/"+b+"/"+c+"/"+d);
//			System.out.println("모");
//		} else if(a+b+c+d == 1) {
//			System.out.println(a+"/"+b+"/"+c+"/"+d);
//			System.out.println("도");
//		} else if(a+b+c+d == 2) {
//			System.out.println(a+"/"+b+"/"+c+"/"+d);
//			System.out.println("개");
//		} else if(a+b+c+d == 3) {
//			System.out.println(a+"/"+b+"/"+c+"/"+d);
//			System.out.println("걸");
//		} else if(a+b+c+d == 4) {
//			System.out.println(a+"/"+b+"/"+c+"/"+d);
//			System.out.println("윷");
//		}

		// 8번
//		int a = (int)(Math.random()*10)+1;
//		System.out.print(a+"/");
//		for(int i=1;i<=a; i++) {
//			System.out.print("*");
//		}

		// 9번
//		int a = (int)(Math.random()*20)+1;
//		System.out.println(a+"의 약수는");
//		for(int i = 1; i<=a; i++) {
//			if(a%i==0) {
//				System.out.print(i);
//				System.out.print("/ ");
//			}
//		}

		// 10번
//		int a = (int)(Math.random()*6);
//		System.out.println(a);
//		for(int i = 1; i<=a;i++) {
//			for(int j = 1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = a-1; i>=1;i--) {
//			for(int j = i;j>=1;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 11번
//		등급은 B 입니다.
//		등급은 C 입니다.
//		등급은 D 입니다.
//

		// 12번
//		범퍼카 가능
//		자이로드롭 가능

		// 13번
//		3
//		4
//		5
//		6

		// 14번
//		0 1 2 3 4 5 6 7 8 9 
//		10 9 8 7 6 5 4 3 2 1
//		9 7 5 3 1
//		
		// 15번
//		30
//		9
//		51
//		x:29 y:22

		// 16번
//		6 5 4 
//		5 4 3 
//		4 3 2 
//		

		// 17번
//		0 
//		0 
//		0 
//
//		1 
//		0 
//		0 
//
//		1 
//		1 
//		0 

		// 18번
//		TV myTv = new TV("LG",2021,43);
//		myTv.show();

		// 19번
//		Circle circle = new Circle();
//		circle.setRadius(5);
//		System.out.printf("넓이 : %.2f\n", circle.getArea());
//		
//		Rectangle rec = new Rectangle(10,5);
//		System.out.println("넓이 : "+ rec.getArea());
//		
//		Triangle tri = new Triangle();
//		tri.setSize(6,8);
//		System.out.println("넓이 : "+ tri.getArea());

		// 20번
//		회원 정보를 출력합니다.
//		1 28 이준호 mem1Id 20220815
//		회원 정보를 출력합니다.
//		2 40 정명석 seok 20220701
//		회원 정보를 출력합니다.
//		3 27 우영우 wootothe 20220816

		// 21번
//		학원이름 : 동물아카데미
//		주소 : 아산
//		개업년도 : 
//		학생수 : 10
//		강의수 : 3
//		학원이름 : 휴먼아카데미
//		주소 : 천안
//		개업년도 : 2015
//		학생수 : 150
//		강의수 : 6
//		
//		학원이름 : 동물아카데미
//		주소 : 아산
//		개업년도 : 2021
//		학생수 : 30
//		강의수 : 5
//		학원이름 : 휴먼아카데미
//		주소 : 천안
//		개업년도 : 2015
//		학생수 : 200
//		강의수 : 6

		// 22번
//		퀴즈 최대 점수:30
//		common 1
//		math 2
//		>point: 5
//		computer 3
//		>point: -5
//		history 4
//		history 999
//		>point: 20
//		history 999
//		>point: -20

		// 23번
//		메뉴보기
//		김밥:3000원
//		짜장면:6000원
//		핫도그:2000원

		// 24번
		// 주문을 위한 메뉴 선정
//		Menu jjajang = new Menu("짜장", 4900);
//		Menu jjambbong = new Menu("짬뽕", 5900);
//		Menu tangsook = new Menu("탕수육", 13900);
		// 메뉴를 조합하여 주문을 생성
//		Menu[] menuArr = { jjajang, jjambbong, tangsook };
//		Order order = new Order(123, menuArr);
		// 주문 결과 출력
//		System.out.printf("주문 합계: %d원\n", order.totalPrice());

		// totalPrice() 메서드는 다음과 같다.
//		public int totalPrice() {
//			/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
//				int totalPrice = 0;
//				for(int i = 0; i < menus.length; i++) {
//					totalPrice += menus[i].price;
//				}
//				return totalPrice;
//			}

		// 25번
		// guide() 메서드는 다음과 같다.
//		public static String guide(int floor) {
//		String result = null;
//		if(floor>=1 && floor<=10) {
//			result = "저층 엘레베이터";
//		} else if(floor>=11 && floor <=20) {
//			result = "고층 엘레베이터";
//		}
//		return result;
//		}

		// 26번
//		double dollar = dice() + dice() + dice();
//		double won = exchange(dollar);
//		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);

		// 27번
//		printPay(10.00, 40);
//		printPay(10.00, 50);
//		printPay(7.50, 38);
//		printPay(8.50, 66);

		// 28번
		// 입력값 받기
//		double start = 72.4;
//		int after = 5;
//		// 계산
//		double result = weight(start, after);
//		// 결과 출력
//		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);

		// 29번
		// 배열 생성
		String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate",
				"Alex", "Daniel", "Hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};
		// 1등 인덱스 검색
		int i = topIndex(scores);
		int j = lastIndex(scores);
		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
		System.out.printf("꼴등: %s(%d점)\n",names[j],scores[j]);

	}

	// 26번 풀이 메소드(1)
//	public static int dice() {
//		/*
//		 * Math.random() 메소드를 활용하여 1~6 사이의 정수를 반환하도록 하시오
//		 */
//		return (int) (Math.random() * 6) + 1;
//	}

	// 26번 풀이 메소드(2)
//	public static double exchange(double dollar) {
//		/* 입력받은 달러를 환전하여 반환 하시오 */
//		return dollar * (1082.25108);
//	}
	// 27번 풀이 메서드
//	public static void printPay(double basePay, int hours) {
//		double pay = 0.0;
//		/* 해당 메소드를 완성하세요. */
//		if (basePay >= 8) {
//			if (hours <= 40) {
//				pay = basePay * hours;
//			} else if (hours > 40 && hours <= 60) {
//				pay = basePay * 40 + basePay * 1.5 * (hours - 40);
//			} else if (hours > 60) {
//				System.out.println("초과 근무시간 에러!");
//			}
//		} else if (basePay < 8) {
//			System.out.println("최저 시급 에러!");
//		}
//		if (pay != 0) {
//			System.out.printf("$ %.2f\n", pay);
//		}
//	}
	// 28번 풀이 메서드
	// 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
//	public static double weight(double currentWeight, int months) {
//	double expectedWeight = currentWeight;
//	for (int i = 1; i<=months; i++) {
//	expectedWeight += 0.231;
//	}
//	return expectedWeight;
//	}
	//29번 풀이 메서드
	// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		int topIndex = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>arr[topIndex]) {
				topIndex = i;
				}
			}
	return topIndex;
	}
	//29번 풀이 메서드
	//정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int lastIndex(int[] arr) {
		int lastIndex = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<arr[lastIndex]) {
				lastIndex = i;
				}
			}
	return lastIndex;
	}


}
