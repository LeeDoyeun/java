package human20221006;

import java.util.Scanner;

public class java06_0006_instanceAndStatic {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String stringA = scan.nextLine();
		Integer intA = new Integer(scan.nextInt());
		scan.nextLine();
		
		checkType(stringA);
//		if(class.isInstance())
		
		String test = "김준석";
		String test1 = "박준석";
		int test2 = 3;
		int test4 = 3;
		
		//숫자 비교
		if(test2 == test4) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
		//문자열비교
		if(test.equals(test1)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
		//타입비교
		//A instanceof B : A변수가 B타입 "계열"인지 확인하는 메서드(같은 것만 가능)
		//isInstance : [런타임 단계]에서 같은 "계열" 타입인지 확인
		//A.class.isInstance(B) : B변수가 A타입인지 확인
		System.out.println(String.class.isInstance(test4));
		//false 출력
		
		if(test instanceof String) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
		//class_example instance0001 : 
		//타입을 class_example으로 한 instance0001 변수 선언
		// = stack 메모리에 선언을 한다(=존재한다)
		//new class_example(scan.nextLine());
		//new class_example : 인스턴스를 만든다
		//(scan.nextLine()) : 키보드로 받은 문자열값을 인자값으로 전달하고
		//생성자를 통해서 인스턴스를 만듬
		class_example instance0001 = new class_example("김준석");
		class_example instance0002 = new class_example("박준석");
		
		//1) 인스턴스는 참조타입으로 변수명에 주소값을 연결하여 존재
		//2) 인스턴스가 만들어지면 고유의 필드데이터를 갖고 있음.
		//단, static은 같은 클래스이면 모두 공유하는 필드 데이터.
		
		instance0001.output();
		instance0002.output();
		
		System.out.println("그룹을 변경하겠습니다, 숫자를 작성해 주세요");
		//setGroup() 메서드를 사용하여 group필드 값을 변경
		//단, group은 static 선언되어서
		//같은 클래스의 모든 group 변수 데이터는 모두 수정됨
		instance0001.setGroup(scan.nextInt());
		scan.nextLine();
		
		System.out.println("과자를 변경하겠습니다, 숫자를 작성해 주세요");
		instance0001.setSnack(scan.nextLine());
		
		instance0001.output();
		instance0002.output();
		
//      *인스턴스
//      1. 참조타입은 리터럴과 인스턴스 두 종류이다
//      예) 일반 String과 new String
//      2. 보통 참조타입이면 인스턴스이다
      
      //*메모리 주소 확인
      //System.indentityHashCode(변수이름)
      //*인스턴스를 클래스를 비교하여 같은 타입인지 확인
      //A instanceof B

      // 1-4. 지난 문제인 학생목록 class안에 toDoList class를 넣어
      // 관리시스템을 구성하시오
      // (다중 인스턴스 생성, 참조객체 자유구사, 인스턴스 관리)
      // code20221004 package 내에 class_StudentList와
      // code20221005 package 내에 class_toDoList 사용
      // 1) class_StudentList 인스턴스를 만들 때 
      // class_toDoList 필드 인스턴스를 생성자로 생성하는 코드 작성
      // 2) class_StudentList 인스턴스 생성 시 인자값을 사용하여
      // class_toDoList 생성자 생성
      
      // 1-5. Scanner로 받은 데이터 타입이 무엇인지 출력하는 메서드를 만드시오
      // 1) Scanner로 1번이면 String, 2번이면 int로 받도록 만드시오
      // 2) 1번으로 받은 데이터가 어떤 타입인지 출력하는 메서드를 만드시오

      // *1-6. 학생의 개인일정(privateToDo)과 공식일정(publicToDo)을
      // 만들어서 학생(student)에 추가하는 시스템에 
      // 일정 인스턴스를 비교하여 추가하는 시스템 구성하시오
      // (instanceOf를 사용하여 객체 타입을 구분)
      // 1) 학생(student) class, 개인일정(privateToDo) clas, 
      // 공식일정(publicToDo) class 를 만드시오
      // 2) 학생 인스턴스 안에 개인일정, 공식일정을 추가하는 생성자를 만드시오
      // 3) 일정을 추가할 때 객체를 비교하여 추가하는 시스템을 만드시오

      // #오버로딩 이해하기
      // 2-1. 필수사항(id, pw) 외 선택사항(email, tel, address)를
      // 저장하는 인스턴스를 만드시오
      // (인스턴스 다양화, 데이터 저장과 수정)

   }

	private static void checkType(Object data) {
		// Object 타입이란 모든 타입을 대변할 수 있는 타입(모든 타입의 선조)
		// Object는 모든 타입의 선조이므로, "자동 캐스팅" 가능
		// 자동 캐스팅이 가능한 것은 어떤 타입보다 더 큰 범위 갖고 있다.
		if(String.class.isInstance(data)) {
			System.out.println(data + " : 문자열 입니다.");
		} else if(Integer.class.isInstance(data)) {
			System.out.println(data + " : 정수 입니다.");
		}else if(boolean.class.isInstance(data)) {
			System.out.println(data + " : 불린타입 입니다.");
		}
	}

}