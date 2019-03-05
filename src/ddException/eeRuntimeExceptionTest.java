package ddException;

public class eeRuntimeExceptionTest {
	public static void main(String[] args) {
		int i = 0;
		try {
			i = Integer.parseInt("abc");
			System.out.println("i : "+i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("kode setelah exception");
	}
}