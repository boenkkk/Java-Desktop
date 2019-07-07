package aPengenalanJava.aa;

import java.util.Date;

public class iiiEksperimenGarbageCollector {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("jumlah memory awal : " + rt.totalMemory());
		System.out.println("jumlah memory max : " + rt.maxMemory());
		for (int i = 0; i < 1000000; i++) {
			Date d = new Date();
			d = null;
		}
		System.out.println("jumlah memory tersedia sebelum gc: " + rt.freeMemory());
		System.out.println("jumlah memory tersedia sebelum gc2: " + rt.freeMemory());
		System.gc();
		System.out.println("jumlah memory tersedia setelah gc: " + rt.freeMemory());
	}
}