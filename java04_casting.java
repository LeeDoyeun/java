package com.human.ex;

public class java04_casting {

	//메인 메서드 : 자바 프로그램의 시작점!
	public static void main(String[] args) {
		//int 4byte
		//double 8byte : int보다 더 많은 숫자를 표현할 수 있음
		//int 타입의 숫자를 double 타입으로 바꿀 수 있음!
		
		//변수의 선언부는 바꿀 수 없지만, (정적 타입 선언)
		//데이터는 이동이 가능하므로 형변환(casting)이 존재
		
		//자동캐스팅x 강제캐스팅o double > int
		int intDataCasting = 1000;
		double doubleDataCasting = 990;
		//double 영역은 int 영역보다 크므로,
		//int 영역에서 double 데이터 영역을 포함하지 못하여 에러가 발생
		//따라서 (int)문구 작성으로 double데이터를 int 타입 변수에 강제적으로 할당하면 되는데,
		//강제 캐스팅을 할 경우 캐스팅 대상 타입(int)에서 벗어난 데이터일 경우
		//손실 발생 위험 있어서 현업에서는 권장하지 않음.
		intDataCasting = (int) doubleDataCasting;
		
		//자동 캐스팅 int > double
		int intData = 1000;
		double doubleData = 990;
		System.out.println(intData);
		System.out.println(doubleData);
		//intData 변수에 할당된 1000을 대입연산자(=)를 통해 doubleData변수에 저장(할당)
		doubleData = intData;
		System.out.println(doubleData);

		// int타입으로 변수이름 num10으로 선언
		// 10이라는 데이터를 대입연산자(=) 좌측 num10 변수에 전달(할당)
		int num10 = 10;
		// (num10==20) : num10 변수의 값이 20과 같으면 조건 성립(true)
		// {}코드 영역실행
		if (num10 == 20) {
			System.out.println("num10은 20이다!");
			// (num10==15) : num10 변수의 값이 15와 같으면 조건 성립(true)
		} else if (num10 == 15) {
			System.out.println("num10은 15이다!");
			// (num10==10) : num10 변수의 값이 10과 같으면 조건 성립(true)
		//if문은 조건이 성립되는 {}영역에 들어갈 경우 하단 부분 조건은 생략
		} else if (num10 == 10) {
			System.out.println("num10은 10이다!");
			// if 문의 조건이 성립되지 않을 경우에 else{}코드 영역이 실행!
		} else if (num10 == 10) {
		System.out.println("num10은 10이다!!!");
		// if 문의 조건이 성립되지 않을 경우에 else{}코드 영역이 실행!
		//*모든 if 문이 성립 안될 경우에만 else{}코드 영역 실행!
		
	}
		else {
			System.out.println("num10은 20이 아니다!");
		}
		
		double sum = 1048;
		for(int i = 1; i<30; i++) {
			System.out.println("현재 for문 실행 순서"+ i + " 번째 입니다.");
			System.out.println("현재 sum은" + sum + "입니다.");
			
			//1. for문이 0번째 실행되고 종료된다.
			//2. for문 안에 if문 넣고 break를 실행하면 for문까지 종료된다!
			//>for문에 특정 값이 되면 강제적으로 for문 종료할 수 있다!
			if(sum<2) {
				System.out.println(i+"번째에서 종료합니다. 현재 sum은" + sum + "입니다.");
				break;	
			}
			sum = sum/2;
		}
		

	}

}
