package bJava5Update.ffDebugging;

public class aa {
	
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < 100; i++) {
			if (i%5 == 0) {
				total += i;
				//System.out.println(total);
			}
		}
		System.out.println(total);
	}

}
