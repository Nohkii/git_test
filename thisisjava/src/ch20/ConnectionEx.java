package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEx {

	public static void main(String[] args) {
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. DB 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "testuser", "test1234");

			// 3. Statement 객체 생성
			stmt = conn.createStatement();

			// 4. sql 실행(쿼리문 처리)
			
			// select -> executeQuery : ResultSet 리턴
			// insert/update/delete -> executeUpdate: int 리턴
			
			//실행시킬 쿼리 변수에 담아버리기
			String sql = "SELECT * FROM student";
			
			//select니까 executeQuery 사용하고 결과 resultSet에다 담기
			rs = stmt.executeQuery(sql);
			
			// 5. 결과처리(커서 형태)
			while (rs.next()) {//한줄 한줄 처리 -> 남은게 없어지면 끝남
				System.out.println(rs.getString("name")+" "+rs.getString(""));
			}
			// 6. 해제(close) -> finally

			System.out.println("연결성공");

			//에러처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			//if (conn != null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
				}
			//}
				//해지할 때는 보통 역순으로 함(그래야 에러가 안남)
				//이렇게 짧게 한 줄로 써도 된다~~
				if(rs!=null) {try {rs.close();} catch (Exception e) {}}
				if(stmt!=null) {try {stmt.close();} catch (Exception e) {}}
				if(conn!=null) {try {conn.close();} catch (Exception e) {}}
		}
	}

}