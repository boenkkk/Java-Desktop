package aPengenalanJava.aa;

public class dddConstructorNonDefaultTest {
	
	public dddConstructorNonDefaultTest(String text) {
		methodSederhana(text);
	}

	public void methodSederhana(String text) {
		System.out.println("method sederhana dipanggil dengan text : " + text);
	}

	public static void main(String[] args) {
		// error pada waktu compile karena ada constructor yang dideklarasikan
		// sehingga default constructor menjadi wajib dideklarasikan
		//dddConstructorNonDefaultTest test = new dddConstructorNonDefaultTest();
		// constructor non default dengan satu parameter bertipe string
		dddConstructorNonDefaultTest test1 = new dddConstructorNonDefaultTest("ini test");
	}
}