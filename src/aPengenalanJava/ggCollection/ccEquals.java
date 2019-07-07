package aPengenalanJava.ggCollection;

public class ccEquals {
	
	public static void main(String[] args){
		String abc = new String("abc");
		String abc1 = new String("abc");
		
		boolean equalsOperator = (abc == abc1);
		System.out.println("abc == abc1 : "+equalsOperator);
		
		boolean equalsMethod = abc.equals(abc1);
		System.out.println("abc.equals(abc1) : "+equalsMethod);
	}
	
}