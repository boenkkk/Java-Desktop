package aa;

public class aa {
	
	public static void main(String[] args){
		try {
			int aa = 10;
			int bb = 0;
			int cc;
			
			cc = aa/bb;
			System.out.println(cc);
		} catch (Throwable e) {
			System.out.print("ERROR BOS : ");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("PASTI DIJALANIN");
		}
	}
	
}