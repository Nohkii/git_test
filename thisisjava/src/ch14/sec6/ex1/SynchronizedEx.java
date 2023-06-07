package ch14.sec6.ex1;

public class SynchronizedEx {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(); //Calculator 객체 생성
		
		User1Thread user1Thread = new User1Thread(); //User1Thread 객체 생성
		user1Thread.setCalculator(calculator);
		//user1Thread에 있는 setCalculator 함수 호출
		user1Thread.start(); //작업스레드(재정의된 run() 실행)
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start(); //재정의된 run() 실행
	}

}
