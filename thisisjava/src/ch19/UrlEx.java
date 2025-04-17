package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEx {

	public static void main(String[] args) {
		/*
		 * 웹상의 주소(URL)로 요청 후 응답받은 데이터(html, json, text...)를 입력받아, 콘솔에 출력
		 */
		URL url = null;	//위에 먼저 선언하는 습관
		BufferedReader br = null;
		
		try {
			url = new URL("https://www.work24.go.kr/cm/main.do");
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String readLine = "";
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
			}
			
			String text = "안녕하세요";
			String text2 = URLEncoder.encode(text, "UTF-8");	//용도에 맞게(암호화)
			System.out.println(text2);
			String text3 = URLDecoder.decode(text2, "UTF-8");	//원래로 돌아가려면(복호화)
			System.out.println(text3);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

}
