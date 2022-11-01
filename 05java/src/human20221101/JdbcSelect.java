package human20221101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class JdbcSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 1.드라이버 로딩
			// class.forName new 클래스() 문자열로 클래스 생성하는 메서드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 연결");

			// 2.데이터베이스 연결 Connection 클래스
			// jdbc:oracle:thin(제품명):@localhost(주소):1521(포트):xe(씨드아이디)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ldy";
			String pw = "human";

			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속 성공");
			
			// 3.데이터베이스 sql문 전송을 위한 쿼리 생성과 담당 객체 생성(statement)
			String sql = "select * from human";
			Statement st = conn.createStatement();
			
			// 4.데이터베이스에 sql문을 전송
			ResultSet rs = st.executeQuery(sql);
			
			//5. resultSet 출력하기
			
			//ResultSet rs에 sql문 실행 결과가 테이블 형태로 담겨져 있다.
			//읽어오는 방법
			//읽어올 때 사용하는 메서드
			//.getInt(), .getDouble(), .getString(), .getTimestamp()
			
			//읽어 올 때 여러 컬럼 중 어떤 컬럼의 값을 가져올 것인가?
			//2가지 방법이 있는데 
			//1. 테이블 만들 때 기술한 순서의 숫자
			//2.테이블 만들 때 사용한 컬럼명으로 읽어오는 방법
			
			//Human(String name, int age, double height, LocalDateTime birthday)
//			rs.getString(1); rs.getInt(2); rs.getDouble(3); rs.getTimestamp(4);
//			rs.getString("name"); rs.getInt("age");
//			rs.getDouble("height"); rs.getTimestamp("birthday");
			
			while(rs.next()) {
				//1.
//				System.out.println("name : "+rs.getString(1));
//				System.out.println("age : "+rs.getInt(2));
//				System.out.println("height : "+rs.getDouble(3));
//				System.out.println("birthday : "+rs.getTimestamp(4));
//				System.out.println("--------------------------------");
				//2. 변수에 넣어서 출력
//				String name = rs.getString(1);
//				int age = rs.getInt(2);
//				double height = rs.getDouble(3);
//				LocalDateTime birthday = rs.getTimestamp(4).toLocalDateTime();
//				
//				System.out.println("name : "+name);
//				System.out.println("age : "+age);
//				System.out.println("height : "+height);
//				System.out.println("birthday : "+birthday);
//				System.out.println("--------------------------------");
				
				//3. 컬럼명으로 접근하기
				String name = rs.getString("name");
				int age = rs.getInt("age");
				double height = rs.getDouble("height");
				LocalDateTime birthday = rs.getTimestamp("birthday").toLocalDateTime();
				
				System.out.println("name : "+name);
				System.out.println("age : "+age);
				System.out.println("height : "+height);
				System.out.println("birthday : "+birthday);
				System.out.println("--------------------------------");
			}
			//6.대이터베이스와 연결된 자원을 반납
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(conn!=null) conn.close();
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
