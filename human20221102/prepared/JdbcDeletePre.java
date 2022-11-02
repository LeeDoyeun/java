package human20221102.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class JdbcDeletePre {
	
	//throws 예외처리를 해당 메서드를 호출한 사람에게 위임한다.
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##ldy";
		String pw = "human";
		Connection conn = DriverManager.getConnection(url, user, pw);
		
		String sql = "delete human where name = ?";
		//PreparedStatement는 Statement를 상속받은 클래스로 정확한 값대신 ?를 넣어도 sql 문이 정상작동되도록 해준다.
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "홍길도");
	

		int n = ps.executeUpdate();
		
		System.out.println(n + "개의 로우 삭제");
		
		if(ps != null) ps.close();
		if(conn != null) conn.close();

	}

}
