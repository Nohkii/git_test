package ch01.sec09;

public class ConfirmExample {
	public static void main(String[] args) {
		int pencils = 534;
		int students=30;
		
		int pencilsPerStudent=pencils%students;
			System.out.println(pencilsPerStudent);
		
		int pencilsLeft=pencils-(pencilsPerStudent*students);
				System.out.println(pencilsLeft);
				
		int value =356;
		System.out.println(value%100);
		System.out.println(value/100*100);
	}

}

