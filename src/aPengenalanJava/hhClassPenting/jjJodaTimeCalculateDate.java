package aPengenalanJava.hhClassPenting;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.joda.time.DateTime;

public class jjJodaTimeCalculateDate {
	
	public static void main(String[] args) {
		inJava();
		inJoda();
		calDate();
	}
	
	//case 1 : tambah 10Y20D
	public static void inJava() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
		
		c.set(2000,Calendar.JANUARY,1,0,0,0);
		System.out.println("Java date awal : " + format.format(c.getTime()));
		
		c.add(Calendar.DATE, 20); //tambah 20 hari
		c.add(Calendar.YEAR, 10); //tambah 10 tahun
		System.out.println("Java date akhir : " + format.format(c.getTime()));
	}
	
	public static void inJoda() {
		DateTime d = new DateTime(2000,1,1,0,0,0,0);
		System.out.println("Joda date awal : " + d.toString("dd MMM yyyy HH:mm:ss"));
		System.out.println("Joda date akhir : " + d.plusYears(10).plusDays(20).toString("dd MMM yyyy HH:mm:ss"));
	}
	
	//case 2 : tambah 1M45D
	public static void calDate() {
		DateTime d = new DateTime(2000,1,1,0,0,0,0);
		System.out.println("Calculate date awal : " + d.toString("dd MMM yyyy HH:mm:ss"));
		System.out.println("Calculate date akhir : " +
				d.plusMonths(1).plusDays(45).dayOfWeek().withMaximumValue().toString("dd MMM yyyy HH:mm:ss"));
		System.out.println("Calculate date akhir : " +
				d.plusMonths(1).plusDays(45).toString("dd MMM yyyy HH:mm:ss"));
	}
	
}