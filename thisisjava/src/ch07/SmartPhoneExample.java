package ch07;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);

		System.out.println("와이파이 상태:" + myPhone.wifi);

		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요~");
		myPhone.sendVoice("네~ 반갑습니다");
		myPhone.hangUp();

		myPhone.setWifi(true);
		myPhone.internet();
		
		int a =0;
		double b = a;
		Phone p = myPhone;
		
		p.sendVoice("안녕");
		
		Phone p2=new Phone();
		SmartPhone c2 = (SmartPhone)p;
		//좁은 범위 = 넓은 범위
		//강제형변화의 조건 : 자식 -> 부모 형변환된 객체만 가능
		
		Object obj = new Phone();
		Object obj2 = new SmartPhone("갤럭시","은색");
		Object obj3 = new SmartPhoneExample();
		
		//다형성 (타입이 달라져 -> 실행코드는 하나지만 결과가 달라지는)
		Phone[] objArr= {myPhone,p,p2,c2};
		
		for(int i=0;i<objArr.length;i++) {
			objArr[i].sendVoice("안녕");
		}
		//부모자식관계를 만들고 재정의해서 결과를 다르게 만드는것,, 
		//이게 다형성이다
		
		
	}

}
