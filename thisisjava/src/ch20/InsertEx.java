package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertEx {

	public static void main(String[] args) {
		Connection conn = null;
		// insert할 때는 PreparedStatement로 바꿔서 진행
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. DB 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE",
					"testuser", "test1234");

			// 3. Statement 객체 생성
			String sql = "INSERT INTO emp_ex(empno,ename,salary) "
					+ "VALUES(emp_ex_seq.nextval,?,?)";
			// 입력을 받을지 뭐가 올지 모르니까 ?를 넣어둠
			pstmt = conn.prepareStatement(sql);

			// 4. sql 실행(처리)
			// select -> executeQuery : ResultSet 리턴
			// insert/update/delete -> executeUpdate: int 리턴

			pstmt.setString(1, "서민구");
			pstmt.setInt(2, 1000);

			// 물음표 2개에 값을 넣고 업데이트 시킴
			int r = pstmt.executeUpdate();

			// 5. 결과처리(커서 형태)
			if (r > 0) {
				System.out.println("정상적으로 등록되었습니다.");
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
			if (pstmt != null) {
				try {
					pstmt.close();
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