package ch11;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("시작");
		try {
			System.out.println(3 / 0);
			int arr[]= {1,2,3};
			System.out.println(arr[3]);
		} 
		catch (Exception e) { //한 번에 다 잡기(가장 넓은게 아래로)
			System.out.println("예외발생");
			System.out.println(e.getMessage()); //by zero
			e.printStackTrace(); //java.lang.ArithmeticException: / by zero
								//at ch11.Exception1.main(Exception1.java:7)
		}finally {
			//예외가 발생하던 안하던 무조건 실행
		}
		System.out.println("끝");
	}
}
