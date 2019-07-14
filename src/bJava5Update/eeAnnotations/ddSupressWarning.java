package bJava5Update.eeAnnotations;

import java.util.ArrayList;

public class ddSupressWarning {
	
	/* If you remove the @SuppressWarnings("unchecked") annotation, 
	   it will show warning at compile time because we are using non-generic collection. */
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");

		for (Object obj : list)
			System.out.println(obj);

	}
	
}