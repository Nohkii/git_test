package ch14;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 소리내는 코드
					try {
						Thread.sleep(500); // 0.5초 멈추게하는 코드
					} catch (Exception e) {
					}
				} 
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
	}

}
