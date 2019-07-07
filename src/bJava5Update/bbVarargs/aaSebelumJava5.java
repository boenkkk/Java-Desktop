package bJava5Update.bbVarargs;

public class aaSebelumJava5 {
	
	public static void printAll(String[] array) {
		for (String cur : array) {
			System.out.println(cur);
		}
	}
	
	public static void main(String[] args) {
		String[] arr = new String[1];
		arr[0] = "a";
		printAll(arr);
		//printAll("b","c"); error
	}
	
}