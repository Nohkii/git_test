package ch05;

public class Quiz8 {

	public static void main(String[] args) {

		// 전체 합과 평균 구하기 중첩for문
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		int count = 0;
		int avg = 0;

		for (int i = 0; i < array.length; i++) {
			count += array[i].length;
			// int[] arr = array[i] 이렇게 할 수도 있음

			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		avg = sum / count;
		System.out.println("전체합:" + sum);
		System.out.println("평균:" + avg);

	}

}
