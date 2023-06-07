package ch01.sec11;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		int randomNum=(int)((Math.random()*100)+1); //컴퓨터 랜덤번호 만들기
		System.out.println(randomNum);
		
		Scanner scan=new Scanner(System.in);
		boolean run =true;
		int count=0; // 입력받은 회수 카운트
		
		System.out.println("숫자를 맞춰보세요");
		
		while(run) {
			
			String input=scan.nextLine();
			int inputInt=Integer.parseInt(input);
			
			count++;
			
			if(inputInt<randomNum) {
				System.out.println("큰 수를 입력하세요");
			}else if(inputInt>randomNum) {
				System.out.println("작은 수를 입력하세요");
			}else {
				System.out.println("맞았습니다. 시도 회수"+count+"회");
				run=false; //맞았으니까 반복문 종료시키기
			}
		}
	}

}
