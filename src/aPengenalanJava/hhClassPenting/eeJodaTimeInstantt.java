package aPengenalanJava.hhClassPenting;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class eeJodaTimeInstantt {
	
	public static void main(String[] args) {
		DateTime dateTime = new DateTime(); //waktu sekarang
		
		int date = dateTime.getDayOfMonth();
		int month = dateTime.getMonthOfYear(); //dimulai dari 1 hingga 12
		int year = dateTime.getYear();
		
		DateTime plusMonth = dateTime.plusMonths(2);
		DateTime plusMinutes = dateTime.plusMinutes(2);
		Date d = plusMonth.toDate(); //mengubah DateTime ke Date
		Calendar c = plusMonth.toGregorianCalendar(); //mengubah DateTime ke Calendar
		
		System.out.println(dateTime);
		System.out.println(dateTime.toDate());
	}

}
