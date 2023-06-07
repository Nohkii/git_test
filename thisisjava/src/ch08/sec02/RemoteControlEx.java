package ch08.sec02;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Telelvision();
		//rc의 타입은 인터페이스, 담긴건 tv 객체 상속과 비슷한 개념,,
		rc.turnOn();
	}

}
