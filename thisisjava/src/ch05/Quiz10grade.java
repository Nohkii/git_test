package ch05;

import java.util.Scanner;

public class Quiz10grade {

	public static void main(String[] args) {

		// int[] student; <- 객체 배열은 선언만 하면 안되고 초기값까지 넣어야 사용 가넝
		int[] student = null;
		boolean run = true;

		while (run) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("선택>");
			String input = scan.nextLine();

			if ("1".equals(input)) {
				System.out.println("학생수>");
				int inputNum = Integer.parseInt(scan.nextLine());
				// input은 번호선택하는용이니까 새로 만들어야 함!!
				student = new int[inputNum];
				System.out.println(student.length);

			} else if ("2".equals(input)) {
				if (student == null) {
					System.out.println("학생수를 먼저 입력하세요");
				} else {
					System.out.println("점수를 입력하세요");
					for (int i = 0; i < student.length; i++) {
						System.out.println((i + 1) + "번째 학생의 점수: ");
						int grade = Integer.parseInt(scan.nextLine());
						student[i] = grade;
					}
				}
			} else if ("3".equals(input)) {
				// for문 돌면서 출력하기
				for (int i = 0; i < student.length; i++) {
					System.out.println("학생" + (i + 1) + "의 점수: " + student[i]);
				}
			} else if ("4".equals(input)) {
				int sum = 0;
				for (int i = 0; i < student.length; i++) {
					sum += student[i];
				}
				System.out.println("총합계는" + sum);

			} else if ("5".equals(input)) {
				run = false;
			}

		}
	}

}
