package human20221027;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import human20221027.dto.HumanDto;

public class java02 {

	public static void main(String[] args) {
		//객체의 주소를 저장할 수 있는 공간 10개가 생김
		//실제 저장할 수 있는 공간은 없음.
		HumanDto[]dtos = new HumanDto[10];
		int totalCount = 0;
		
		dtos[totalCount++] = new HumanDto("홍길동",30,152.1,LocalDateTime.parse("2000-02-03 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길남",31,156.4,LocalDateTime.parse("2001-02-03 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길영",30,173.5,LocalDateTime.parse("2000-12-21 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		//select
		System.out.println("select");
		for(int i=0; i<totalCount; i++) {
			dtos[i].myPrint();
		}
		//키가 155 이상인 사람 출력
		System.out.println("특정 값 기준을 두고 select");
		for(int i = 0; i<totalCount; i++) {
			if(dtos[i].getHeight()>=155) {
				dtos[i].myPrint();
			}
		}
		//insert
		dtos[totalCount++]= new HumanDto("홍길도",42,183.5,
				LocalDateTime.parse("2022-12-24 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		//update 이름을 이용해서 나이를 변경하는 형태
		System.out.println("특정 값을 이용하여 그 값에 해당하는 컬럼값 변경하는 update");
		for(int i = 0; i<totalCount; i++) {
			if(dtos[i].getName().equals("홍길남")) {
				dtos[i].setAge(50);
				dtos[i].myPrint();
			}
		}
		//delete 나이가 35보다 작은 사람 삭제
		System.out.println("특정 값을 이용하여 그 값에 해당하는 행 삭제하는 delete");
		for(int i = 0; i<totalCount; i++) {
			if(dtos[i].getAge()<=35) {
				for(int j = i; j<totalCount-1;j++) {
				dtos[j] = dtos[j+1];
			}
			i--;
			totalCount--;
		}		
		}
	for(int i=0; i<totalCount; i++) {
		dtos[i].myPrint();
	}
	}


}
