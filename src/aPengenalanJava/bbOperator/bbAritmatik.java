package aPengenalanJava.bbOperator;

public class bbAritmatik {
	public static void main(String args[]){
		int x = 10;
		x = x + 1; //bentuk paling panjang
		x += 1; //menggunakan operator gabungan +=
		x++; //menggunakan operator increment
		System.out.println("x = "+x); //13
		
		int y = 10;
		y = y - 1; //bentuk paling panjang
		y -= 1; //menggunakan operator gabungan -=
		y--; //menggunakan operator decrement
		System.out.println("y = "+y); //7
		
		int a = 10;
		a *= 2;
		System.out.println("a = "+a);
	}
}