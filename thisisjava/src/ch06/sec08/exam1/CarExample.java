package ch06.sec08.exam1;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car(); // Car 객체생성
		myCar.setGas(5); // 5만큼 주유

		if (myCar.isLeftGas()) { // true/false를 리턴하는 메소드
			System.out.println("출발합니다");

			myCar.run();
		}
		System.out.println("gas를 주입해주세요");
	}

}
