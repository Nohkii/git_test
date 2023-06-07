package ch07.sec10;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("홍길동");

		abstract void turnOn();
		abstract void turnOff();
		smartphone.internetSearch();
	}

}
