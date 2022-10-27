package human20221027.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import human20221027.dto.HumanDto;

public class HumanArrayDao {
	// HumanDto클래스를 array형태로 데이터 조작하는 dao클래스
	// HumanDto인스턴스 배열을 여러개 선언해서 조작할 수 있는 형태로
	// 데이터 선언
	private HumanDto[] dtos = new HumanDto[10];
	private int totalCount = 0;

	// 데이터 초기화 init
	public void init() {
		dtos[totalCount++] = new HumanDto("홍길동", 30, 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길남", 31, 156.4,
				LocalDateTime.parse("2001-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길영", 30, 173.5,
				LocalDateTime.parse("2000-12-21 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

	}

	public void select() {
		// select
		System.out.println("select");
		for (int i = 0; i < totalCount; i++) {
			dtos[i].myPrint();
		}
	}

	public void select(double height) {
		// 키가 155 이상인 사람 출력
		System.out.println("select height xxx 이상");
		for (int i = 0; i < totalCount; i++) {
			if (dtos[i].getHeight() >= 155) {
				dtos[i].myPrint();
			}
		}
	}
	public void insert(HumanDto dto) {
		dtos[totalCount++] = dto;
	}
	public void update(String name, int age) {
		//update 이름을 이용해서 나이를 변경하는 형태
		System.out.println("update name, age");
		for(int i = 0; i<totalCount; i++) {
			if(dtos[i].getName().equals(name)) {
				dtos[i].setAge(age);
			}
		}
	}
	public void delete(int age) {
		System.out.println("delete 나이 age 이하 삭제");
		for(int i = 0; i<totalCount; i++) {
			if(dtos[i].getAge()<=age) {
				for(int j=i; j<totalCount-1; j++) {
					dtos[j] = dtos[j+1];
				}
				totalCount--;
				i--;
			}
		}
	}
}
