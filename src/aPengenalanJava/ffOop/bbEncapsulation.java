package aPengenalanJava.ffOop;

public class bbEncapsulation {
	public static void main(String args[]) {
		aaEncapsulation encap = new aaEncapsulation();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");

		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
		//get set variable
	}
}