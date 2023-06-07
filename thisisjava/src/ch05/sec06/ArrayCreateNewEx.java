package ch05.sec06;

public class ArrayCreateNewEx {

	public static void main(String[] args) {

		int[] arr1 = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i]);
		}
		System.out.println();

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i]);
		}
		System.out.println("/n");

		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr[" + i + "] : " + arr3[i]);
		}
		System.out.println();

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr[" + i + "] : " + arr3[i]);

		}
	}
}
