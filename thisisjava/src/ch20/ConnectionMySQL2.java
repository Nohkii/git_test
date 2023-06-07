package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionMySQL2 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB 연결하기
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");


			// 3. Statement 객체 생성
			stmt = conn.createStatement();

			// 4. sql 실행(처리)
			// select -> executeQuery : ResultSet 리턴
			// insert/update/delete -> executeUpdate: int 리턴
			String sql = "SELECT * FROM student";
			rs = stmt.executeQuery(sql);
			// 5. 결과처리(커서 형태)
			while (rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getString(""));
			}
			// 6. 해제(close) -> finally

			System.out.println("연결성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			// if (conn != null) {
			try {
				conn.close();
				System.out.println("연결끊기");
			} catch (SQLException e) {
			}
			// }
			// 해지할 때는 보통 역순으로 함(그래야 에러가 안남)
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
	}

}
