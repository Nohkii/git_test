package ch07.sec7;

public class Child extends Parent {

	@Override //메소드 오버라이딩 -> 오버라이딩을 했는지 체크해줌
	public void method2() {
		System.out.println("child-method2()");
	}

	public void method3() {
		System.out.println("child-method3()");
	}

}
