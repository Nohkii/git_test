package prac.ObjectArrayPrac;

public class Book {

//필드 선언
	String title;
	int price;

//기본 생성자
	public Book() {
	}

	public void showPrice() {
		System.out.println(title + "의 가격은 " + price + "입니다.");
	}
}
