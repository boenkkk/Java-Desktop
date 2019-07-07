package bJava5Update.aaEnhancedForLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bbList {
	
	public static void main(String[] args) {
		//sebelum java 5
		List lists = new ArrayList();
		lists.add("a");
		lists.add("b");
		lists.add("c");
		Iterator itr = lists.iterator();
		while (itr.hasNext()) {
			String current = (String) itr.next();
			System.out.println("sebelum java 5: "+current);
		}
		
		//di java 5
		List<String> listss = new ArrayList<String>();
		listss.add("a");
		listss.add("b");
		listss.add("c");
		for (String current : listss) {
			System.out.println("java 5 : "+current);
		}
	}
	
}