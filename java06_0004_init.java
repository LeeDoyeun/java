package human20221005;

import java.util.ArrayList;

public class java06_0004_init {

	public static void main(String[] args) {
		//example0001. 날짜별 날씨를 저장하는 클래스를 만들고,
		//요일별로 날짜 저장하는 배열을 만드시오
		//1)날짜와 날씨를 저장하는 클래스 : 날짜, 날씨 필드값 필요
		//2)요일별로 날짜 저장하는 배열 : 요일 : 1,2,3,4,5...
		//예)arrayList<class_weather>에 인스턴스를 지속적으로 넣어서
		//1주일 중 주중(5일)을 채우면 배열을 출력하시오
		
		//=(대입연산자) 우측에 인스턴스 만들어서(new)
		//좌측 weatherLog 변수에 할당(저장)
		class_weather weatherLog_1 =
				new class_weather("흐림","1","오전");
		//생성자를 통해서 인스턴스를 만들면,
		//생성자에 무언가 작업을 해서 다양한 스타일로 만들 수 있지 않을까?
		//= 매개변수를 통한 인스턴스 다양성 : 오버로딩(overloading)
		class_weather weatherLog_2 =
				new class_weather("비옴","2","새벽");
		class_weather weatherLog_3 = 
				new class_weather("맑음","3","오후");
		class_weather weatherLog_4 =
				new class_weather("바람","4","자정");
		class_weather weatherLog_5 =
				new class_weather("우박","5","저녁");
		
		//오버로딩 : 생성자 스타일을 다양하게 만들기
		//class_weather 클래스에 매개변수 세가지를 넣는 메서드를 만들었지만
		//매개 변수 중 값이 없는 경우에도 출력할 수 있게
		//이름이 같은 다른 메서드를 만든다
		//오버로딩을 사용하는 이유
		//1. 같은 기능을 하는 메서드를 하나의 이름으로 사용할 수 있다.
		//2. 메서드의 이름을 절약할 수 있다.
//		class_weather weatherLog_test =
//				new class_weather("눈","6");
//		System.out.println(weatherLog_test.time);
//		시간모름
//		으로 출력됨
		
		System.out.println(weatherLog_1.weatherLog);
		System.out.println(weatherLog_1.day);
		System.out.println(weatherLog_2.weatherLog);
		System.out.println(weatherLog_2.day);
		
		
		ArrayList<class_weather> log = new ArrayList<>();
		log.add(weatherLog_1);
		log.add(weatherLog_2);
		log.add(weatherLog_3);
		log.add(weatherLog_4);
		log.add(weatherLog_5);
		
//		String[] test = {"김준석","이준석","박준석"};
//		for(String i : test) {
//			System.out.println(i);
//		}
		//아래와 같이 출력됨
//		김준석
//		이준석
//		박준석
		
		
		//향상된 for문
		//조건절 (타입 변수명 : 배열변수명)
		for(class_weather i : log) {
			System.out.println(i.weatherLog);
			System.out.println(i.day);
			System.out.println(i.time);
		}

		
		//1-3 oneDay toDoList를 자유롭게 class를 만드시오
		//예)날짜, startTime, endTime, 할일
		//(정보체계화, 참조객체 자유구사, 인스턴스 관리)
		//1)클래스 toDoList작성
		//필드선언 : 날짜, 할일, 시작시각, 종료시각
		//2)생성자 만들기
		//생성자를 통해서 매개변수값을 필드값에 할당(저장)
		//*오버로딩
		//날짜는 있으나, 할일이나 시각이 없을 경우(null)에는
		//자동으로 특정 값을 필드에 저장
		//3)arrayList 배열에 toDoList 인스턴스를 add(넣어서)
		//for문으로 출력하시오
		



	}

}
