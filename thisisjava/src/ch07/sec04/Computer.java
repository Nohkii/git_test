package ch07.sec04;

public class Computer extends Calculator{
	
	@Override
	//메소드 오버라이딩(오버라이딩되는지 체크해주는 역할)
	public double areaCircle(double r) {
		System.out.println("computer객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	
}
