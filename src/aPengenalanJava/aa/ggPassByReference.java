package aPengenalanJava.aa;

public class ggPassByReference{
	public static void ubahNama(String[] nama){
		nama[0] = "dian";
		System.out.println("nama baru di dalam method: " + nama[0]);
		}
		public static void main(String[] arg){
		String[] nama = new String[1];
		nama[0] = "ifnu";
		System.out.println("nilai lama dari method main: " + nama[0]);
		ubahNama(nama);
		System.out.println("nilai lama dari method main: " + nama[0]);
	}
}