package human20220930;

import java.util.ArrayList;
import java.util.Scanner;

public class java05_0007_studentRandomPositionGroup3_3 {
	// 1.이중배열과 데이터 전달
	// 전역변수,지역변수,매개변수
	// 전역변수 : 모든 메서드들이 조회할 수 있는 변수
	// 지역변수 : 그 지역에서만 살아있는 변수
	// 매개변수 : 매개체로 받은 데이터를 담는 지역변수
	// 2중배열 : ArrayList<ArrayList<String>> abc
	// 배열 안에 배열이 존재하는 배열

	static ArrayList<ArrayList<String>> position2Array = new ArrayList<>();
	static ArrayList<String> positionArray = new ArrayList<>();
	static ArrayList<String> studentNumArray = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	static String num01 = "권지혜";
	static String num02 = "김건희";
	static String num03 = "김민기";
	static String num04 = "김정환";
	static String num05 = "김지희";
	static String num06 = "김현중";
	static String num07 = "박경환";
	static String num08 = "박송헌";
	static String num09 = "박유진";
	static String num10 = "박주성";
	static String num11 = "성진현";
	static String num12 = "심규태";
	static String num13 = "양희수";
	static String num14 = "이도연";
	static String num15 = "이우창";
	static String num16 = "이재형";
	static String num17 = "이준배";
	static String num18 = "이지훈";
	static String num19 = "이진수";
	static String num20 = "장민욱";
	static String num21 = "정윤호";
	static String num22 = "정하륜";
	static String num23 = "조은빈";
	static String num24 = "최수현";
	static String num25 = "허영주";

	public static void main(String[] args) {
		// 2-2. 임의의 학생을 추가하여 자리를 재배치 할 수 있는 기능을 구현하시오
		// 1) 배열의 위치를 1개씩 뒤로 밀어서 학생이름을 저장하시오
		// ex) i번째에 "김준석", i+1번째에 "박준석", i+2번째에 "이준석"이라면
		// i+1번째에 "김준석", i+2번째에 "박준석", i+3번째에 "이준석" 덮어쓰기(혹은 추가)
		// 2) 특정 위치 (i칸)에 임의의 학생이름을 덮어써서 저장하시오
		studentNumArray_add();
		positionArray_add();
		view_position();
		newStudent_add();
		view_position();

	}

	private static void studentNumArray_add() {
		studentNumArray.add(num01);
		studentNumArray.add(num02);
		studentNumArray.add(num03);
		studentNumArray.add(num04);
		studentNumArray.add(num05);
		studentNumArray.add(num06);
		studentNumArray.add(num07);
		studentNumArray.add(num08);
		studentNumArray.add(num09);
		studentNumArray.add(num10);
		studentNumArray.add(num11);
		studentNumArray.add(num12);
		studentNumArray.add(num13);
		studentNumArray.add(num14);
		studentNumArray.add(num15);
		studentNumArray.add(num16);
		studentNumArray.add(num17);
		studentNumArray.add(num18);
		studentNumArray.add(num19);
		studentNumArray.add(num20);
		studentNumArray.add(num21);
		studentNumArray.add(num22);
		studentNumArray.add(num23);
		studentNumArray.add(num24);
		studentNumArray.add(num25);

	}

	private static void positionArray_add() {
		for (int i = 0; i < studentNumArray.size(); i++) {
			int tempNum = (int) (Math.random() * studentNumArray.size());
			if (!studentNumArray.get(tempNum).equals("-")) {
				positionArray.add(studentNumArray.get(tempNum));
				studentNumArray.set(tempNum, "-");
			} else {
				i--;
			}
		}
	}

	private static void newStudent_add() {
		for(;;) {
			System.out.println("학생을 추가하시겠습니까?");
		System.out.println("1.예     2.아니요  ");
		int answer = scan.nextInt();
		scan.nextLine();
		if (answer == 1) {
			System.out.println("학생의 이름을 입력하세요.");
			String newStudent = scan.nextLine();
			positionArray.add(newStudent);
			System.out.println("원하시는 자리를 선택하세요.");
			System.out.println("/0  /1  /2  /3  /4 ");
			System.out.println("/5  /6  /7  /8  /9 ");
			System.out.println("/10 /11 /12 /13 /14 ");
			System.out.println("/15 /16 /17 /18  ");
			System.out.println("/19 /20 /21 /22  ");
			System.out.println("/23 /24 /25 /26  ");
			answer = scan.nextInt();
			scan.nextLine();
			for(int i = positionArray.size()-1; i>answer;i--) {
				positionArray.set(i, positionArray.get(i-1));
			}
			positionArray.set(answer, newStudent);
		} else if(answer == 2){
			break;
		}
		}
	}

	private static void view_position() {
		for (int i = 0; i < positionArray.size(); i++) {
			if (i % 5 == 4 && i < 15) {
				System.out.print("/" + positionArray.get(i));
				System.out.println();
			} else if (i % 5 != 4 && i < 15) {
				System.out.print("/" + positionArray.get(i));
			} else if (i % 4 == 2 && i >= 15) {
				System.out.print("/" + positionArray.get(i));
				System.out.println();
			} else if (i % 4 != 2 && i >= 15) {
				System.out.print("/" + positionArray.get(i));
			}
		}
		System.out.println("");

	}

}
