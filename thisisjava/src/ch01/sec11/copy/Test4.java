package ch01.sec11.copy;

public class Test4 {

	public static void main(String[] args) {
		//중첩 for문 4x+5y=60 (x,y)형태로 출력 x,y는 자연수10까지
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				while(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
					break;
				}
			}
		}
	}
}
