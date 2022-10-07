package human20221007;

import java.util.ArrayList;
import java.util.Scanner;

public class java07_0010_accountSystem {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//20221007 history
		//1. 인스턴스와 메모리
		//클래스(설계도) 기반으로 생성하는 구현체
		//인스턴스가 있어야, 실질적인 값이 출력되고 저장되는 위치
		//(참조타입 : heap)<>(기본타입 : stack)에 데이터 
		//대입연산자는 값을 할당하는 연산자
		//좌측(stack)에 우측(heap 혹은 데이터)의 값을 할당(연결)
		//(참조타입은 메모리 주소를 연결)
		//2.메서드 활용
		//public / private >> 캡슐화, 은닉화
		//public : 외부클래스에서 접근 가능
		//private : 내부클래스에서만 사용
		//메서드는 기능사용 : 프로그램이 동작하는 모든 수단을 메서드 실행
		//필드는 데이터를 저장하는 용도, 생성자는 인스턴스 초기값(스타일)
		//3. 추상적인 개념을 객체화시키는 것
		//추상적인 개념 : 학생의 정보를 단위별로 나누는 행위 > 객체화
		//이름, id, pw(필드값)
		//id 비교하기, pw변경하기 (메서드)
		//class를 만들고(설계) 실행하기 위해서 인스턴스를 만듦.
		//
		
		// #회원가입 시스템 만들기
		// 1) 학생 정보를 입력받는 시스템
		// 회원정보들을 관리하는 객체와 (class_studentList)
		// - 인스턴스를 만들어서 회원정보관리 객체를 여러개 만들 필요가 있는지? (그룹별)
		// - 만일, 여러개 만들 필요가 없다면 어떻게 생성을 할지? (static, *싱글톤)
		//*static : 컴파일이후 런타임 시점에서 이미 할당(heap)이 되어있는 객체
		//*싱글톤 : 런타임 이후에 코드가 실행되면서 단 하나의 인스턴스를 만드는 것
		// 회원의 정보를 담는 인스턴스의 조합 (class_student)
		// - 회원 한명당 인스턴스 하나씩 만들어서
		// - 회원정보를 관리하는 객체에 저장하는 시스템을 어떤 방식으로 구현할지?
		// (배열<고정, 가변>로 관리할지 혹은 객체를 또 만들어서 관리할지)
		// student클래스와 studentList클래스의 포함관계

		// 2) 비밀번호를 바꾸는 시스템
		// student클래스 안에 필드값
		// id : pw : name 생성
		// 메서드를 통해 name과 id 출력
		// 메서드를 통해 pw를 변경
		// 3)학생 모든 정보를 출력하는 메서드를 studentList에 작성하고
		// 출력하기

		class_studentList list = new class_studentList();
		class_student student = new class_student();

		for (;;) {
			System.out.println("이름, id, pw를 순서대로 입력하시오");
			student = new class_student(scan.nextLine(), scan.nextLine(), scan.nextLine());
			student.getInfo();
			System.out.println("위 정보로 입력하시겠습니까? y/n");
			if (scan.nextLine().equals("y")) {
				list.addStudent(student);
			}
			System.out.println("학생 정보를 더 입력하시겠습니까? y/n");
			if (scan.nextLine().equals("n")) {
				break;
			}
		}
		

		list.viewStudentList();
		
		
		for(;;) {
			System.out.println("비밀번호를 바꾸시겠습니까?  y/n");
			if(scan.nextLine().equals("y")) {
			System.out.println("id를 입력해주십시오");
			String inputId = scan.nextLine();
			System.out.println("현재 비밀번호를 입력해주십시오");
			String inputPw = scan.nextLine();
			System.out.println("새로운 비밀번호를 입력해주십시오");
			String inputNewPw = scan.nextLine();
			list.searchIdAndChangePw(inputId,inputPw,inputNewPw);
			} else {
				break;
			}
		}
		
		
		list.viewStudentList();

	}

}