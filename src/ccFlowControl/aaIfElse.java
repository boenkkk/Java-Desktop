package ccFlowControl;

public class aaIfElse {
	public static void main(String[] args){
		int nilai = 78;
		if(nilai < 40 ) {
		System.out.println("nilai < 40 = D");
		} else if (nilai >= 40 && nilai < 60) {
		System.out.println("nilai >= 40 && nilai < 60 = C");
		} else if (nilai >= 60 && nilai < 70) {
		System.out.println("nilai >= 60 && nilai < 80 = B");
		} else if (nilai >= 80 && nilai < 100) {
		System.out.println("nilai >= 80 && nilai <=100 = A");
		} else {
		System.out.println("range nilai harus antara 0 - 100"); // hasilnya disini
		}
	}
}
