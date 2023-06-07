package ch06.Quiz;

public class AccountEx {

	public static void main(String[] args) {

		//0<=balance<=1000000
				
		Account account= new Account();
		
		account.setBalance(1000);
		System.out.println("현재 잔고: "+ account.getBalance());
	
		account.setBalance(-100);
		System.out.println("현재 잔고: "+ account.getBalance());
	
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+ account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고: "+ account.getBalance());
		
	}

}
