package ch06.sec08.exam1;

public class Review0309 {

	// 필드
	int number;

	// 생성자
	Review0309() {

	}

	Review0309(int a) {

	}

	void test() {
		int number = 0;

		if (number == 0) {
			System.out.println("족금..졸리군요");
		}
	}

	void gugu() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}
	}
}
