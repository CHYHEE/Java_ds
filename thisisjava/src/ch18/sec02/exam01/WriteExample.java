package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		//try {
			OutputStream os = new FileOutputStream("/Users/yhee/Desktop/MAC");
			byte[] a = {10, 20, 30, 40, 50};
			os.write(a, 1, 3);
			
			os.flush();
			os.close();
			
		//} catch(IOExcetion e) {
		//	e.printStackTrace();
		//}
	}

}
