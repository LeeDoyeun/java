package human20220916;

public class fuxi0916 {

	public static void main(String[] args) {
		   //연산자(연산자 우선순위와 산술연산자/ 대입연산자/ 비교연산자/ 논리연산자) 
		   //산술연산자 : +,-,*,/ 등등
		   //대입연산자 : =, +=, -=, *= 등등 (우측 데이터를 좌측 변수에 넣기(할당)
		   //비교연산자 : ==, <, <= 등등 (좌측, 우측 데이터를 비교하여 "true/false"확인
		   //논리연산자 : !, &&, || 등등 (논리적으로 구분)
		   //!(반전, 거꾸로), &&(and, 좌측과 우측이 모두 참일 경우 참(true)), 
		   //||(or, 좌측과 우측 중에 하나만 참이여도 참(true))
		int int20 = 20;
		int20 +=50;
		//int20 = int20 + 50
		System.out.println(int20);
		System.out.println(int20<10);
		//10보다 크기 때문에 false가 뜬다
		System.out.println(550<=550);
		//true
		System.out.println(!(550<=550));
		//false
		System.out.println((550<=550)&&false);
		//true&&false => 둘다 참이 아니라 false
		System.out.println((550<=550)||false);
		//true||false => 둘 중 하나라도 참이기 때문에 true
		
	}

}
