package hhClassPenting;

public class aaImmutableString {
	
	public static void main(String[] args) {
		//String tidak dapat diubah (immortal)
		String s1 = "Budi";
		//concat() method appends the string at the end
		s1.concat(" Santoso");
		//will print Sachin because strings are immutable objects
		System.out.println("s1 : "+s1);
		
		//Tidak Immutable
		String s2 = "Sifah";
		s2 = s2.concat(" Fauziah");
		System.out.println("s2 : "+s2);
		
		//Tidak Immutable
		String s3 = "Batty";
		s3 = s3 + " Haryati";
		System.out.println("s3 : "+s3);
		
		//Immutable
		String s4 = new String();
		s4 = "Nur";
		s4.concat(" Yanto");
		System.out.println("s4 : "+s4);
		
		String s5 = new String();
		s5 = "Ibu";
		s5 += " Bapak";
		System.out.println("s5a : "+s5);
		s5.concat(" Kakak");
		System.out.println("s5b : "+s5);
	}
	
}