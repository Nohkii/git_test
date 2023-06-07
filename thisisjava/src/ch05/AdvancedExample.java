package ch05;

public class AdvancedExample {

	public static void main(String[] args) {
		int[] scores = { 87, 92, 34, 78, 32 };
		int sum = 0;
		for (int score : scores) {
			sum += score;

		}
		System.out.println("점수 총합: " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균: " + avg);
	}

}
