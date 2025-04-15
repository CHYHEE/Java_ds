package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{
		//try {
			OutputStream os = new FileOutputStream("/Users/yhee/Desktop/MAC");
			byte a = 10;
			byte b = 10;
			byte c = 10;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
			
		//} catch(IOExcetion e) {
		//	e.printStackTrace();
		//}
	}

}
