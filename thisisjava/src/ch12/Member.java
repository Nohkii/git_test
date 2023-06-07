package ch12;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String name;
	private int age;
	
	
	//배열에다가 숫자,문자,문자열,Member 객체
	
	Object[] obj = {1,3.14,'A',"ABC", new Member()};
	//auto boxing
	Object[] obj2 = {new Integer(1),3.14,'A',"ABC", new Member()};
	
	Integer integer =1; //boxing
	int i2 =integer; //unboxing
}
