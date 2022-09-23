package human20220922;

import java.util.Scanner;

public class java80_0001_groupProject_calc {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		view_welcome();
		view_numberPlz();

		double temp_num = Double.parseDouble(scan.nextLine());

		for (;;) {

			view_stringPlz();
			String temp_oper = scan.nextLine();
			if (temp_oper.equals("=")) {
				break;
			} else if (temp_oper.equals("r") ||
					temp_oper.equals("log") ||
					temp_oper.equals("log10") ||
					temp_oper.equals("e") ||
					temp_oper.equals("pi") ) {
				temp_num = calc_continue(temp_num,temp_oper);
				System.out.println(temp_num);
				view_end();
				continue;
			} else if (!oper_check(temp_oper)) {
				System.out.println("연산자가 아닙니다.");
				 continue;
				}
			
			view_numberPlz();
			double temp_num_second = Double.parseDouble(scan.nextLine());

			temp_num = calc_start(temp_num, temp_oper, temp_num_second);
			
			System.out.println(temp_num);
			view_end();

		}
		System.out.println("최종 결과 숫자는 " + temp_num + "입니다.");
	}

	private static void view_welcome() {
		System.out.println("     안녕하세요");
		System.out.println("    계산기입니다.");
		System.out.println("-----------------");
		System.out.println("   출력가능 연산자");
		System.out.println("+(더하기) | -(빼기)");
		System.out.println("*(곱하기) | /(나누기)");
		System.out.println("^(제곱)  | r(제곱근)");
		System.out.println("log(로그)| log10");
		System.out.println("e(exp)  | pi(*π)");
		System.out.println("-----------------");
		System.out.println("     7  8  9");
		System.out.println("     4  5  6");
		System.out.println("     1  2  3");
		System.out.println("     π  0  .");
		System.out.println("-----------------");

	}

	private static void view_numberPlz() {
		System.out.println("숫자를 입력하시오");
	}

	private static void view_stringPlz() {
			System.out.println("연산자를 입력하시오");
		
	}
	private static void view_end() {
		System.out.println("계산 종료를 원하시면 '='을 눌러주세요");
	}

	private static double calc_start(double A, String B, double C) {
		double result = 0;
		if (B.equals("+")) {
			result = calc_plus(A, C);
		} else if (B.equals("-")) {
			result = calc_minus(A, C);
		} else if (B.equals("*")) {
			result = calc_multi(A, C);
		} else if (B.equals("/")) {
			result = calc_divis(A, C);
		} else if (B.equals("^")) {
			result = calc_square(A, C);
		}
		return result;
		
//		switch(B) {
//		case "+": 
//			result = calc_plus(A,C);
//			break;
//		case "-":
//			result = calc_minus(A,C);
//			break;
//		case "*":
//			result = calc_multi(A,C);
//			break;
//		case "/":
//			result = calc_divis(A,C);
//			break;
//		case "^":
//			result = calc_square(A,C);
//			break;
//		}
//		return result;
	}
	
	private static double calc_continue(double A, String B) {
		double result = 0;
		if (B.equals("r")) {
			result = calc_sqrt(A);
		} else if (B.equals("log")) {
			result = calc_log(A);
		} else if (B.equals("log10")) {
			result = calc_log10(A);
		} else if (B.equals("e")) {
			result = calc_exp(A);
		} else if (B.equals("pi")) {
			result = calc_pi(A);
		}
		return result;
	}
	private static boolean oper_check(String A) {
		boolean result = false;
		 if (A.equals("+") ||
			A.equals("-") ||	
			A.equals("*") ||
			A.equals("/") ||
			A.equals("^") ||	
			A.equals("r") ||
			A.equals("log") ||
			A.equals("log10") ||
			A.equals("e") ||
			A.equals("pi")) {
			result = true;
		 }
		 return result;		
	}

	
	private static double calc_plus(double A, double B) {
		return A + B;
	}

	private static double calc_minus(double A, double B) {
		return A - B;
	}

	private static double calc_multi(double A, double B) {
		return A * B;
	}

	private static double calc_divis(double A, double B) {
		return A / B;
	}

	private static double calc_square(double A, double B) {
		return Math.pow(A, B);
	}
	
	private static double calc_sqrt(double A) {
		return Math.sqrt(A);
	}
	private static double calc_log(double A) {
		return Math.log(A);
	}
	private static double calc_log10(double A) {
		return Math.log10(A);
	}
	private static double calc_exp(double A) {
		return Math.exp(A);
	}
	private static double calc_pi(double A) {
		return Math.PI * A;
	}
}
