package ch01.sec11;

public class Test1 {

	public static void main(String[] args) {
		/* while, Math.random() 사용
		 * 두 개의 주사위 (눈1, 눈2) 출력
		 * 눈의 합이 5가 아니면 계속 던지다가 5가되면 멈춤
		 */

				double num1=Math.round((Math.random()*6));
				double num2=Math.round((Math.random()*6));
		
				while((int)num1+(int)num2==5) {
					break;
				}
				System.out.println("("+num1+", "+num2+")");
	}
}
//		boolean flag=true;
//
//		while(flag) {
//			int dice1=(int)(Math.random()*6)+1;
//			int dice2=(int)(Math.random()*6)+1;
//			//Math.random()을 돌리면 소수점이 나오는데 그걸 int에 넣을 수 있나..???
//
//			System.out.println("("+dice1+", "+dice2+")");
//
//			if(dice1+dice2==5) {
//				flag=false;
//			}
//		}
				
