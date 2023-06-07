package ch06.sec08.exam1;

public class Singleton {

	// 다른 사람들이 못사용하도록 private으로 막아둠
	// -> .singleton으로 사용할 수 없도록
	private static Singleton singleton = new Singleton();

	private Singleton() {
	};

	// 다른곳에서 객체를 쓸 수 있도록,,public으로 만들어둬야함
	public static Singleton getInstance() {
		return singleton;
	}

}
