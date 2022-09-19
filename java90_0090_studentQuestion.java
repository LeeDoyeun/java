package human20220919;

public class java90_0090_studentQuestion {

	public static void main(String[] args) {
		
		//int num5(선언부) : int타입으로 num5 변수명으로 메모리에 선언
		//=(대입연산) 우측의 5라는 숫자를 num5 변수에 할당
		//(메모리 영역 안에 num5변수 영역에 5라는 숫자가 있음!)
		int num5 = 5;
		
		//규칙1. 항상 대입연산자 우측 연산을 완료 후 좌측 변수에 할당(저장)
		//규칙2. 우측에서 항상 좌측에 있는 산술연산자부터 실행하기
		//(num5*2; num5변수를 먼저 가져오고, 2숫자를 곱한다(*))
		
		//=num5*2; 메모리 영역 안에 num5변수 영역의 숫자 5를 가져온다
		//가져온 숫자 5를 *2연산을 실행한다(CPU에서 작업 실행)
		//연산 완료 후 =(대입연산자) 좌측에 있는 num5변수에 결과값을 할당(저장)
		num5 = num5*2;
		//System이라는 객체(JVM에 기본적으로 제공하는 객체)를 사용하여
		//out.println() 메서드를 실행한다(인자 num5를 넣고!)
		//(console 창에 num5변수에 있는 값을 출력)
		System.out.println(num5);
				
				
	}

}
