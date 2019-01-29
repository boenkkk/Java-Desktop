package bbOperator;

public class eeBitshift {
	public static void main(String[] args){
		int x = 11;
		int za = x >> 2;
		System.out.println(za);
//		1 0 1 1 => 8 + 0 + 2 + 1 = 11
//		0 0 1 0 => 0 + 0 + 2 + 0 = 2 ('geser 2 ke >> 2 langkah')
		
		int zb = x << 2;
		System.out.println(zb);
//		1 0 1 1 => 8 + 0 + 2 + 1 = 11
//		1 0 1 1 0 0 => 32 + 0 + 8 + 4 + 0 + 0 = 44 ('geser 2 ke << 2 langkah')
	}
}
