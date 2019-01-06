package aa;

public class ggPassByValue {
	public static void ubahNama(String nama) {
		nama = "dian";
		System.out.println("nama baru di dalam method: " + nama);
	}

	public static void main(String[] arg) {
		String nama = "ifnu";
		System.out.println("nama lama dari method main: " + nama);
		ubahNama(nama);
		System.out.println("nama lama dari method main: " + nama);
	}
}