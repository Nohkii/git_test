package ch11;

public class DebugEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		System.out.println(a);
		a = 20;
		System.out.println(a);
		a = 30;
		System.out.println(a);
		System.out.println(b);
		a=a/b;	//정수와 정수를 나누는 거라서 에러가 나지 않음
	}
}
