package prac.ObjectArrayPrac;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[3];
		// 객체 배열 선언 및 생성

		Book a = new Book();
		for (int i = 0; i < library.length; i++) {
//			library[i] = a;
			library[i] = new Book();
		} // Book 객체 생성

		library[0].title = "국어책";
		library[0].price = 10000;
		for (int i = 0; i < library.length; i++) {
			library[i].showPrice();
			System.out.println(library[i]);
		}
		library[1].title = "영어책";
		library[1].price = 14000;
		for (int i = 0; i < library.length; i++) {
			library[i].showPrice();
			System.out.println(library[i]);
		}
		library[2].title = "수학책";
		library[2].price = 5000;

		for (int i = 0; i < library.length; i++) {
			library[i].showPrice();
			System.out.println(library[i]);
		}

	}

}
