package human20220920;

import java.util.Scanner;

public class java04_0005_randomAndEquals {

	public static void main(String[] args) {
		int num = 0;
		//초기식 i = 0; 조건식 i<10; 증감식 i++(for문 한 번 돌 때마다 1씩 i증가)
		for(int i = 0; i<6; i++) {
			//0.0~0.999 곱하기 10, 100하면
			//0.0~9.999, 0.0~99.999
			//메모리 num이라는 변수에다가 Math.random() 메서드로 실행한 값을
			//저장
			//Math.random(); 소수점 표기한
			//0.0 보다 크거나 같고 1.0 보다 작은 값 출력(0.9999..)
			
			num = (int)(Math.random()*45)+1;
			System.out.println(num);
		}
	      Scanner scan = new Scanner(System.in);
	      String inputData = "";
	      for(;;) {
	         System.out.println("값을 입력하시오!");
	         inputData = scan.nextLine();
	         //A.equals("B")
	         //equals()메서드를 사용하여 A변수의 데이터(문자열)와
	         //"B"문자를 비교해서 참이면(true)이면 {}코드 영역 실행
	         //유사) == :숫자 비교
	         if(inputData.equals("이도연")) {
	            System.out.println("휴먼교육센터 학생");
	         }else if(inputData.equals("전도연")) {
	            System.out.println("배우");
	         }else if(inputData.equals("장도연")) {
	            System.out.println("개그우먼");
	         }else {
	            System.out.println("다시 입력하세요!");
	         }
	      }


	}

}
