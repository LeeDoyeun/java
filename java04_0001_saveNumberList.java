package human20220923;

import java.util.Scanner;

public class java04_0001_saveNumberList {

	public static void main(String[] args) {
		// 숫자 1부터 5까지 저장하는 고정배열을 만드시오
		
		//20220923 history
//		1. 메모리의 stack과 heap과 new연산자
		//배열 : 1,2,3,4,5
		int intA = 1;
		int intB = 2;
		int intC = 3;
		int intD = 4;
		int intE = 5;
		//int 타입으로 배열(여러개 담을 수 있는)[] 선언
		//이름은 intList
		//=(대입연산자) 우측 항에 int[]타입으로 새로 독립적으로 생성
		//길이는 5>>int[5];
		int[] intList = new int[5];
		
		//메모리에 있는 intList배열 변수를 가져다가
		//[0] 0번째 있는 배열순서에
		//=(대입연산자)를 통해 1이라는 숫자를 할당(저장)
		intList[0] = 1;
		intList[1] = 2;
		intList[2] = 3;
		intList[3] = 4;
		intList[4] = 5;
		
		//A.length : 배열 A[]의 길이를 반환해주는 코드
		for(int i = 0; i<intList.length; i++) {
			System.out.println(intList[i]);
		}
		
		System.out.println(intList[0]);
		//고정배열 : 배열의 길이가 정해진것
//		2. 고정배열과 가변배열
//		가변배열 : arrayList.get()과 set ()과 remove()
//		고정배열 : String[] NAME = new String[N];
//		String[N] = "TEXT";
		
		//0,1,2,3
		//자료형(클래스) 변수이름 = new 자료형(클래스)();
		//1. int와 같이 앞에 소문자이면 기본타입으로 변수 안에 값을 저장
		//2. String과 같은 앞의 대문자이면 같은 데이터일 경우 같은 주소값을 가짐
		//3. 단 new라고 붙이면 독립적인 메모리 영역을 할당하여 사용
		//new 연산자와 리터럴 방식의 차이
		//int[]saveNumber = newint[4]
		String testString = new String("이도연");
		Scanner testScan = new Scanner(System.in);
		String testString_2 = new String("이도연");
		String testString_3 = "이도연";
		String testString_4 = "이도연";
		
		//System.identityHashCode() 메모리 주소를 반환해주는 메서드
		//메모리 주소란 메모리영역을 알 수 있는 번지수(진짜 주소)
		System.out.println(testString);
		System.out.println(System.identityHashCode(testString));
		System.out.println(System.identityHashCode(testString_2));
		System.out.println(System.identityHashCode(testString_3));
		System.out.println(System.identityHashCode(testString_4));

	}

}
