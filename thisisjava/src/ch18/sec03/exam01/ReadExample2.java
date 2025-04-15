package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("");
			byte[] data = new byte[100];
			while(true) {
				System.out.println("while 반복");
				int num = is.read(data);
				if(num == -1) break;

				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
				
			}
			is.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
