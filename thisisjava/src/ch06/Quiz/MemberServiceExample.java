package ch06.Quiz;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");

		if(result) {
			System.out.println("로그인 되었습니다");
			MemberService.logout("hong");
		}else {
			
		}
		
		
		

	}

}
