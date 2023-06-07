package ch05;

public class Test {
	public static void main(String[] args) {

		String id = "admin";

		String id2 = new String("admin");

		// 둘 다 admin 출력

		System.out.println(id == id2); // 메모리주소 비교
		//false
		System.out.println(id.equals(id2));
		//true
		// 아이디가 admin이면 관리자 출력

		if ("admin".equals(id)) {
			System.out.println("관리자");
		}

		if (id.equals("admin")) {
			System.out.println("관리자");
		}

		double [ ] arr = new double[ ] { 1.5, 1.2, 1};

		//1은 자동으로 형변환이 되어서 들어감(doubble보다 int가 더 작기때문에 가능함)

		double[ ] arr2 = new double[4];  //{0.0, 0.0, 0.0 0.0}

		for(int i=0; i<arr.length; i++){

		arr2[i] = arr[i];
		}
		
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}

		
//		String str = "";
//		시작시간
//		long start = System.nanoTime();
//		System.out.println(start);
//		for(int i=0; i<1000000; i++) {
//			str+=i;
//		}
//		종료시간
//		long end = System.currentTimeMillis();
//		//종료시간-시작시간 = 소요시간
//		System.out.println("소요시간: "+ (end-start));
	}
}
