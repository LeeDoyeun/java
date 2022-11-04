package tree20221104.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import tree20221104.dto.TreeDto;
import tree20221104.util.DBConn;

public class TreeDao {

	public void init() {// 초기 데이터 정보 insert하는 메서드
		// 1번데이터
		TreeDto dto = new TreeDto("Mango", 200, 4, 7, 50, 4);
		String sql = String.format("insert into tree values('%s',%d,%d,%d,%d,to_date('%s', 'yyyy-mm-dd hh24:mi:ss'))",
				dto.getName(), dto.getPrice(), dto.getExp(), dto.getNowPlanted(), dto.getMaxPlanted(),
				dto.getGrownDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);

		// 2번데이터
		dto = new TreeDto("Papaya", 375, 6, 6, 50, 6);
		sql = String.format("insert into tree values('%s',%d,%d,%d,%d,to_date('%s', 'yyyy-mm-dd hh24:mi:ss'))",
				dto.getName(), dto.getPrice(), dto.getExp(), dto.getNowPlanted(), dto.getMaxPlanted(),
				dto.getGrownDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);

		// 3번데이터
		dto = new TreeDto("Banana Palm", 500, 5, 7, 50, 5);
		sql = String.format("insert into tree values('%s',%d,%d,%d,%d,to_date('%s', 'yyyy-mm-dd hh24:mi:ss'))",
				dto.getName(), dto.getPrice(), dto.getExp(), dto.getNowPlanted(), dto.getMaxPlanted(),
				dto.getGrownDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);

		// 4번데이터
		dto = new TreeDto("Lemon", 750, 8, 1, 50, 8);
		sql = String.format("insert into tree values('%s',%d,%d,%d,%d,to_date('%s', 'yyyy-mm-dd hh24:mi:ss'))",
				dto.getName(), dto.getPrice(), dto.getExp(), dto.getNowPlanted(), dto.getMaxPlanted(),
				dto.getGrownDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);
	}

	public ArrayList<TreeDto> select() {// 테이블 내 모든 컬럼 정보들 select하는 메서드
		ArrayList<TreeDto> resultDtos = new ArrayList<TreeDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from tree"));
		try {
			while (rs.next()) {
				resultDtos.add(new TreeDto(rs.getString("name"), rs.getInt("price"),  rs.getInt("exp"), rs.getInt("nowPlanted"), rs.getInt("maxPlanted"),
						rs.getTimestamp("grownDate").toLocalDateTime()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

	public ArrayList<TreeDto> select(int price) {// 매개변수 price보다 비싼 나무의 정보들 select하는 메서드
		ArrayList<TreeDto> resultDtos = new ArrayList<TreeDto>();
		ResultSet rs = DBConn.statementQuery(String.format("select * from tree where price > %d", price));
		try {
			while (rs.next()) {
				resultDtos.add(new TreeDto(rs.getString("name"), rs.getInt("price"),  rs.getInt("exp"), rs.getInt("nowPlanted"), rs.getInt("maxPlanted"),
						rs.getTimestamp("grownDate").toLocalDateTime()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultDtos;
	}

	public void insert(TreeDto dto) {//새로운 tree 정보를 insert하는 메서드
		String sql = String.format("insert into tree values('%s',%d,%d,%d,%d,to_date('%s', 'YYYY:MM:DD HH24:MI:SS'))",
				dto.getName(), dto.getPrice(), dto.getExp(),dto.getNowPlanted(),dto.getMaxPlanted(),
				dto.getGrownDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		DBConn.statementUpdate(sql);

	}

	public void update(String name, int nowPlanted) {//특정 이름 가진 나무의 현재 심어진 나무 수 update하는 메서드
		DBConn.statementUpdate(String.format("update tree set nowPlanted= %d where name = '%s'", nowPlanted, name));
	}

	public void delete(int exp) {//입력한 경험치보다 작은 데이터 delete하는 메서드
		DBConn.statementUpdate(String.format("delete tree where exp < %d", exp));
	}

}
