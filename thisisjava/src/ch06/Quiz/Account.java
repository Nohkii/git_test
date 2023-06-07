package ch06.Quiz;

public class Account {

	private int balance; //외부에서 접근못하게 막기
	static final int MIN_BALACNE=0;
	static final int MAX_BALANCE=1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(MIN_BALACNE<=balance && MAX_BALANCE>=balance) {
			this.balance=balance;
		}
		else{
			this.balance = balance;
		}
		
	}


}
