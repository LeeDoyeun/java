//package : class 파일을 모으는 폴더
package com.human.ex;

//public : 접근제한자로써 공개한다는 의미
//class : 코드 한 덩어리
//java02_type class : 이름으로써 호출할 때 쓰는 별칭
public class java02_type {

	//static : 유일한 메서드 라는 의미
	//void : 리턴 값이 없음 (모든 메서드는 호출하면 리턴값이 있거나 없거나 함.)
	//(String[] args) : 인자값, 매개변수로써 메서드가 사용하는 원재료
	//인자값 : 메서드를 호출할 때 원재료를 넣는다는 용어
	//매개변수 : 메서드 입장으로 봤을 때 받은 원재료를 지칭하는 말
	//String[] : 문자열 들의 배열 (문자열들 모음집)
	public static void main(String[] args) {
		
		//System :  내장 클래스 (자바가 기본적으로 제공하는 클래스)
		//System OS(윈도우)와 자바를 연결해주는 클래스
		//out : System 클래스 내부에 있는 output(출력) 객체(객체 : 하나의 덩어리를 지칭)
		//println() : : 콘솔창에 입력된 값을 출력하는 메서드
		//() : 메서드이고, () 안에는 인자값을 넣을 수 있음.
		//System.out.println(); //sysout + ctrl + spacebar
		
		//int : 숫자 정수 타입만 들어갈 수 있는 선언구
		//num : 별칭(이름, 호칭)
		// = : 대입 연산자
		// 1 : 실제 할당된 값
		// num이라는 변수이름에는 int 타입(숫자, 정수)으로만 데이터를 넣을 수 있다
		//=(대입연산자)를 통해 num이라는 변수이름에는 1이라는 데이터를 넣는다.(데이터를 넣는다 : 할당한다)
		//int num = 1;
		//String : 문자(한 글자:char)+열(다수) -> 문자열 : 글자가 여러 개
		String stringA = "이준석";
		//char charA = "a";
		//System.out.println(num);
		System.out.println(stringA);
		
 		//int num이라는 변수에 숫자 10과 20과 30을 더하여
		//System.out.println(num);으로 출력하시오
		int num = 0;
		int num10 = 10;
		int num20 = 20;
		int num30 = 30;
		//60d을 어디에 저장?
		//= 대입연산자의 우측에 있는 num10 + num20 + num30을 더한 뒤,
		//num 이라는 변수에 데이터 저장
		num = num10 + num20 + num30;
		System.out.println(num);
		
		
		//int num40이라는 변수에 40데이터를 넣고,
		//String stringABC이라는 변수에 박준석이라는 데이터를 넣은 뒤,
		//System.out.println(stringABC);으로 박준석40을 출력하시오
		//문자열과 숫자를 혼합해서 어떻게 출력되는가?
		int num40 = 40;
		String stringABC = "박준석";
		//캐스팅 (자동형변환) : 문자열이 우성이므로 정수인 열성은 우성으로 변형
		//문자열이 정수보다 우선순위
		//stringABC + 40 >> 문자열 + 정수 가능!
		//stringABC는 문자열 타입이므로 박준석40은 문자열로 취급
		stringABC = stringABC + 40;
		System.out.println(stringABC);
		
		//변수이름은 첫글자 소문자를 추천(대문자일 경우 타입과 헷갈릴 수 있음)
		String stringEFG = "휴먼교육센터";
		String stringHIF = "3클래스";
		//" " 공백도 문자열 취급
		String stringOutput = stringEFG +" "+ stringHIF;
		System.out.println(stringOutput);
		
		//본인의 이름과 지금 배우고 있는 언어 "자바"를 포함하여 자기소개의
		//키워드를 더하여 출력하는 구문을 만드세요.
		//String name = "김준석"
		//String job = "선생님"
		//System.out.println(name+job+"입니다") (중간에 띄어쓰기가
		//없으므로 잘 처리해주세요~)
		//EX) "김준석" + "선생" + "9월 14일" + "출근"
		String name = "이도연";
		String job = "학생";
		String xyz = "자바";
		String abc = "입니다.";
		//변수가 하는 일? 데이터를 저장하고 꺼내서 쓰는 저장소로써
		//반복적인 업무를 할 때 사용
		String space = " ";
		System.out.println(name + space + xyz + space + job + abc);
		

	}

}
