package ch08.sec02;

public class Telelvision implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
		// Override를 반드시해야함(인터페이스에 있는 메소드를 재정의해야 사용할 수 있음!)
	}

}
