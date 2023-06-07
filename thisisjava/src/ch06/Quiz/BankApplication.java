package ch06.Quiz;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input=scan.nextLine();
		//int inputNum=Integer.parseInt(input);
		
		boolean run=true;
		
		String accountNum;
		String name;
		String FirstM;
		String result;
		
		Account20 account = new Account20(accountNum, name, FirstM, result);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 계좌생성| 2. 계좌목록| 3. 예금| 4. 출금| 5. 종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			
			if(input=="1") {
				System.out.println("계좌생성");
				System.out.println("계좌번호: ");
				String accountNum = scan.nextLine();
				System.out.println("계좌주: ");
				String name = scan.nextLine();
				System.out.println("초기입금액: ");
				String FirstM = scan.nextLine();
				System.out.println("결과: ");
				String result = scan.nextLine();
				
				System.out.println("");
			}else if(input=="2") {
				System.out.println("계좌목록");
				System.out.println(Account20());
				
			}else if(inputNum==3) {
				System.out.println("예금");
				
			}else if(inputNum==4) {
			}else if(inputNum==5) {
				run=false;
			}
			
		}
		
		
		
	}

}
