package human20220915;

public class java04_casting2 {

	// 메인메서드 : 자바 프로그램의 시작점!
	public static void main(String[] args) {

		// 자바의 시작점은 6번째 줄인 public static void main에서 시작
		// 순차적으로 7줄 부터 8,9,10.. 한 줄씩 실행
		// 11번째 줄인 examEvenAndOddCustom(); 코드가 실행!
		double result = examEvenAndOddCustom(30);
		System.out.println(result);
		// public static void examEvenAndOddCustom이 실행
		// examEvenAndOddCustom 내용이 다 실행되면 다시 12번째 줄 부터 시작
	}

	// 짝수와 홀수
	public static double examEvenAndOddCustom(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "의 값은 2의 배수입니다!");
			} 
			if (i % 3 == 0) {
				System.out.println(i + "의 값은 3의 배수입니다!");
			} 
			if (i % 4 == 0) {
				System.out.println(i + "의 값은 4의 배수입니다!");
			} 
			if(i % 5 == 0) {
				System.out.println(i + "의 값은 5의 배수입니다!");
			}
		}
		double count = num/2 + num/3 + num/4 + num/5;
		System.out.println("2~5의 배수 갯수의 합은" + count + "입니다.");
		// 1부처 매개변수 num까지 범위 내에서
		// 2의 배수, 3의 배수, 4의 배수, 5의 배수의 경우
		// 각각
		// System.out.println(num +"의 값은 ?의 배수입니다!");
		// 문구를 출력하고, main 메서드에서
		// examEvenAndOddCustom return 값인 3의 배수, 4의 배수, 5의 배수
		// 갯수를 double 타입의 숫자로 출력하시오.

		// int num은 double로 자동형변환(casting)이 가능함
		// ()강제형변환 가능
		return count;
	}

}
