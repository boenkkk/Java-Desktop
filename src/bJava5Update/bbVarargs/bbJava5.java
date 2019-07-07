package bJava5Update.bbVarargs;

public class bbJava5 {
	
	public static void printAll(String... array) {
		for (String cur : array) {
			System.out.println(cur);
		}
	}
	
	public static void main(String[] args) {
		printAll("a");
		printAll("b","c");
	}

}