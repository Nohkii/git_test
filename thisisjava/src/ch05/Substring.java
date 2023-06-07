package ch05;

import java.util.Iterator;

public class Substring {

	public static void main(String[] args) {
		String ssn="880815-1234567";
		String firstNumString=ssn.substring(0,6);
		String secondNumString=ssn.substring(7);
		//System.out.println(firstNumString);
		//System.out.println(secondNumString);
		
//		for(int i=0;i<ssn.length();i++) {
//			System.out.println(ssn.substring(i,i+1));	
//		}
		
		String subject="자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
	}
}
