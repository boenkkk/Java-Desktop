package aPengenalanJava.ddException;

public class aaStackTraceRootCause {
	public void methodPertama() {
		System.out.println("method pertama dipanggil");
		methodKedua();
	}

	public void methodKedua() {
		System.out.println("method kedua dipanggil");
		methodKetiga();
	}

	public void methodKetiga() {
		System.out.println("method ketiga dipanggil");
		methodKeempat();
	}

	public void methodKeempat() {
		try {
			System.out.println("method keempat dipanggil");
			methodKelima();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void methodKelima() {
		System.out.println("method kelima dipanggil");
		String abc = null;
		abc.toString(); // kode ini akan menyebabkan NullPointerException
	}

	public static void main(String[] args) {
		aaStackTraceRootCause strc = new aaStackTraceRootCause();
		strc.methodPertama();
		System.out.println("kode ini tidak akan dieksekusi " + "karena program sudah keluar "
				+ "ketika exception di methodKelima tidak ditangkap");//sudah dihandle dibaris 23 kalo commentnya dilepas
	}
}