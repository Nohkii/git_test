package ch05;

public class Quiz7 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int num = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				num = array[i + 1];
				System.out.println(num);
			}
		}
		System.out.println("최대값은: " + num);
	}

}
