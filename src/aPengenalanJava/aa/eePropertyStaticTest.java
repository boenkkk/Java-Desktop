package aPengenalanJava.aa;

public class eePropertyStaticTest {

	public static String nilaiStatic;

	public static void main(String[] args) {
		// property static dipanggil menggunakan nama class
		eePropertyStaticTest.nilaiStatic = "nilai dari main";
		
		// property static juga bisa dipanggil tanpa nama class dari class yang sama
		System.out.println(nilaiStatic);
		
		// method main adalah method static, hanya bisa memanggil method static juga
		methodUbahPropertyStatic();

		// nilai property static berubah setelah method methodUbahPropertyStatic dipanggil
		System.out.println(nilaiStatic);
	}

	public static void methodUbahPropertyStatic() {
		eePropertyStaticTest.nilaiStatic = "nilai dari methodUbahPropertyStatic";
	}

}
