package eeIteration;

public class bbWhile {
	public static void main(String[] args){
		System.out.println(System.currentTimeMillis());
		while (System.currentTimeMillis() % 3 !=0) {
			System.out.println("Waktu sekarang dibagi 3 masih bersisa.");
		}
	}
}