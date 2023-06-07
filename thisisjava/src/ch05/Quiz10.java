package ch05;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * while, scanner 사용 사용자 입력 1. 학생수 입력 2. 입력한 학생 수 만큼 점수 입력 
		 * 3. 전체 학생 점수 출력 4. 전체 학생 중 최고점수, 평균점수 출력 5. 중지
		 */

		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택>");
			String val = scan.nextLine(); // val에다가 입력한 값 담기
			int[] scores = null; // 입력한 점수 담을 배열 초기화

			if ("1".equals(val)) {
				System.out.println("학생수>");
				int count = Integer.parseInt(scan.nextLine());
				scores = new int[count]; // 다시 초기화시킴
				System.out.println(scores.length);

			} else if ("2".equals(val)) {
				if (scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
				} else {
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]>");
						int score = Integer.parseInt(scan.nextLine());
						scores[i] = score;
					}
				}

			} else if ("3".equals(val)) {
				for (int i = 0; i < scores.length; i++) {
					
					System.out.println("score: " + scores[i]);
				}

			} else if ("4".equals(val)) {
				int max = 0;
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i])
						max = scores[i];
					sum += scores[i];
					System.out.println("최고점수: " + max);
					System.out.println("평균 점수: " + (double) sum / scores.length);
				}

			} else if ("5".equals(val)) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}