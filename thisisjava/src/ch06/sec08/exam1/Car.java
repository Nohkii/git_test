package ch06.sec08.exam1;

public class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas; // gas값을 초기화
	}

	boolean isLeftGas() { // is~?라고 물어보는거,,거의 불리언임
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}

		System.out.println("gas가 있습니다");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. gas잔량: " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다. gas잔량: " + gas);
				return; // break랑 똑같은 의미
			}
		}
	}
}
