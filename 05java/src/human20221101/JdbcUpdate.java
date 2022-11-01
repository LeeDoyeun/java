package human20221101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JdbcUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ldy";
			String pw = "human";
			Connection conn = DriverManager.getConnection(url, user, pw);
			
			//java.sql로 import해야한다.
			Statement st = conn.createStatement();
			
			String name = "홍길도";
			int age = 39;
			
			
			//insert into human values ('홍길도', 15, 166, to_date('2001:02:03 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
			
			String sql = String.format("update human set age = %d where name = '%s'" ,age, name);
			
			//executeUpdate는 변경된 데이터 개수가 리턴된다.
			int cnt = st.executeUpdate(sql);
			System.out.println(cnt+"개 데이터가 변경되었습니다.");
			
			if(st != null) st.close();
			if(conn != null) conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

	}

}
