package aa;

public class cc {
	
	public static void main(String[] args) {
		//static method memanggil static method lain dalam class yang sama
		contohMethodStatic();
		contohMethodStatic1();
		//method static juga bisa dipanggil dari nama classnya
		cc.contohMethodStatic();
		cc.contohMethodStatic1();
	}
	
	public static void contohMethodStatic() {
		System.out.println("method static dipanggil");
	}
	
	public static String contohMethodStatic1() {
		String aa = "Tidak Muncul"; 
		return aa;
	}
	
}