package bbOperator;

public class ffLogical {
	public static void main(String[] args){
//				A && B	A || B	A ^ B	!A
//		0	0	0		0		0		1
//		0	1	0		1		1		1
//		1	0	0		1		1		0
//		1	1	1		1		0		0
		int x = 10;
		int y = 11;
		boolean za = (x<=10) && (y<=10);
		System.out.println("& : "+za);
		// 1 && 0 = 0
		
		boolean zb = (x<=10) || (y<=10);
		System.out.println("|| : "+zb);
		// 1 || 0 = 1
		
		boolean zc = (x<=10) ^ (y<=10);
		System.out.println("^ : "+zc);
		// 1 ^ 0 = 1
		
		boolean zd = !(x<=10) && (y<=10);
		System.out.println("! : "+zd);
		// 0 ! 0 = 0
	}
}
