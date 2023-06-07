
public class Bmi {

	public static void main(String[] args) {
		
		double height = 180;
		double weight = 80;

		double hitghtM= height/100;
		
		
		// 메서드 호출 및 출력
		System.out.println(bmi(hitghtM, weight));
		
	}

	public class bmi(double height, double weight) {
		
		double cal= weight/(height*height);
		
		 if (cal>25) {
			System.out.println("비만");
		} else if(25>=cal&& cal>=18.5){
			 System.out.println("표준");
		}else {
			 System.out.println("저체중");
		}
		
		
	}
}

