package aPengenalanJava.eeIteration;

public class ccDoWhile {
	public static void main(String[] args){
		System.out.println(System.currentTimeMillis());
		do{
			System.out.println("Waktu sekarang dibagi 3 masih bersisa.");
		}while (System.currentTimeMillis() % 3 !=0);
	}
}