package bank;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.IvParameterSpec;

public class AccountDAO {

	// 등록, 목록, 예금, 출금 기능
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public AccountDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int insert(AccountVO acc) {
		int r = 0;
		if (findAccount(acc.getNumber()) == 0) {

			// 길어서 위에다가 따로 빼냄
			String sql = "INSERT INTO account " + "(number,owner,balance)" + "VALUES(?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, acc.getNumber());
				pstmt.setString(2, acc.getOwner());
				pstmt.setInt(3, acc.getBlance());
				r = pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return r;
	}

	// 전체계좌
	public List<AccountVO> selectALL(){
		//지역변수는 초기화하지 않으면 사용할 수 없음
		List<AccountVO>list=new ArrayList<>();
		try {
			stmt.=conn.createStatement();
			rs=stmt.excuteQuery("SELECT * FROM account ORDER BY ")
					AccountVO vo;
			whild(rs.next()){
				vo.setNo(rs.getInt("no"));
				vo.setNumber(rs.getString("number"));
				vo.setOwner(0);
			}
			//예금
			public int deposit(string number,int price) {
				int r =0;
				if (findAccount(number)==1) {
					try {
						pstmt=conn.prepareStatement("UPDARE account Set balance=blance+? WHERE VAL?")
						pstmt.setInt(1, price);	
						pstmt.setString(2, number);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else {
					r=-1;
				}
				return r;
				)
			}
			
		} catch (Exception e) {
System.out.println(e.getMessage());
		}}

	// 계좌조회
	public int findAccount(String number) {
		int r=0;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT * FROM account WHERE number")
					if(rs.next()) r = rs.getInt("no");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return r;
	}

	public void close() {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		;
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (Exception e) {
			}
		;
		if (stmt != null)
			try {
				stmt.close();
			} catch (Exception e) {
			}
		;
		if (conn != null)
			try {
				conn.close();
			} catch (Exception e) {
			}
		;
	}

}
