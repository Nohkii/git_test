package prac;

public class ChineseRestaurant {

	public static void main(String[] args) {

		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);

		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menuArr);

		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}

}

class Order {

	// 필드
	int orderNum;
	Menu[] menus;

	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}

	// 메소드
	public int totalPrice() {
		// 모든 주문 총합을 반환하세요
		return 0;
	}
}

class Menu {
	// 필드
	String name;
	int price;

	// 생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}

}
