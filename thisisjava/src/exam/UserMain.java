package exam;

import java.util.Scanner;

public class UserMain extends User {

	
	public static void main(String[] args) {
		
		int no=0;
		UserTable List[];
		Scanner scan=new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("1. 회원등록 2. 회원목록 3. 회원상세 4. 회원수정 5. 종료");
			System.out.println("입력]");
			String input=scan.nextLine();
			
			if ("1".equals(input)) {
				no++;
				System.out.println("[회원등록]");
				System.out.println("아이디: ");
				String id = scan.nextLine();
				System.out.println("비밀번호: ");
				String pwd = scan.nextLine();
				System.out.println("이름: ");
				String name = scan.nextLine();
				
				userList.add(no,id,pwd,name);
				
			} else if("2".equals(input)){
				System.out.println("회원목록");
				for (int i = 0; i < List.length; i++) {
					UserTable uTable=List.getUser();
					
				}
				
			}else if("3".equals(input)){
				System.out.println("회원상세");
			}
			else if("4".equals(input)){
				System.out.println("회원수정");
			}
			else if("5".equals(input)){

			}

		}
		
	}
}
