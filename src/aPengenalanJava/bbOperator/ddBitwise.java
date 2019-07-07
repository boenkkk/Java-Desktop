package aPengenalanJava.bbOperator;

public class ddBitwise {
	public static void main(String[] args){
		int x = 11;
		int y = 13;
		int za = x & y;
		System.out.println("& and : "+za);
//		1 0 1 1 => 8 + 0 + 2 + 1 = 11
//		1 1 0 1 => 8 + 4 + 0 + 1 = 13
//		1 0 0 1 => 8 + 0 + 0 + 1 = 9
		
		int zb = x | y;
		System.out.println("| or : "+zb);
//		1 0 1 1 => 8 + 0 + 2 + 1 = 11
//		1 1 0 1 => 8 + 4 + 0 + 1 = 13
//		1 1 1 1 => 8 + 4 + 2 + 1 = 15
		
		int zc = x ^ y;
		System.out.println("^ xor : "+zc);
//		1 0 1 1 => 8 + 0 + 2 + 1 = 11
//		1 1 0 1 => 8 + 4 + 0 + 1 = 13
//		0 1 1 0 => 0 + 4 + 2 + 0 = 6
		
		int zd = ~x;
		System.out.println("~ negasi : "+zd);
//		0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 1 = 11 'integer 32bit'
//		1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 0 = 'di negasikan'
//		1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 0 1 = '2s complement ditambah 1'
//		ribet
	}
}