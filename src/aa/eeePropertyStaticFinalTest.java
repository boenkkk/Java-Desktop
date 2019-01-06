package aa;

public class eeePropertyStaticFinalTest {

	public static /*final*/ String nilaiStatic;

	public static void main(String[] args) {
		eeePropertyStaticFinalTest.nilaiStatic = "nilai dari main";
		System.out.println(nilaiStatic);
		methodUbahPropertyStatic();
		System.out.println(nilaiStatic);
	}

	public static void methodUbahPropertyStatic() {
		eeePropertyStaticFinalTest.nilaiStatic = "nilai dari methodUbahPropertyStatic";
	}

}
