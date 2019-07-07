package aPengenalanJava.aa;

public class ffConstantss implements ffConstants{

	public static final String APPLICATION_NAME = "POS";
	
	public static void main(String[] args){
		// panggil ke constant di interface
		System.out.println("MAX USER : "+MAX_USER);
		
		// panggil ke constant di class
		System.out.println("APPLICATION NAME : "+APPLICATION_NAME);
	}
	
}