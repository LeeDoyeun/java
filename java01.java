package human20221027;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import human20221027.dto.HumanDto;

public class java01 {

	public static void main(String[] args) {
		//human 테이블의 데이터 출력
		//날짜 처리 과거에 Date 사용 최근에는 LocalDateTime을 많이 사용
		
		LocalDateTime nowTime = LocalDateTime.now();
		System.out.println("nowTime : " + nowTime);
		//LocalDateTime -> String format() 안에 얻고자 하는 시간 문자열 입력
		String parseString = nowTime.format(DateTimeFormatter.ofPattern(
				"yyyy_MM_dd HH:mm:ss"));
		System.out.println("parseString : " + parseString);
		
		//String -> LocalDateTime
		LocalDateTime parseTime = LocalDateTime.parse(parseString,
				DateTimeFormatter.ofPattern("yyyy_MM_dd HH:mm:ss"));
		System.out.println("parseTime : " + parseTime);
		
		//DB작업 이어서하기
		//변수에 넣어서 처리하기
		//날짜만 처리하려면 LocalDate만 이용해도 좋으나 오라클 to_date에는 시간까지 내포되어 있으므로 
		//번거롭지만 시간도 넣어준다.
		
		String name1 = "홍길동"; int age1 = 30; double height1 = 152.1;
		LocalDateTime birthday1 = LocalDateTime.parse("2000-02-03 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name1);
		System.out.println("나이 : " + age1);
		System.out.println("키 : " + height1);
		System.out.println("생일 : " + birthday1.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		//2.여러개의 변수에 넣어서 처리하기
		//클래스를 사용하는 이유를 알아보고자 한번 해보자.
		
		String name2 = "홍길남"; int age2 = 31; double height2 = 156.4;
		LocalDateTime birthday2 = LocalDateTime.parse("2001-02-03 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name2);
		System.out.println("나이 : " + age2);
		System.out.println("키 : " + height2);
		System.out.println("생일 : " + birthday2.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		String name3 = "홍길영"; int age3 = 30; double height3 = 173.5;
		LocalDateTime birthday3 = LocalDateTime.parse("2000-12-21 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name3);
		System.out.println("나이 : " + age3);
		System.out.println("키 : " + height3);
		System.out.println("생일 : " + birthday3.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		String name4 = "홍길아"; int age4 = 21; double height4 = 143.2;
		LocalDateTime birthday4 = LocalDateTime.parse("2011-04-17 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name4);
		System.out.println("나이 : " + age4);
		System.out.println("키 : " + height4);
		System.out.println("생일 : " + birthday4.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		//클래스를 이용하여 관련있는 Human 데이터와 메소드를 합치기.
		//데이터베이스의 데이터를 java에서 조작할 때 dto와 dao를 사용한다.
		//dto 데이터베이스의 데이터를 저장하는 객체
		//dao 데이터베이스에 데이터를 조작할 때 사용하는 객체
		
		HumanDto dto1 = new HumanDto("홍길동", 12, 23.0, LocalDateTime.now());
		HumanDto dto2 = new HumanDto("홍길동", 13, 23.0, LocalDateTime.now());
		HumanDto dto3 = new HumanDto("홍길남", 12, 23.0, LocalDateTime.now());
		HumanDto dto4 = new HumanDto("홍길동", 12, 23.0, LocalDateTime.now());
		
		if(dto1.equals(dto2)) {
			System.out.println("dto1과 dto2는 같다.");
		} else {
			System.out.println("dto1과 dto2는 다르다.");
		}
		if(dto1.equals(dto3)) {
			System.out.println("dto1과 dto3는 같다.");
		} else {
			System.out.println("dto1과 dto3는 다르다.");
		}
		if(dto1.equals(dto4)) {
			System.out.println("dto1과 dto4는 같다.");
		} else {
			System.out.println("dto1과 dto4는 다르다.");
		}
		
		//객체의 모든 필드가 같을 때만 같다고 나오도록 equals를 재정의 해보자.
		//객체의 이름 필드가 같을 때만 같다고 나오도록 equals를 재정의 해보자.
		//객체의 나이 필드가 같을 때만 같다고 나오도록 equals를 재정의 해보자.
		//객체의 이름,나이 필드가 같을 때만 같다고 나오도록 equals를 재정의 해보자.
		//각상황에 맞게 출력되도록 equals를 만들어보자.
		
		//객체에 출력 매소드 넣기
		HumanDto hDto1 = new HumanDto("홍길동",30,152.1,LocalDateTime.parse("2000-02-03 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		HumanDto hDto2 = new HumanDto("홍길남",31,156.4,LocalDateTime.parse("2001-02-03 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		HumanDto hDto3 = new HumanDto("홍길영",30,173.5,LocalDateTime.parse("2000-12-21 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		hDto1.myPrint();
		hDto2.myPrint();
		hDto3.myPrint();
		
		//getter, setter를 사용하는 이유? 접근에 제한을 주기위해서 사용
		//캡슐화 내부의 내용을 몰라도 마음놓고 사용할 수 있다.
		
		HumanDto myDto = new HumanDto();
		myDto.myAge = 30;
		myDto.myAge = -30;
		myDto.myAge = 330;
		
		myDto.setAge(30);
		myDto.setAge(-30);
		myDto.setAge(330);
		
		//나이가 음수가 들어있거나 300살이 넘는 사람은 없다.
		//어떻게 처리할 것인가?
		//선언된 변수에 직접 접근하지 않고 
		//setter getter를 이용해서 원하는 값을 유지하기 위해서 사용.
		//특정값에 대한 접근 제어를 하기위해서 사용함.
		
		}
	}



