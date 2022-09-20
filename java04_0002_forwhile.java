package human20220920;

import java.io.IOException;

public class java04_0002_forwhile {

	// 20200920 history
	// 1. for와 while과 do while
	// 2. 반복문과 break와 continue
	// continue : 하단 코드 생략하고 처음으로 돌아가기
	// 3. if와 switch
	// 4. math.Random()
	// int num = (int)(Math.random()*n)+startNumber;
	// 5. key값 입력받음 + 메서드 실행 타임
	// 6. equals()
	public static void main(String[] args)throws Exception {
		studyForWhile();

	}

	public static void studyForWhile() {
		// for문 : 반복문 : 특정값 기준으로 조건이 성립할 때까지 코드 반복
		// 메모리에 sum이라는 변수를 선언하고 (타입은 int)
		// 0이라는 숫자를 = (대입연산자)를 통해 sum에 할당(저장)
		int sum = 0;
		// 초기식 : int i = 1; i변수 기준으로 1부터 시작한다
		// 조건식 : i <= 100; i는 100이하일 때가지 for문을 실행한다
		// 증감식 : i++; for문 1번 돌 때마다 i는 1씩 증가한다
		for (int i = 1; i <= 100; i++) {
			// sum + i; sum이라는 변수를 가져다가 i를 더항
			// =(대입연산자)를 통해 sum이라는 변수에 할당(저장)
			// sum = sum + i
			// 1 = 0 + 1;
			// 3 = 1 + 2;
			// 6 = 3 + 3;
			// 10 = 6 + 4;
			sum = sum + i;
		}
		System.out.println(sum);
		// sum 변수의 값을 0으로 저장
		sum = 0;
		// for문 계속 돌기(조건식이 없으므로 무한 돌기)
		for (int i = 1;; i++) {
			sum = sum + i;
			// if 조건이 성립되면 {}코드 안에 break; 코드가 실행되어
			// 가장 가까운 for문을 종료 시킴
			if (i == 100) {
				break;
			}
		}
		System.out.println(sum);

		sum = 0;
		int i = 1;
		// for문 계속 돌기(조건식이 없으므로 무한 돌기)
		for (;;) {
			sum = sum + i;
			// if 조건이 성립되면 {}코드 안에 break; 코드가 실행되어
			// 가장 가까운 for문을 종료 시킴
			if (i >= 100) {
				break;
			} else {
				i++;
			}
		}
		System.out.println(sum);

		// boolean 타입은 true/false값만 넣을 수 있음
		// boolean flag 변수 이름으로 메모리에 영역 선언
		// =(대입연산자)를 통해 true 값을 flag 변수에 할당(저장)
		boolean flag = true;
		// 0 이라는 숫자를 sum 변수를 가져다가 저장
		sum = 0;
		i = 0;
		// while() : 조건이 true일 때까지 무한 반복
		while (flag) {
			System.out.println(i);
			i++;
			if (i > 5) {
				break;
			}
		}
		i = 0;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		i = 0;
		while (flag) {
			// i를 2로 나누어서 나머지가 0일 경우 (짝수)
			i++;
			if (i % 2 == 0) {
				System.out.println(i);
				// 짝수일 경우만 출력하고,
				// 1~100보다 작을 때까지 while문을 돌리시오
				// i++; 후위연산자로 i값을 먼저 출력하고, i를 1증가
				
				// if(i==100) i의 값을 메모리에서 가져와서
				// 100이라는 숫자와 동일하면 {}코드 영역을 실행
				// {}코드 영역의 break;를 실행하여
				// 가장 가까운 for문을 종료
				if (i >= 100) {
					break;
				}
			}
		}

	}
	
}