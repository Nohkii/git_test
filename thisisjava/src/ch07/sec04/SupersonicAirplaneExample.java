package ch07.sec04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplain sa = new SupersonicAirplain();

		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplain.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplain.NORMAL;
		sa.fly();
		sa.land();
	}
}
