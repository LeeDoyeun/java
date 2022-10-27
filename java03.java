package human20221027;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import human20221027.dao.HumanArrayDao;
import human20221027.dto.HumanDto;

public class java03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanArrayDao dao = new HumanArrayDao();
		dao.init();
		dao.select();
		HumanDto dto = new HumanDto("홍길동2",32,152.2,
				LocalDateTime.parse("2000-02-02 00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dao.insert(dto);
		dao.select();
		dao.update("홍길남", 50);
		dao.select();
		dao.delete(30);
		dao.select();

	}

}
