package human20220916;

public class java03_operationPostPrefix {

	public static void main(String[] args) {
//		20220916 history
//		1. 단항연산자(피 연산자(변수)가 하나인 것)
//		/삼항 연산자(?true : false)
//		2. 전위연산자, 후위연산자
//		3. 오버플로우

		// 후위연산자 (연산자(+)가 뒤에 있는 것을 말함)
		// 전위연산자 (연산자(+)가 앞에 있는 것을 말함)
		int x = 10;
		int y = 10;
		// z변수는 선언만 함
		int z;

		System.out.println("-------------");
		x++;
		++x;
		System.out.println("x=" + x);// x = 12

		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y=" + y); // y = 8

		System.out.println("-------------");
		// 후위연산자 : x의 기존값을 그대로 할당(대입)한 뒤에 연산
		// 1. z = x;
		// 2. x++; (x=x+1)
		z = x++;
		System.out.println("z=" + z);// z = 12
		System.out.println("x=" + x);// x = 13

		System.out.println("-------------");
		// 전위연산자 : x값을 연산 후 z에 할당(대입)한다
		// 1. ++x; (x=x+1)
		// 2. z = x;
		// 대입연산자(=) 기준으로 우측 항이 실행되고,
		// 우측 항의 좌측 부터 연산이 시작
		z = ++x;
		System.out.println("z = " + z); // z = 14
		System.out.println("x = " + x); // x = 14

//---------이해가 되었다면 다음 문제를 풀어본다.
//		int i = 10;
//	    int j = 10;

//	      System.out.println(
//	            (i++) +","+ //출력: 10  연산완료값: 11 
//	            (++i) +","+ //출력: 12  연산완료값: 12
//	            (i++) +","+ //출력:  12 연산완료값: 13 
//	            (++i) +","+ //출력: 14  연산완료값:  14
//	            (++i) +","+ //출력:  15 연산완료값:  15
//	            (++i) +","+ //출력: 16  연산완료값:  16
//	            (i++) +","+ //출력: 16  연산완료값: 17
//	            (i)         //출력: 17 연산완료값: 17
//	      );
//	=>결과 값은 10,12,12,14,15,16,16,17
//
//	      System.out.println(
//	            (j--) +","+ //출력: 10 연산완료값: 9
//	            (++j) +","+ //출력: 10  연산완료값: 10
//	            (j++) +","+ //출력: 10  연산완료값: 11
//	            (--j) +","+ //출력: 10 연산완료값: 10
//	            (--j) +","+ //출력: 9 연산완료값: 9
//	            (j--) +","+ //출력:  9 연산완료값: 8
//	            (j++) +","+ //출력:  8 연산완료값: 9
//	            (j)       //출력: 9 연산완료값: 9
//        );
//	=> 결과 값은 10,10,10,10,9,9,8,9

		int a = -100;
		// int result = -1*(-100);
		// 부호연산자는 변수 앞에 부호를 붙이는 것
		// 부호를 붙힌다는 것은 부호 1 곱셈과 같다 (ex) -1*변수명
		int result = -1 * a;
		System.out.println(result);

		// postPreFixExample();
		int int1 = 10;
		int int2 = 4;
		// 10 나누기 4 = 2.5
		// int는 정수표현 : 소수점 이후는 표현이 불가 = 2만 출력
		int result2 = int1 / int2;
		// => double result3 = int1 / int2;
		// 만약 이렇게 쓴다면
		// result3에 2라는 정수를 double로 형변환 하여 변수에 할당 2.0이 나옴
		// 따라서 아래와 같이 써야 2.5 도출
		double result3 = (double) int1 / int2;
		System.out.println(result2);
		System.out.println(result3);

		// overflow
		// 타입이 갖고 있는 max값 보다 더 많은 수치를 받을 경우를 일컫음.
		int o = 10000000;
		int p = 10000000;
		double q = (double) o * p;
		System.out.println(q);

		// 2중 for문과 break;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("현재 i는" + i + " j는" + j);
				if (j >= 2) {
					// 가장 가까운 반복문을 강제 종료
					break;
				}
			}
		}

	}

}
