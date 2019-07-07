package aPengenalanJava.ccFlowControl;

public class bbSwitchCase {
	public static void main(String[] args){
		int x = 5;
		switch(x){
		case 1 :
			System.out.println("satu");
			break;
		case 2 :
		System.out.println("dua fall-through");
			break;
		case 3 :
			System.out.println("tiga fall-through");
			break;
		case 4 :
			System.out.println("empat fall-through");
			break;
		default :
		System.out.println("diluar 1sd4 | default fall-through");
		}
	}
}