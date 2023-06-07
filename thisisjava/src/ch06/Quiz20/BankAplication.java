package ch06.Quiz20;

import java.util.Scanner;

public class BankAplication {

	static int size = 0;
	static Account[] account = new Account[100]; // 배열 생성
	// null,null,null... 이런 상태

	public static void main(String[] args) {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		while (flag) {

			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			String input = scan.nextLine();

			if ("1".equals(input)) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				System.out.print("계좌번호:");
				String number = scan.nextLine();
				System.out.print("계좌주:");
				String owner = scan.nextLine();
				System.out.print("초기입금액:");
				int price = Integer.parseInt(scan.nextLine()); // 금액은 숫자로 변환

				Account acc = searchAccount(number);
				//searchAccount를 사용해서 계좌번호가 있는지 없는지 검증하기
				// double n = Math.round(3.14)와 같은 구성

				if (acc == null) {
					account[size++] = new Account(number, owner, price);
					System.out.println("결과: 계좌가 생성되었습니다.");
				} else {
					System.out.println("이미 존재하는 계좌번호입니다.");
				}
			} else if ("2".equals(input)) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for (int i = 0; i < size; i++) {
					System.out.println(
							account[i].getNumber() + "\t" + account[i].getOwner() + "\t" + account[i].getBalance());
				}
				
				// length로 for문을 돌리면 null일때(2개 끝나면 나머지 98개) 에러가 남 -> size 사용
				// System.out.println(account[0].getNumber());
				// 이렇게 하면 null값이 있어서 NullPointerException 에러가 발생함
				
			} else if ("3".equals(input)) {
				// 입력한 계좌번호를 찾아서 거기에 입금해야함
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String number = scan.nextLine();
				System.out.print("예금액:");
				int price = Integer.parseInt(scan.nextLine());
				Account acc = searchAccount(number);
				if (acc == null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				} else {
					acc.setBalance(acc.getBalance() + price);
				}
			} else if ("4".equals(input)) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String number = scan.nextLine();
				System.out.print("출금액:");
				int price = Integer.parseInt(scan.nextLine());
				Account acc = searchAccount(number);
				if (acc == null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				} else {
					acc.setBalance(acc.getBalance() - price);
				}
			} else if ("5".equals(input)) {
				flag = false;
			}
		}
	}

	static Account searchAccount(String number) {
		for (int i = 0; i < size; i++) { // 100개 다 돌리는게 아니라 배열에 들어간 숫자만큼 돌리기
			if (number.equals(account[i].getNumber())) {
				return account[i];
			}
		}
		return null;
	}
}
