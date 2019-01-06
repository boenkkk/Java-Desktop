package aa;

public class bb {
	public static void main(String[] args){
		String data1 = "a" + "b";
		data1 = data1 + "c";
		String data2 = "abc";
		
		System.out.println("IF 1 : ");
		if (data1==data2) {
			System.out.println("sama");
		}
		else {
			System.out.println("beda");
		}
		
		System.out.println("IF 2 : ");
		if (data1.equals(data2)) {
			System.out.println("sama");
		}
		else {
			System.out.println("beda");
		}
	}
}
