

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		/*
		 * while, scanner 사용 사용자 입력 
		 * 1. 학생수 입력 
		 * 2. 입력한 학생 수 만큼 점수 입력 
		 * 3. 전체 학생 점수 출력 
		 * 4. 전체학생 중 최고점수, 평균점수 출력
		 * 5. 중지
		 */
		Scanner scan = new Scanner(System.in); // 스캐너 가져오기
		int[] scores = null; // score 배열 초기화

		while (true) { 

			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택>");
			String val = scan.nextLine(); //사용자에게 숫자 입력받기

			if ("1".equals(val)) {
				System.out.println("학생수>");
				int count = Integer.parseInt(scan.nextLine()); //입력한 값 숫자로 변환하기
				scores = new int[count]; // 입력한 값 scores 배열에 넣기
				//count만큼 입력받을 수 있도록 []안에다가 count를 넣는거였음..!!!

			} else if ("2".equals(val)) {
				if (scores == null) { // 입력한 값이 없을 때
					System.out.println("학생수를 먼저 입력하세요");
				} else { 
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]>");
						int score = Integer.parseInt(scan.nextLine()); 
						//입력한 점수 담을 변수 만들어서 숫자로 변환시키기
						scores[i] = score;
					}
				}

			} else if ("3".equals(val)) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
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
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
