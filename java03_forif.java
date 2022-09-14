package com.human.ex;

public class java03_forif{

	public static void main(String[] args) {
		// for 반복문 (특정 코드를 반복적으로 실행하는 구문)
		// for() ()안에 특정조건이 만족할 때까지 반복하는 구문
		// 선언부(초기식)
		// int x = 0; x라는 변수에 int 타입으로만 들어간다고 선언
		// x에 0이라는 데이터를 할당(= 대입연산자)
		// 조건부
		// x<10; x라는 변수가 10 미만일 경우까지 for문을 실행
		// 증감식
		// x++ for문 한 번 실행 될 때 마다 x변수는 1씩 증가
		for (int x = 1; x <= 10; x++) {
			System.out.println("for문시작 " + x + " 입니다");
		}
		// double num = 1048을 할당해주고, (정수는 0,1,2,3,4,5...수소 표현)
		// 1048을 지속적으로 1/2로 줄인다면 몇 번에 걸쳐서 줄여야
		// 2보다 작게 되는지 알 수 있는 출력하는 for문을 작성하시오
		double num = 1048;
		for (int y = 1; y <= 10; y++) {
			System.out.println("for문 시작" + y + "번째 입니다");
			System.out.println("num은 지금" + num + "입니다");
			// =(대입연산자) 기준으로 우측에 있는 코드를 실행하고, 결과값을 좌측에 할당
			// num10/2의 값이 대입연산자 좌측에 있는 num10이라는 변수에 넣기(할당)
			num = num / 2;
			// if 조건문 (특정 코드를 일정한 조건(조건이 성립할 경우)에 의해 실행하는 구문)
			//if(true) 항상 if문 조건절에 true가 되도록 조건을 성립하면 {}코드 실행
			if (num < 2) {
				System.out.println("for문 시작" + y + "번째 입니다");
				System.out.println("num은 지금" + num + "입니다");
			}
		}
		//int는 정수를 표현하는 타입이므로 소수점 표현 불가
//		int intExample = 1;
//		//double은 소수점을 표현하는 타입이므로 1.0처럼 소수점 표기
//		double doubleExample = 1;
//		//float은 소수점을 표현하는 타입이므로 1.0처럼 소수점 표기
//		float floatExample = 1;
		String stringA = "abcd";
		String charA="a";
		int j = 1;
		for (; j < 10;) {
			System.out.println("j는" + j + "이다");
			j = j + 1;
		}

		// 문제 푸는 것에 흥미가 있으신 분은
		// [프로그래머스], 백준 사이트에 가서 알고리즘 문제 풀기
		// 숫자 1부터 30까지 순회(반복)하면서
		// 2로 나누어서 나머지가 없는 숫자를 출력하시오
		for (int k = 0; k < 5; k++) {
			// k라는 숫자를 2로 나누어서 나머지를 출력
			// k = 3일 경우 2로 나누면 나머지 (1)을 출력
			System.out.println(k + "를 2로 나누면 나머지가" + k % 2);
		}
		// 숫자 1부터 30까지 순회(반복)하면서
		// 2로 나누어서 나머지가 없는 숫자를 출력하시오
		// for문 안에 if문
		for (int i = 1; i <= 30; i++) {
			// if(k%2>>if문()조건식 시작으로, k를 2로 나누어서 나머지를 출력
			// ==은 비교연산자로 같을 경우를 뜻함
			// (ex) 1==1>>조건성립
			// (ex) 변수 a = 10일 경우 a==10 이여도 조건성립
			if (i % 2 == 0)
				System.out.println("2로 나누어서 나머지가 없는 숫자는" + i);
		}
		// 2중 for문 = for문 안에 for문
		for (int a = 0; a <= 5; a++) {
			System.out.println("@@현재 for문 a실행 중!! a의 값은" + a);
			for (int b = 0; b <= 3; b++) {
				System.out.println("현재 for문 b실행 중!! b의 값은" + b);
			}
		}
		// 3의 배수
		for (int c = 0; c <= 30; c = c + 3) {
			// !란 반전의 의미, 거꾸로!!
			// !=는 같지 않다!
			// if(k!=0) if문은 [k가 0과 같지 않을 때] 성립이(참) 된다.
			if (c != 0) {
				System.out.println("현재 3의 배수는" + c + " 입니다");
			}
		}
		// 가로 32cm, 세로 27cm의 1cm 단위의 눈금종이가 있다.
		// 1줄씩 확인하며 (가로) 1cm 마다 움직이는 로봇이 있는데,
		// 가로 세로 길이 cm 합이 3의 배수 일 경우
		// "가로 ?cm 더하기 세로 ?cm는 3의 배수입니다" 구문을 출력하시오
		// for문 안에 for문을 사용하고 if을 통해 조건을 확인하시오
		for (int e = 1; e <= 27; e++) {
			for (int d = 1; d <= 32; d++) {
				if ((d + e) % 3 == 0) {
					System.out.println("가로" + d + "cm 더하기 세로" + e + "cm는 3의 배수입니다");
				}
			}
		}
		// 매개변수와 인자
		// String abcdSave : abcdSave 변수에는 String 문자열만 저장 가능 선언!
		// =methodTest() : methodTest()에서 나오는 문자열을 대입연산자 좌측에 할당
		// ="abcd";>>methodTest() 호출(불러오면)하면 "abcd"문자열을 받음

		String name = "김준석";
		// mehtodTest(name)는 name이라는 인자값(전달값)을 넣고 실행
		String abcdSave = methodTest(name);
		System.out.println("main method에서 실행!!" + abcdSave);
	}


	// public 접근제한자
	// static 유일한 메서드
	// void 리턴 값이 없음
	public static String methodTest(String inputName) {
		System.out.println("정상적 출력!" + inputName);
		return inputName;

	}

}
//9월 14일 자 수업내용
//1. type은 선언부로써 변수에 들어갈 수 있는 타입을 선언하는 부분이며,
//=(대입연산자) 우측 부분의 값이 좌측 변수에 할당되는 개념
//2. for문(2중for문)의 초기식, 조건식, 증감식이 있고 {}코드가 조건식을 만족할 때까지 실행
//3. if문의 조건식은 성립(true)될 경우 if문 안에 {}코드가 실행
//4. 매개변수는 다른 메서드에 특정 값을 전달하여 받는 매개체를 일컫음
