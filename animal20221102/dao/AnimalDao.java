package animal20221102.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import animal20221102.dto.AnimalDto;
import animal20221102.util.DBConn;
import animal20221102.util.UserInput;

public class AnimalDao {
	// arrayList를 사용하려면 객체에 equals를 추가해야 한다.
	// 데이터 선언
//	private ArrayList<AnimalDto> dtos = new ArrayList<AnimalDto>();
	// 데이터베이스를 오라클에서 직접 가져오기 때문에 dtos 배열은 필요없다.

	// 데이터 초기화 init
	public void init() {
		// 1번데이터
		AnimalDto dto = new AnimalDto("Diablo", 2, 5.02,
				LocalDateTime.parse("2014-08-26 12:53:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String sql = String.format("insert into animal values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getWeight(),
				dto.getDatetime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 2번데이터
		dto = new AnimalDto("Miller", 3, 6.43,
				LocalDateTime.parse("2015-09-16 09:06:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into animal values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getWeight(),
				dto.getDatetime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 3번데이터
		dto = new AnimalDto("Minnie", 1, 3.51,
				LocalDateTime.parse("2017-01-08 16:34:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into animal values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getWeight(),
				dto.getDatetime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}

	public ArrayList<AnimalDto> select() {
		ArrayList<AnimalDto> resultDtos = new ArrayList<AnimalDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from animal"));
//		System.out.println("select"); //첫번째 방법
		try {
			while (rs.next()) {
				resultDtos.add(new AnimalDto(rs.getString("name"), rs.getInt("age"), rs.getDouble("Weight"),
						rs.getTimestamp("Datetime").toLocalDateTime()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		System.out.println("select"); // 두번째 방법
//		for (int i = 0; i < dtos.size(); i++) {
//			dtos.get(i).myPrint();
//		}
		return resultDtos;
	}

	public ArrayList<AnimalDto> select(double weight) {
		ArrayList<AnimalDto> resultDtos = new ArrayList<AnimalDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from animal where weight>%f",weight));
		try {
			while (rs.next()) {
				resultDtos.add(new AnimalDto(rs.getString("name"), rs.getInt("age"), rs.getDouble("weight"),
						rs.getTimestamp("Datetime").toLocalDateTime()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultDtos;
	}

	public void insert(AnimalDto dto) {
		String sql = String.format("insert into animal values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getWeight(),
				dto.getDatetime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}

	public void update(String name, int age) {
		// update 이름을 이용해서 나이를 변경하는 형태
		// 기존 String sql 문자열에 쿼리문을 저장하고 sql 을 statement메서드에 넣었는데,
		// String 클래스의 format 메서드를 이용하여 쿼리문을 바로 작성했다.
		DBConn.statementUpdate(String.format("update animal set age= %d" + "where name = '%s'", age, name));
	}

	public void delete(int age) {
		DBConn.statementUpdate(String.format("delete animal where age < %d", age));
	}
}
