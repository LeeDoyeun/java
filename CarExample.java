package human20221004;

import java.util.ArrayList;

public class CarExample {

	public static void main(String[] args) {
		//20221004 history
		//1. 클래스와 인스턴스
		//2. 필드와 생성자
		//3.메서드
		
		//자동차 인스턴스
		//car001 변수에 Car 타입으로 저장가능(선언)
		//Car라는 인스턴스(객체)를 만들어서
		//car001에 할당(저장)
		//인스턴스 : class(설계도) 토대로 새로 만드는 객체
		//(heap 메모리에 저장(참조타입))
		Car car001 = new Car();
		car001.name = "코나";
		car001.company = "현대자동차";
		car001.color = "파랑";
		Car car002 = new Car();
		car002.name = "캐스퍼";
		car002.company = "현대자동차";
		car002.color = "빨강";
		
		System.out.println(car001.name);
		System.out.println(car001.color);
		System.out.println("----------------------");
		System.out.println(car002.name);
		System.out.println(car002.color);
		System.out.println("----------------------");
		
		
		// 객체 생성
		Car myCar = new Car();
		String stringCheckImpl = "test";
		String stringCheck = new String("test");
		
		//필드값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.name);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		//example001.Car라는 클래스에 name이라는 변수를 넣고
		//인스턴스를 만들 때마다 이름을 부여하고
		//sysout으로 출력하시오
		
		Car ex001Car = new Car();
		ex001Car.name = "아반떼";
		ex001Car.company = "현대자동차";
		ex001Car.color = "하양";
		System.out.println(ex001Car.name);
		System.out.println("--------");
		Car ex002Car = new Car();
		ex002Car.name = "쏘나타";
		ex002Car.company = "현대자동차";
		ex002Car.color = "초록";
		System.out.println(ex002Car.name);
		System.out.println("--------");
		
		ArrayList<Car> myCarList = new ArrayList<>();
		
		myCarList.add(ex001Car);
		myCarList.add(ex002Car);
		myCarList.add(car001);
		myCarList.add(car002);
		
		System.out.println(ex001Car.info());
		
		System.out.println("----------");
		for(int i = 0; i<myCarList.size(); i++) {
			System.out.println(myCarList.get(i).info());
		}
		System.out.println("---------");
		
		

	}

}
