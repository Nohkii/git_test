package ch12;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalFormatEx {

	public static void main(String[] args) {

//		String price="1000,000";
//		System.out.println(Integer.parseInt(price.replace(",", "")));

		int price = 1000000;
		DecimalFormat sdf = new DecimalFormat("#,###");
		System.out.println(sdf.format(price));

		// 반올림
		double d = 3.141592;
		DecimalFormat sdf2 = new DecimalFormat("#.###");
		System.out.println(sdf2.format(d));

		// 상품번호: 5자리로 -> 00001
		DecimalFormat sdf3 = new DecimalFormat("00000");
		System.out.println(sdf3.format(123));

		// 날짜 출력
		SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(sdf4.format(new Date()));

		// 정규표현식
		Pattern p = Pattern.compile("a[a-z]*");
		// a-z 뒤에 글자가 있어야함
		Matcher m;
		m = p.matcher("abcdefg");
		System.out.println(m.matches());

		// 게시판에 글을 작성할때 내용에 전화번호가 들어있으면 전화번호를 삭제
		String content = "안녕하세요, 저는 홍길동입니다. 어쩌고 010-7890-1234이고 반갑..";
		p = Pattern.compile("\\d{2,3}-\\d{3,4}-\\d{4}");
		m = p.matcher(content);

		int cnt = 1;
		String newContent = "";

		while (m.find()) {
			newContent = content.replace(m.group(), ""); // 숫자를 공백으로 대체
		}
		System.out.println(newContent);
	}

}
