package ch06.sec08.exam1;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator(); // Calculator 객체 생성
		myCalc.powerOn(); // 리턴값이 없는 powerOn 메소드 호출

		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:" + result1);
		// 이렇게 바로 값을 넣어서 할 수도 있고

		int x = 10;
		int y = 4;

		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		// 이렇게 x랑 y를 따로 변수에다가 담아서 계산을 시켜도 된다~~

		myCalc.powerOff(); // 그냥 말만 출력할 때는 그냥 반환값없는 void메소드를 호출하는 것도 좋다!!

	}

}
