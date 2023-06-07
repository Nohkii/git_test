

import java.util.Scanner;

public class ArrayPrac {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] scores = null;
		boolean a = true;

		while (a) {
			System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4.분석 5.종료");
			System.out.println("선택");
			String input = scan.nextLine();

			if ("1".equals(input)) {
				System.out.println("학생수: ");
				int inputNum = Integer.parseInt(input);
				scores = new int[inputNum];

			} else if ("2".equals(input)) {
				if (scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
				} else {
					for (int i = 0; i < scores.length; i++) {
						System.out.println("학생" + (i + 1) + "번 점수: ");

						int score = Integer.parseInt(scan.nextLine());
						scores[i] = score;
					}
				}
			} else if ("3".equals(input)) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수리스트: " + scores[i]);
				}
			} else if ("4".equals(input)) {
				int max = 0;
				int sum = 0;

				for (int i = 0; i < scores.length; i++) {
					max = max < scores[i] ? scores[i] : max;
					sum += scores[i];
				}
				System.out.println("최고 점수:" + max);
				System.out.println("총합 점수:" + sum);
			} else if ("5".equals(input)) {
				a = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
