package ch01.sec11;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		/*
		 * while 무한 반복 
		 * 기능 종류: 
		 * 1이면 입력, 잔고+
		 * 2면 입력, 잔고 -
		 * 3이면 잔고 출력
		 * 4면 종료
		 */

		boolean run = true;
		Scanner scan=new Scanner(System.in);
		int account=0;

		while(run) {
			System.out.println("=================");
			System.out.println("1.예금| 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("=================");
			System.out.println("선택>");
			String val=scan.nextLine();

			if("1".equals(val)) {
				System.out.println("예금액>");
				String input=scan.nextLine();
				//account +=input; 이렇게 하면 에러남,,연산한 결과를 account에 담을 수 없음(문자열+숫자라서)
				account=account +Integer.parseInt(input);

			}else if("2".equals(val)){
				//출금하는 값이 잔고(입력한 값)보다 크면 안됨
				System.out.println("출금액>");
				String input=scan.nextLine();
				int inputInt=Integer.parseInt(input);

				if(account<inputInt) {
					System.out.println(account+" 이하로만 출금 가능");
				}

				account=account - Integer.parseInt(input);
				
			}else if("3".equals(val)){
				System.out.println("잔고> "+account);
				
			}else if("4".equals(val)){
				run=false;
			}
		}
	}

}
