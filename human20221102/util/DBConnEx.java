package human20221102.util;

import java.sql.ResultSet;
import java.time.LocalDateTime;

public class DBConnEx {

	public static void main(String[] args) throws Exception {
		
//		//DBConn 사용방법
//		DBConn.getInstance();
//		DBConn.statementUpdate();//DB사용
//		DBConn.statementQuery();//DB사용
//		DBConn.dbClose();//DB종료
//		//resultset사용이 종료된 후에 DB를 닫아야 resultSet사용에 문제가 없다.
		
		// insert
		DBConn.statementUpdate("insert into human values"
				+ "('홍길나',52,151.2,sysdate)");
		//update
		DBConn.statementQuery("update human set age = 50 where name = '홍길나'");
		//delete
		DBConn.statementUpdate("delete human where name = '홍길나'");
		//select
		ResultSet rs = DBConn.statementQuery("select * from human");
		while(rs.next()) {
			//컬럼명으로 접근하기
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
	}

}
