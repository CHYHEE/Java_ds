package ch12;

import java.text.DecimalFormat;

public class DateEx {

	public static void main(String[] args) {
		double a = 123456789.12;
		DecimalFormat df = new DecimalFormat("#, ###.####");
		System.out.println(df.format(a));

	}

}
