package bJava5Update.aaEnhancedForLoop;

public class aaArray {

	public static void main(String[] args) {
		String[] arr = { "a", "b", "c" };
		
		//sebelum java 5
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.println("sebelum java 5 : " + arr[idx]);
		}
		
		//di java 5
		for (String current : arr) {
			System.out.println("java 5 : "+current);
		}
	}

}
