package human20220920;

import java.io.IOException;

public class java04_0002_forwhile_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		keyPressExample2();

	}

	// throws Exception 코드 중에 키보드 또는 마우스 입력값을
	// 받아서 실행하는 코드일 경우 JVM밖에서 일어나는 에러를
	// (상정)처리하기 위한선언
	public static void keyPressExample2() throws Exception {
		// 에어컨 리모콘 만들기
		// 현재 온도는 30도이다
		// 냉방모드에서 1번을 누르면 온도 1감소, 2를 누르면 온도 1증가를
		// 진행하는 리모콘이 있다
		// 3을 누르면 터보모드로 최저 온도인 18도로 세팅이 된다
		boolean run = true;
		int temp = 30;
		int keyCode = 0;
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("========에어컨 리모콘========");
				System.out.println("1.감소 : 2.증가 : 3.터보 : 4.종료");
				System.out.println("=========================");
				System.out.println("선택 : ");
			}
			keyCode = System.in.read();
			if (keyCode == 49 && temp > 18) {
				temp--;
				System.out.println("온도가 1도 내려갑니다. 냉방 온도 = " + temp);	
			}
			if (keyCode == 49 && temp <= 18) {
				System.out.println("냉방 온도를 더 이상 내릴 수 없습니다. 냉방온도 ="+ temp);
			}
			if (keyCode == 50) {
				temp++;
				System.out.println("온도가 1도 올라갑니다. 냉방 온도 = " + temp);
			}
			if (keyCode == 51) {
				temp = 18;
				System.out.println("터보모드가 실행됩니다. 냉방 온도 = " + temp);
			}
			if (keyCode == 52) {
				System.out.println("에어컨 작동을 종료합니다.");
				run = false;
			}
		
		}

	}

}