package human20220921;

import java.util.Scanner;

public class java08_0001_groupProject_calc {

	public static void main(String[] args) {
		// *문자열자르기
		// *객체화
		// *continue
		// 특정 값을 입력하면 자동으로 계산해주는 계산기를 만드시오
		// ex) 12입력하고, +입력하고, 30입력하면
		// 42출력할 것

		// 계산기 자동인식 시스템을 구축하려고 합니다
		// 처음에 "본 시스템은 숫자와 연산자를 반복적으로 입력 받습니다,
		// =를 입력하면 입력이 완료됩니다"
		// 출력이 되고,
		// 시작을 하면 "숫자를 입력하시오" 두 번째에는 "연산자를 입력하시오"를
		// 계속 반복합니다 (반복문)
		// if문과 for문, ==과 equals()와 변수 등등을
		// 사용하여 본 시스템을 구축하시오

		// 키보드 값을 입력받는 Scanner 도구 만들기
		Scanner scan = new Scanner(System.in);

		// 숫자 입력받는 변수
		int input_num = 0;
		// 연산자 입력받는 변수
		String input_calc = "";

		System.out.println("본 시스템은 숫자와 연산자를 반복적으로 입력 받습니다," 
		+ "=를 입력하면 입력이 완료됩니다");
		int temp = 0; // 임시 값 저장소
		String temp_oper = "+";

		for (;;) {
			System.out.println("숫자를 입력하시오");
			input_num = scan.nextInt();
			scan.nextLine(); // scan에 있는 buffer를 비움

			//처음에 시작할 때 input_calc 변수의 값이 아무것도 없으므로
			//input_calc 값이 없을 때는 if문에 들어가지 않도록
			//예외처리를 함.
			if (!input_calc.equals("")) {
				// =연산자 일 경우 현재 숫자와 직전에 연산자 결과값을 출력
				// 하기 위해 연산자를 임시저장하는 변수 사용
				temp_oper = input_calc;
			}
			System.out.println("연산자를 입력하시오");
			input_calc = scan.nextLine();

			if (temp_oper.equals("+")) {
				temp += input_num;
			} else if (temp_oper.equals("-")) {
				temp -= input_num;
			} else if (temp_oper.equals("*")) {
				temp *= input_num;
			} else if (temp_oper.equals("/")) {
				temp /= input_num;
			}

			if (input_calc.equals("=")) {
				System.out.println(temp);
				break;
			}

		}

	}

}