package hhClassPenting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;

public class ccDate {
	
	private static final DateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E yyyy/MM/dd HH:mm:ss");
	
	public static void main(String[] args) {
		//Use java.util.ate
		Date date = new Date();
        System.out.println(sdf.format(date));
		
		//Use java.util.calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        //User java.time.LocalDateTime;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        //User java.time.LocalDate;
        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
	}
	
}
