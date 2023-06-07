package ch18;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class ReadEx {

	public static void main(String[] args) {

		
		try {
			InputStream is = new FileInputStream("D:/java/test1.db");
			
			while (true) {
				int date = is.read();
			}
		} catch (Exception e) {;
		
			// TODO: handle exception
		}
	}

}
