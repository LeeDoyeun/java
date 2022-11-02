package human20221102.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import human20221102.dto.HumanDto;
import human20221102.util.DBConn;
import human20221102.util.UserInput;

public class HumanDao {
	// arrayList를 사용하려면 객체에 equals를 추가해야 한다.
	// 데이터 선언
//	private ArrayList<HumanDto> dtos = new ArrayList<HumanDto>();
	// 데이터베이스를 오라클에서 직접 가져오기 때문에 dtos 배열은 필요없다.

	// 데이터 초기화 init
	public void init() {
		// 1번데이터
		HumanDto dto = new HumanDto("홍길동", 30, 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		String sql = String.format("insert into human values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 2번데이터
		dto = new HumanDto("홍길남", 31, 156.4,
				LocalDateTime.parse("2001-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into human values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
		// 3번데이터
		dto = new HumanDto("홍길영", 30, 173.5,
				LocalDateTime.parse("2000-12-21 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		sql = String.format("insert into human values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}

	public ArrayList<HumanDto> select() {
		ArrayList<HumanDto> resultDtos = new ArrayList<HumanDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from human"));
//		System.out.println("select"); //첫번째 방법
		try {
			while (rs.next()) {
				resultDtos.add(new HumanDto(rs.getString("name"), rs.getInt("age"), rs.getDouble("Height"),
						rs.getTimestamp("birthday").toLocalDateTime()));
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

	public ArrayList<HumanDto> select(double height) {
		// 키가 155 이상인 사람 출력
		ArrayList<HumanDto> resultDtos = new ArrayList<HumanDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from human where height>%f",height));
//		System.out.println("select"); //첫번째 방법
		try {
			while (rs.next()) {
				resultDtos.add(new HumanDto(rs.getString("name"), rs.getInt("age"), rs.getDouble("Height"),
						rs.getTimestamp("birthday").toLocalDateTime()));
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

	public void insert(HumanDto dto) {
		String sql = String.format("insert into human values('%s',%d,%f,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getAge(), dto.getHeight(),
				dto.getBirthday().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}

	public void update(String name, int age) {
		// update 이름을 이용해서 나이를 변경하는 형태
		// 기존 String sql 문자열에 쿼리문을 저장하고 sql 을 statement메서드에 넣었는데,
		// String 클래스의 format 메서드를 이용하여 쿼리문을 바로 작성했다.
		DBConn.statementUpdate(String.format("update human set age=%d" + "where name = 's'", age, name));
	}

	public void delete(int age) {
		DBConn.statementUpdate(String.format("delete human where age < %d", age));
	}

	public void startMenu2() {
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("human관리 프로그램");
			System.out.println("1.test값 입력 2.select 3.select(height)");
			System.out.println("4.insert(dto) 5.update(name,age)");
			System.out.println("6.delete(age) 7.exit");
			int input = UserInput.inputInt("선택");
			switch (input) {
			case 1:
				init();
				System.out.println("test값을 입력하였습니다.");
				break;
			case 2:
				select();
				break;
			case 3:
				System.out.println("입력한 height값 보다 큰 학생을 출력할 예정입니다.");
				double height = UserInput.inputDouble("height을 입력하세요");
				select(height);
				break;
			case 4:
				System.out.println("입력하고자 하는 Human 데이터 입력");
				HumanDto dto = new HumanDto();
				dto.setName(UserInput.inputString("이름"));
				dto.setAge(UserInput.inputInt("나이"));
				dto.setHeight(UserInput.inputDouble("키"));
				dto.setBirthday(UserInput.inputLocalDateTime("생일"));

				insert(dto);
				break;
			case 5:
				System.out.println("특정 name으로 age 변경");
				String name = UserInput.inputString("이름 : ");
				int age = UserInput.inputInt("나이 : ");
				update(name, age);
				break;
			case 6:
				System.out.println("입력한 나이보다 작은 데이터 삭제");
				delete(UserInput.inputInt("나이 :"));
				break;
			default:
				System.out.println("프로그램 종료");
				isFlag = false;
			}
		}
	}

	public static void startMenu() {
		HumanDao dao = new HumanDao();
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("human관리 프로그램");
			System.out.println("1.test값 입력 2.select 3.select(height)");
			System.out.println("4.insert(dto) 5.update(name,age)");
			System.out.println("6.delete(age) 7.exit");
			int input = UserInput.inputInt("선택");
			switch (input) {
			case 1:
				dao.init();
				System.out.println("test값을 입력하였습니다.");
				break;
			case 2:
				dao.select();
				break;
			case 3:
				System.out.println("입력한 height값 보다 큰 학생을 출력할 예정입니다.");
				double height = UserInput.inputDouble("height을 입력하세요");
				dao.select(height);
				break;
			case 4:
				System.out.println("입력하고자 하는 Human 데이터 입력");
				HumanDto dto = new HumanDto();
				dto.setName(UserInput.inputString("이름"));
				dto.setAge(UserInput.inputInt("나이"));
				dto.setHeight(UserInput.inputDouble("키"));
				dto.setBirthday(UserInput.inputLocalDateTime("생일"));

				dao.insert(dto);
				break;
			case 5:
				System.out.println("특정 name으로 age 변경");
				String name = UserInput.inputString("이름 : ");
				int age = UserInput.inputInt("나이 : ");
				dao.update(name, age);
				break;
			case 6:
				System.out.println("입력한 나이보다 작은 데이터 삭제");
				dao.delete(UserInput.inputInt("나이 :"));
				break;
			default:
				System.out.println("프로그램 종료");
				isFlag = false;
			}
		}
	}
}
