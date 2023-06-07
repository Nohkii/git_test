package ch01.sec11;

public class Test6 {

	public static void main(String[] args) {
		/*
		 * 
		 **
		 ***
		 ****
 		행 단위 출력 (5개 행)
 		한 행 * (열) 반복출력
		 */

		for(int i=1;i<6;i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
