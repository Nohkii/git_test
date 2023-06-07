package ch05;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
//while scanner 사용 
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		boolean run2=true;
		
		int StudentNum=0;
		
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("----------------------------------------------------");

		
		while(run) {
			int input=scanner.nextInt();
			int[] inputArray= new int[input];
			
			if(input==1) {
					StudentNum=inputArray.length;
				System.out.println(StudentNum);
				
			}else if(input==2) {
				for (int i = 0; i < inputArray.length; i++) {
					inputArray[i]=scanner.nextInt();
				}
			}else if(input==5) {
				run=false;
			}
			
		}
		

	}

}
