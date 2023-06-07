package ch05;

public class GarbageObject {

	public static void main(String[] args) {
		//		String hobbyString="";
		//		if("".equals(hobby)){
		//			System.out.println("hobby변수가 참조하는 String 객체는 빈 문자열");
		//			
		//			split으로 .으로 잘라내기
		//			뒤에있는거랑+시간 연결하기
		//		


		//			String[] newName;
		//			newName= new fileName.split(".");
		//			System.out.println(newName[0]);

		String fileName="교육1회차.xlsx";
		//확장자 구하기
		String ext=fileName.substring(fileName.indexOf("."));
		System.out.println(ext);
		String fileName2=System.currentTimeMillis()+ext;
		System.out.println(fileName2);

	}
}

