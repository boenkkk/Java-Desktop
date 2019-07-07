package aPengenalanJava.aa;

public class ddddConstructorCallConstructorTest {
	
	public void ddddConstructorCallConstructor(){
		//this("constructor memanggil constructor");
		//kode lain di sini, tidak bisa diletakkan di atas keyword this
	}

	public void ddddConstructorCallConstructor(String text) {
		methodSederhana(text);
	}

	public void methodSederhana(String text) {
		System.out.println("method sederhana dipanggil dengan text : " + text);
	}

	public static void main(String[] args){
		ddddConstructorCallConstructorTest test = new ddddConstructorCallConstructorTest();
		//ddddConstructorCallConstructorTest test1 = new ddddConstructorCallConstructorTest("ini test");
	}

}