package human20221102.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class JdbcInsertPre {
	
	//throws 예외처리를 해당 메서드를 호출한 사람에게 위임한다.
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##ldy";
		String pw = "human";
		Connection conn = DriverManager.getConnection(url, user, pw);
		
		String sql = "insert into human values(?,?,?,?)";
		//PreparedStatement는 Statement를 상속받은 클래스로 정확한 값대신 ?를 넣어도 sql 문이 정상작동되도록 해준다.
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "홍길도");
		ps.setInt(2, 10);
		ps.setDouble(3, 142.2);
		//LocalDateTime >> Timestamp
		//java.time.LocalDateTime 자바에서 시간을 다루는 클래스
		//jave.sql.Timestamp 데이터베이스에 넣을 때 사용되는 시간 클래스
		ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
		
		int n = ps.executeUpdate();
		
		System.out.println(n + "개의 로우 입력");
		
		if(ps != null) ps.close();
		if(conn != null) conn.close();

	}

}
