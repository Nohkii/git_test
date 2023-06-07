package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExMysql {

	Connection con = null;
	Statement stmt = null;
	String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul";
	String user = "testuser";
	String passwd = "test1234";
	ResultSet rs = null;

	public static void main(String[] args) {

		InsertExMysql db = new InsertExMysql();

		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. DB 연결하기
			db.con = DriverManager.getConnection(db.url, db.user, db.passwd);

			// 3. Statement 객체 생성
			db.stmt = db.con.createStatement();

			// 리스트
			System.out.println("1. 계좌 생성");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌 조회");

			System.out.println("번호 입력:");
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();

			switch (num) {
			case 1:
				db.createTable();
				break;
			case 2:
				db.insertData();
				break;
			case 3:
				db.removeData();
				break;
			case 4:
				db.viewData();
				break;
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	
	}
	private void createTable() {
		try {String createString= "CREATE TABLE user (name varcaha(10) not null, id varchar(20) n"
				+ "password"
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private void viewData() {
		// TODO Auto-generated method stub

	}

	private void removeData() {
		// TODO Auto-generated method stub

	}

	private void insertData() {
		// TODO Auto-generated method stub

	}


}