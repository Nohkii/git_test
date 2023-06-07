package ch12;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class Calender {

	public static void main(String[] args) {
		//두 날짜 사이의 간격
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal1.set(2023, 1, 21);
		cal2.set(2023, 2, 15);

		long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		System.out.println(diff);
	}
}
