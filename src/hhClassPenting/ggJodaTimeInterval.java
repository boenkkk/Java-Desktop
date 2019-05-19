package hhClassPenting;

import org.joda.time.DateTime;
import org.joda.time.Interval;

public class ggJodaTimeInterval {

	public static void main(String[] args) {
		DateTime now = new DateTime();
		DateTime next = now.plusYears(1).plusMonths(1);
		Interval interval = new Interval(now, next);
		
		System.out.println("interval : " + interval);
		System.out.println("start : " + interval.getStart());
		System.out.println("end : " + interval.getEnd());
		System.out.println("duration : " + interval.toDuration());
		System.out.println("peroid : " + interval.toPeriod());
		
		//merubah nilai end interval dengan menambahkan satu jam
		interval.withEnd(interval.getEnd().plusHours(1));
	}
	
}
