package human20220921;

import java.util.Scanner;

public class java04_0005_randomAndEquals {

	public static void main(String[] args) {
		
	
		
//		int num = 0;
		int exNum = 0;
		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;
		// 초기식 i = 0; 조건식 i<10; 증감식 i++(for문 한 번 돌 때마다 1씩 i증가)
		for (int i = 0; i < 6; i++) {
			exNum = (int)(Math.random()*45)+1;
			if(lotto1 == 0) {
				//lotto1 변수에
				//=(대입연산자)를 통해서
				//exNum변수의 값을 가져다가 할당(저장)
				//exNum 변수에 예를 들어 23이라는 숫자가 있다고 가정한다면,
				//=(대입연산자) 우측부터 시작하여,
				//exNum 변수를 메모리에서 불러다가 값을 가져온다
				//23이라는 숫자가 가져와져서,
				//=(대입연산자) 좌측에 있는 lotto1이라는 변수에 할당(저장)
				lotto1 = exNum;
			} else if(lotto2 == 0) {
				lotto2 = exNum;
			} else if(lotto3 == 0) {
				lotto3 = exNum;
			}else if(lotto4 == 0) {
				lotto4 = exNum;
			}else if(lotto5 == 0) {
				lotto5 = exNum;
			}else if(lotto6 == 0) {
				lotto6 = exNum;
			}
		}
			System.out.println("로또 번호는");
			System.out.println(lotto1 + "/" + lotto2 + "/" + lotto3 + "/");
			System.out.println(lotto4 + "/" + lotto5 + "/" + lotto6 + "/");
			// 0.0~0.999 곱하기 10, 100하면
			// 0.0~9.999, 0.0~99.999
			// 메모리 num이라는 변수에다가 Math.random() 메서드로 실행한 값을
			// 저장
			// Math.random(); 소수점 표기한
			// 0.0 보다 크거나 같고 1.0 보다 작은 값 출력(0.9999..)

//			num = (int) (Math.random() * 45) + 1;
//			System.out.println(num);
			
			
		
		Scanner scanner = new Scanner(System.in);
		String result = "";
		String study = "";

		for (;;) {
			System.out.println("값을 입력하시오!");

			// A.equals("B")
			// equals()메서드를 사용하여 A변수의 데이터(문자열)와
			// "B"문자를 비교해서 참이면(true)이면 {}코드 영역 실행
			// 유사) == :숫자 비교

			// Scanner 타입으로 scanner 변수명으로 메모리에 선언
			// =(대입연산자)를 통해 새로만든 Scanner 도구를 할당(저장)
			// 단, 키보드와 연동할 수 있는 System.in 객체를 사용(인자값)

			study = scanner.nextLine();
			if (study.equals("이것은 자바다")) {
				result = "자바 공부 시작!";
			} else if (study.equals("Jquery")) {
				result = "Jquery 공부 시작!";
			} else if (study.equals("SQL")) {
				result = "Data base 공부 시작!";
			} else if (study.equals("HTMLCSS")) {
				result = "HTML / CSS 공부 시작!";
			} else if (study.equals("Spring")) {
				result = "SpringFramework 공부 시작!";
			}
			System.out.println(result);

		}

	}
}
