package hhClassPenting;

import org.joda.time.Instant;

public class ddJodaTimeInstant {
	
	public static void main(String[] args) {
		Instant instant = new Instant(1000); // 1 detik setelah 1970
		//ingat bahwa instant mutable sehingga perlu diset lagi setelah
		//diubah nilainya
		instant = instant.plus(100); //ditambah 100 milidetik
		instant = instant.plus(60000); //ditambah 1menit
		instant = instant.plus(3600000); //ditambah 1jam
		System.out.println(instant);
	}
	
}