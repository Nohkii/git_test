package prac3;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		UserTable userTable = new UserTable();
		
		do {
			System.out.println("1.회원등록 2. 회원목록 3.회원상세 4.회원수정 5.종료");
			System.out.println("선택");
			String inputNum=scan.nextLine();
			
			if (inputNum.equals("1")) {
				System.out.println("회원 등록");
				
				System.out.println("id:");
				String id;
				do {
					id=scan.nextLine();
				} while (id.equals(""));
				
				System.out.println("비밀번호:");
				String pwd= scan.nextLine();
				System.out.println("이름:");
				String name= scan.nextLine();
				if (userTable.insert(id, pwd,name)) {
					System.out.println("회원등록 성공");
				}else {
					System.out.println("중복된 아이디입니다.");
				}
				
				
			}else if (inputNum.equals("2")) {
				System.out.println("회원목록");
				System.out.println("번호\t아이디\t비밀번호\t이름");
				if (userTable.no>0) {
					for (User user : userTable.userList) {
						System.out.println(user.getNo()+"\t"+user.getId()+"\t"+ user.getPwd()+"\t"+user.getName());
					}
				}
				
			}else if (inputNum.equals("3")) {
				System.out.println("회원상세");
				String id = scan.nextLine();
				
				User user = userTable.findUser(id);
						if (user!=null) {
							System.out.println("번호:"+user.getNo());
							System.out.println("아이디:"+user.getId());
							System.out.println("비밀번호랑 등등~~나옴~~");
						}else {
							System.out.println("해당 아이디가 존재하지 않습니다");
						}
				
			}else if (inputNum.equals("4")) {
				System.out.println("회원수정");
				String id;
				do {
					id = scan.nextLine();
				} while (id.equals(""));
				System.out.println("이름");
				String name= scan.nextLine();
				System.out.println("비밀번호");
				String pwd= scan.nextLine();
				
				boolean user= userTable.update(id, name, pwd);
				if (user) {
					System.out.println("정상적으로 수정되었습니다");
				}else {
					System.out.println("해당 아이디가 존재하지않습니다");
				}
				
			}
			
		} while (scan.equals("5"));
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	

}
