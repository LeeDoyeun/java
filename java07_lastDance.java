package human20221007_2;

public class java07_lastDance {

	public static void main(String[] args) {//std01 <> std02
		// 클래스(설계도) > 인스턴스(new)로 구현
		//1. 선언부만 있으면 stack 영역에 선언만 하고 값은 없음
		//2.( = ) 대입연산자 우측에 값이 없다면 실행이 안됨
		String abc = "김준석";
		String abc1 = new String("김준석");
		
//		student student = new student();
//		student.getName();
		//std01 stack 영역에 선언만 되어 있는 껍데기
		//인스턴스가 곧 값이므로, 무언가 실행할 때 존재해야 함(heap)
		student std01 = new student("김준석","1234");
		student std02 = new student("박준석","5678");
		
		System.out.println(std01.getName());
		std01.setName("박준석");
		System.out.println("std01 = "+std01.getName());
		std02.getName();
		System.out.println("std02 = "+std02.getName());
		std01.changeName("이준석");
		System.out.println("std01 = "+std01.getName());
		
		

	}

}
