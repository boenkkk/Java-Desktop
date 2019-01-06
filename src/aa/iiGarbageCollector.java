package aa;

import java.util.Date;

public class iiGarbageCollector {
	public static void main(String[] args) {
		Date d = getDate();
		// lakukan sesuatu di sini
		System.out.println("DateTime : " +d);
		System.out.println("DateTime : " +getDate());
	}

	public static Date getDate() {
		StringBuffer buffer = new StringBuffer("garbage collectable");
		Date date = new Date();
		return date;
	}
}