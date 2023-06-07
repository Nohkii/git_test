package ch07.sec7;

public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		Parent p = child;
		//Parent p = new Child(); 이것도 동일하게 타입변환된것!
		//->이렇게 사용할 수도 있으니 알아둬라~~

		p.method1();
		p.method2(); //자식객체로 오버라이딩된 객체가 불러짐
	}

}
