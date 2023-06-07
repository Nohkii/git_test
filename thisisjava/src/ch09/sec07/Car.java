package ch09.sec07;

public class Car {
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	// 필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다");
		}
	};//선언이 아니라 실행문이기 때문에 ;(세미콜론)을 찍어야 함

	// 메소드(필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	// 메소드(로컬 변수 이용)
	public void run2() {

		// 로컬 변수에 익명 자식 객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2이 굴러갑니다");
			}
		};
	}

	// 메소드(매개변수 이용)
	public void run3(Tire tire) { //Tire 인터페이스를 구현한 자식들(tire등)을 넣을 수 있음
		tire.roll();
	}
}
