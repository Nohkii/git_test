package prac;

import java.util.Scanner;

public class BankEx {

	static int size=0;
	static Account[] account = new Account[100];

	public static void main(String[] args) {

		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("선택>");
			String input = scan.nextLine();
			if ("1".equals(input)) {
				System.out.println("계좌생성");
				System.out.println("계좌번호");
				String accountNum = scan.nextLine();
				System.out.println("계좌주:");
				String name = scan.nextLine();
				System.out.println("초기입금액:");
				int inputMoney = Integer.parseInt(scan.nextLine());
				
				Account acc=checkNum(accountNum);
				
				if(acc==null) {
					account[size++]= new Account(accountNum,name,inputMoney);
					System.out.println("계좌가 생성되었습니다.");
				}else {
					System.out.println("이미 존재하는 계좌번호입니다.");
				}
				
			} else if ("2".equals(input)) {
				System.out.println("계좌 목록");
				for (int i = 0; i < size; i++) {
					System.out.println(account[i].getAccountNum()+"/t"+account[i].getName()+"/t"+account[i].getInputMoney());
				}

			} else if ("3".equals(input)) {
				System.out.println("예금");
				System.out.println("계좌번호: ");
				String accountNum = scan.nextLine();
				System.out.println("예금액");
				int price=Integer.parseInt(scan.nextLine());

				Account acc=checkNum(accountNum);
				if (acc= null) {
					System.out.println("존재하지 않는 계좌번호");
				}else {
					acc.setInputMoney(acc.getInputMoney()+price);
				}
				
			} else if ("4".equals(input)) {
				System.out.println("출금");
				System.out.println("계좌번호: ");
				String accountNum = scan.nextLine();
				System.out.println("출금액");
				int price=Integer.parseInt(scan.nextLine());

				Account acc=checkNum(accountNum);
				if (acc=null) {
					System.out.println("존재하지 않는 계좌번호");
				}else {
					acc.setInputMoney(acc.getInputMoney()-price);
				}

			} else if ("5".equals(input)) {
				run=false;
			}
		}
		
		private static Account checkNum(String accountNum) {
			for (int i = 0; i < size; i++) {
				if (accountNum.equals(account[i].getAccountNum())) {
					return account[i];
				}
			}
			return null;
			
		}
	}

	private static Account checkNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}


}
