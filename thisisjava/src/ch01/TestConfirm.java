package ch01;

public class TestConfirm {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 총합은 "+ sum);
//
//		double num1=Math.round((Math.random()*4));
//		double num2=Math.round((Math.random()*4));
//
//		while(true) {
//			(int)num1+(int)num2==5;
//			break;
//		}
//		System.out.println("("+num1+")"+"("+num2+")");

	}
}



