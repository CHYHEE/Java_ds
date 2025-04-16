package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("");
			OutputStream os = new FileOutputStream("/Users/yhee/Desktop/MAC");
			
			byte[] data = new byte[1024];
			
			int num = 0;
			
			while((num = is.read(data)) != -1) {
				os.write(data,0,num);
			}
			
			os.flush();
			os.close();
			is.close();
			System.out.println("복사가 잘 되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
