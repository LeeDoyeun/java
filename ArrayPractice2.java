package human20221013;

import java.util.Scanner;

public class ArrayPractice2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		practice_01();
//		practice_02();
//		practice_03();
//		practice_04();
//		practice_05();
//		practice_06();
//		practice_07();
//		practice_08();
//		practice_09();
//		practice_10();
//		practice_11();
//		practice_12();
//		practice_13();
		practice_14();
		

	}

	private static void practice_14() {
		System.out.println("배열에 몇 개의 정수를 담을 것인지 입력하시오.");
		int num = scan.nextInt();
		int[] arr = new int [num];
		for(int i = 0; i<arr.length; i++) {
			int temp = (int)(Math.random()*100)+1;
			for(int j = 0; j<i;j++) {
				if(arr[j]!=temp) {
					arr[i] = temp;
				}else {
					i--;
				}
			}
			
		}
		System.out.println("배열은 다음과 같습니다.");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void practice_13() {
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			int temp = (int)(Math.random()*10)+1;
			arr[i] = temp;
		}
		System.out.println("배열은 다음과 같습니다.");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("평균은 ");
		double total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.print(total/arr.length);
		
	}

	private static void practice_12() {
		int[] arr = new int[10];
		System.out.println("양의 정수 10개를 입력하십시오");
		for(int i = 0; i<arr.length; i++) {
			int temp = scan.nextInt();
			if(temp>0) {
			arr[i] = temp;
			} else {
				System.out.println("양의 정수를 입력하십시오");
				i--;
			}
		}
		System.out.print("입력받은 값은 ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("3의 배수는 ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

	private static void practice_11() {
		int num = 1;
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
			}
		}
		

	private static void practice_10() {
		int result = 0;
		System.out.println("숫자를 5번 입력받고, 입력받을 때마다 더해집니다.");
		for(int i = 0; i<5; i++) {
			int temp = scan.nextInt();
			result += temp;
			System.out.println("숫자를 입력하세요:"+temp+" 출력: "+ result);
		}


		
		
	}

	private static void practice_09() {
		for(int i = 0; i<=9; i++) {
			if(i != 9) {
				System.out.print(i*10 + ", ");
			}else {
				System.out.println(i*10);
			}
		}
	}

	private static void practice_08() {
		for(int i = 0; i <= 20; i++) {
			System.out.print(i+" ");
		}
	}

	private static void practice_07() {
		String[][]arr = new String[5][4];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = "*";
				if(i==j) {
					arr[i][j] = Integer.toString(i+1);
				}
				System.out.print(arr[i][j]);	
			}
			System.out.println();
		}
	}

	private static void practice_06() {
		String[][]arr = new String[3][5];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = "*";
				if(i==j) {
					arr[i][j] = Integer.toString(i+1);
				}
				System.out.print(arr[i][j]);	
			}
			System.out.println();
		}
		
	}

	private static void practice_05() {
		while(true) {
			int dice_1 = (int)(Math.random()*6)+1;
			int dice_2 = (int)(Math.random()*6)+1;
			System.out.println("("+dice_1+","+dice_2+")");
			if(dice_1 + dice_2 == 5) {
				break;
			}
		}
		
	}

	private static void practice_04() {
		int total = 0;
		for(int i = 1; i<=100;i++) {
			if(i%3==0) {
				total += i;
			}
		}
		System.out.println(total);
	}

	private static void practice_03() {
		int[][]arr = new int[5][5];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				arr[i][j] = i+1+j;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void practice_02() {
		for(int h = 0; h<24; h++) {
			for(int m = 0; m<60; m++) {
				System.out.println(h+"시 "+ m +"분");
			}
		}
		
	}

	private static void practice_01() {
		int[][]arr = new int[5][5];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				arr[i][j] = i+1;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
