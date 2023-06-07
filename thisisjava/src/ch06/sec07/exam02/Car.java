package ch06.sec07.exam02;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자 선언
	Car() {
	}

	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car(String company, String model, String color, int maxSpeed) {
		this.company=company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
	// 생성자 선언

