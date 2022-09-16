package human20220916;

public class 문제풀이0916 {

	public static void main(String[] args) {
		double result = examEvenAndOddCustom(30);
		System.out.println(result);

	}
	public static double examEvenAndOddCustom(int num) {
		double count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				count++;
				System.out.println(i + "의 값은 2의 배수입니다!");
				if (i % 4 == 0) {
					count++;
					System.out.println(i + "의 값은 4의 배수입니다!");
				} 
			} 
			if (i % 3 == 0) {
				count++;
				System.out.println(i + "의 값은 3의 배수입니다!");
			} 
			if(i % 5 == 0) {
				count++;
				System.out.println(i + "의 값은 5의 배수입니다!");
			}
		}
		System.out.println("2~5의 배수 갯수의 합은" + count + "입니다.");
		// 1부처 매개변수 num까지 범위 내에서
		// 2의 배수, 3의 배수, 4의 배수, 5의 배수의 경우
		// 각각
		// System.out.println(num +"의 값은 ?의 배수입니다!");
		//-->2의 배수는 4의 배수를 포함한다 효율적으로 메모리 관리를 하기 위해
		//--2의 배수 if문 안에 4의 배수 if문을 넣으면 좋다.
		// 문구를 출력하고, main 메서드에서
		// examEvenAndOddCustom return 값인 3의 배수, 4의 배수, 5의 배수
		// 갯수를 double 타입의 숫자로 출력하시오.

		// int num은 double로 자동형변환(casting)이 가능함
		// ()강제형변환 가능
		
		//관점 : 하나의 행동, 물체 모든 것을 다양한 시점으로 보는 것
		//1.개발자 관점 : 코드의 가독성 : 다른사람이 본인의 코드를 객관적으로 분석할 수 있는가?
		//--변수이름 : 변수이름으로 변수(메서드, 클래스 이름)의 속성을 알 수 있어야 한다.
		//-----------구체적으로 쓰라는 말.
		//--띄어쓰기 : 코드영역{}을 구분짓고, 가독성을 높혀서 본인 코드 보기 편하게 수정할 것.
		//--조건절, 반복문의 위치를 전체적으로 볼 수 있도록 코드 정렬
		//2.컴퓨터(시스템)관점 : 리소스 관리(컴퓨터 성능 최적화)
		//--컴퓨터가 개발자가 쓴 코드를 해석하고 실행하는 횟수를 줄이는 작업
		//--시간적 튜닝(알고리즘 개선(빅오표기법))
		//--공간적튜닝(메모리 공간 개선(변수의 갯수를 줄이는 작업))
		//<3>.사용자 관점 : (일반유저) > 문제해결능력
		return count;
	}

}

