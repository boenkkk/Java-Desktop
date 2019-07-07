package aPengenalanJava.ddException;

public class ccExceptionPertamaTest {
	public static void main(String[] args){
		try {
			System.out.println("Eksekusi Exception Pertama");
			throw new bbExceptionPertama("Pesan Exception Pertama");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
