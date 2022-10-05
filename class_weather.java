package human20221005;

import java.util.ArrayList;

public class class_weather {
	//데이터를 담는 필드(저장 변수)
	String weatherLog;
	String day;
	String time;
	ArrayList <ArrayList<String>> weatherDayTime =
			new ArrayList<>();
	
	//생성자 : 인스턴스가 만들어질 때 스타일을 지정
	//매개변수 : 메서드와 메서드끼리 서로 소통하는 선물을 담는 변수(매개체+변수)
	//생성자의 매개변수는 외부에서 인스턴스를 만드는 작업에서 인자값을 전달하면
	//생성자는 매개변수로 만들어서 필드값에 할당(저장)
	//ex) String weatherLog = "흐림"; (매개변수 = 지역변수)비슷
	class_weather(String weatherLog, String day, String time){
		this.weatherLog = weatherLog;
		this.day = day;
		this.time = time;

	}
	class_weather(String weatherLog, String day){
		this.weatherLog = weatherLog;
		this.day = day;
		this.time = "시간모름";
	}
				
		
	}


