package ffOop;

public class ccInheritanceA {
	public static void main(String[] args){
		ccInheritanceA test = new ccInheritanceA();
		if (test instanceof Object) {
			System.out.println("Tipenya object");
		} else {
			System.out.println("Tipenya bukan object");
		}
		// inheritance bisa pake "new" dan "extends"
	}
}
