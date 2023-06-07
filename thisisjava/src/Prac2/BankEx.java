package Prac2;

import java.util.Scanner;

public class BankEx {
	
	static int size=0;
	static Account[] account = new Account[100];

	public static void main(String[] args) {
		
		boolean run=true;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("1.계좌생성 2. 계좌목록 3.예금 4.출금 5.종료");
			String input=scan.nextLine();
			
			if("1".equals(input)) {
				System.out.println("계좌를 생성합니다.");
				System.out.println("계좌번호: ");
				String number=scan.nextLine();
				System.out.println("계좌주: ");
				String owner=scan.nextLine();
				System.out.println("초기입금액: ");
				int price=Integer.parseInt(scan.nextLine());
				
				Account acc= SearchAccount(number);
				
				if (acc==null) {
					account[size++]=new Account(number, owner, price);
					System.out.println("계좌가 생성되었습니다.");
				}else {
					System.out.println("이미 존재하는 계좌입니다.");
				}
				
			}else if ("2".equals(input)) {
			System.out.println("계좌목록");
				for (int i = 0; i < size; i++) {
					System.out.println(account[i].getNumber()+"\t"+account[i].getOwner()+"\t"+account[i].getBalance());
				}
			}
			else if ("3".equals(input)) {
				System.out.println("예금");
				System.out.println("계좌번호: ");
				String number=scan.nextLine();
				System.out.println("입금액");
				int price=Integer.parseInt(scan.nextLine());
				
				Account acc= SearchAccount(number);
				if (acc==null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				}else {
					System.out.println(acc.getBalance()+price);
				}//값을 변경하는건데 왜 set이 아니라 get을 사용하는거지..??
						}
			else if ("4".equals(input)) {
			System.out.println("출금");
			System.out.println("계좌번호: ");
			String number=scan.nextLine();
			System.out.println("출금액");
			int price=Integer.parseInt(scan.nextLine());
			
			Account acc = SearchAccount(number);
					if (acc==null) {
						System.out.println("존재하지 않는 계좌번호입니다.");
					}else {
						System.out.println(acc.getBalance()+price);
					}
					
			}else if ("5".equals(input)) {
				
			}
		}
	}

	static Account SearchAccount(String number) {
		for (int i = 0; i <size ; i++) {
			if(number.equals(account[i].getNumber()))
		return account[i];
		}
		return null;
	}
}
