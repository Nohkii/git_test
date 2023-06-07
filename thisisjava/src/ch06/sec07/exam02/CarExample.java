package ch06.sec07.exam02;

public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car("자가용"); //클래스 객체 생성
		System.out.println("car1의 회사는: " + car1.company);
		System.out.println("car1의 모델은: " + car1.model);

		System.out.println();

		Car car2 = new Car("자동차");
		System.out.println("car2의 회사는: " + car2.company);
		System.out.println("car2의 모델은: " + car2.model);
		System.out.println();

		Car car3 = new Car("자동차", "빨강");
		System.out.println("car3의 회사는: " + car3.company);
		System.out.println("car3의 모델은: " + car3.model);
		System.out.println("car3의 색상은: " + car3.color);
		System.out.println();

		Car car4 = new Car("삼성","택시", "검정", 200);
		System.out.println("car4의 회사는: " + car4.company);
		System.out.println("car4의 모델은: " + car4.model);
		System.out.println("car4의 색상은: " + car4.color);
		System.out.println("car4의 최고속도는: " + car4.maxSpeed);

	}

}
