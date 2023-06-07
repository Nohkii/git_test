package ch14.sec6.ex1;

public class User1Thread extends Thread{
	private Calculator calculator;

	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator=calculator;
	}
	@Override
	public void run() { //스레드 실행 코드
		calculator.setMemory1(100);
	}
}
