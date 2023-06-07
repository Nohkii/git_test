package ch01.sec09;

public class stringExample {
	public static void main(String[] args) {
		String name="홍길동";
		String job="프로그래머";
		System.out.println("name");
		System.out.println("job");

		String str="나는\"자바\"를 배웁니다.";
		System.out.println(str);

		str="번호\t이름\t직업";
		System.out.println(str);
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다");

		//정수와 정수의 연산은 결과값이 항상 정수
		int kor=90;
		int eng=80;
		int math=87;
		int total=kor+eng+math;
		double avg = total /3.0;
		System.out.println(avg);

	}
}

