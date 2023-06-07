package ch06.Quiz;

public class Test15 {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
		System.out.println("로그인되었습니다");	
		memberService.logout("hong");
		}
		else {
			System.out.println("id또는 password가 올바르지 않습니다");
			
		}
		
	}
	
}

class MemberService{
	
	String id;
	String password;
	
	boolean login(String id,String password){
		if("hong".equals(id)&&"12345".equals(password)) {
			return true;
		}
		return false;
		
	}
	
	void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
	
}
