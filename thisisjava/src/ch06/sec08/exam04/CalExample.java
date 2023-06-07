package ch06.sec08.exam04;

public class CalExample {

	public static void main(String[] args) {
		
		Calculator myCalcul = new Calculator(); //객체생성

		double result1 = myCalcul.areaRectangle(10);

		double result2 = myCalcul.areaRectangle(10, 20);

		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이: " + result2);
	}

}
