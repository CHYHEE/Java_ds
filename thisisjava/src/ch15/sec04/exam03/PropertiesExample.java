package ch15.sec04.exam03;

import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("driver");
		String username = properties.getProperty("driver");
		String password = properties.getProperty("driver");
		String admin = properties.getProperty("driver");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
		
		System.out.println("------------------------------------");
		ResourceBundle rb = ResourceBundle.getBundle("database");
		System.out.println("driver : " + rb.getString("driver"));
		System.out.println("url : " + rb.getString("url"));
		System.out.println("username : " + rb.getString("username"));
		System.out.println("password : " + rb.getString("password"));
		System.out.println("admin : " + rb.getString("admin"));
	}

}
