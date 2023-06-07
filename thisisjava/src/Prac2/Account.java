package Prac2;

public class Account {
		
		private String number; 
		private String owner;
		private int balance; 
		//클래스 내에서만 접근가능하도록 private 접근제한자를 사용
		
		public Account(String number, String owner, int balance) {
			this.number=number;
			this.owner=owner;
			this.balance=balance;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}


}
