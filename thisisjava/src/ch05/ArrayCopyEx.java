package ch05;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		// System.arraycopy 크게 중요한 부분은 아님,,
		
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray= new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]+ ", ");
			
			System.out.println();
			
			for(String s:oldStrArray) {
				System.out.println(s);
			}
		}
	}
}
