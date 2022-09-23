package human20220923;

import java.util.Scanner;

public class java05_0003_numberListBiggestNumber {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 가장 큰 수 출력
		//1. scanner로 정수를 받는다
		//2. 받은 정수list를 for문 들어가서 가장 큰 수를 찾는다
		
		//scanner타입으로 scan 변수 선언
		//새로(new) Scanner 도구를 만들어서 (System.in 키보드와 통로)
		//=(대입연산자) 좌측 scan 변수에 저장
		Scanner scan = new Scanner(System.in);
		
		//int[] int배열 타입으로 intList 변수 선언
		//new int[5] 배열의 길이는 5칸으로 만들어서
		//=(대입연산자) 좌측 intList에 저장
		int[] intList = new int[5];
		
		//초기식 : i = 0;
		//조건식 : i는 intList의 길이보다 미만일 때까지
		//증감식 : i++;
		//(for문 1번 돌면 > i는 1증가 > i는 조건식에 부합되는지 확인>
		// 다음 for문 실행)
		for(int i=0; i<intList.length; i++) {
			System.out.println("숫자를 입력하시오");
			//scan 이라는 변수를 가져와서
			//변수 안에 있는 nextInt() 메서드를 실행하면
			//키보드로 전달받은 숫자를
			//intList 배열의 i번째 공간에 저장
			intList[i] = scan.nextInt();
		}
		for(int i = 0; i<intList.length; i++) {
			System.out.println(intList[i]);
		}
//		int temp = 0;
		//1. 음수 일 경우 temp 값을 0으로 지정하면 오류가 나므로
		//temp 값은 초기값 intList[0];으로 지정.
		int temp = intList[0];
		for (int i = 0; i<intList.length; i++) {
			//for문으로 intList 모두 순회
			//intList[i]의 값과 temp 값을 비교해서
			//intList[i]값이 크면 temp에 저장한다
			//= 두 개 비교해서 큰 값을 temp에 저장하자!
			if(temp<intList[i]) {
				temp = intList[i];
			}
		}
		System.out.println("가장 큰 값 = " + temp);
	}

}
