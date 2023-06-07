package prac;

public class Account {

	String accountNum;
	String name;
	int inputMoney;
	
	public Account(String accountNum, String name, int inputMoney) {
		this.accountNum=accountNum;
		this.name=name;
		this.inputMoney=inputMoney;
		
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInputMoney() {
		return inputMoney;
	}
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}
	
	

}
