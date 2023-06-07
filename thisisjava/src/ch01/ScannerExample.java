package ch01;

import java.util.Scanner;

public class ScannerExample {	

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);

		System.out.println("x값 입력: "); //X값 입력하게 뜸
		String strX = scanner.nextLine(); //strX에 입력한 값이 저장됨
		int x=Integer.parseInt(strX); // 입력한 값을 정수로 변환함

		System.out.println("y값 입력: ");
		String strY=scanner.nextLine();
		int y= Integer.parseInt(strY);

		int result=x+y; //입력한 두 값 더해서
		System.out.println("x+y: "+result); //출력함
		System.out.println(); //줄바꿈

		while(true) { //무한반복
			System.out.println("입력문자열");
			String data=scanner.nextLine(); 
			if(data.equals("q")) { //만약 q입력하면 반복문 탈출
				break;
			}
			System.out.println("출력문자열: "+ data); //입력한 문자열 뱉음
			System.out.println();

		}

		System.out.println("종료");
	}
}


