package bJava5Update.ddGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class aaClassCastExceptions {
	
	public static void main(String[] args) {
		//Tidak menggunakan Generics
		Collection lists = new ArrayList();
		lists.add("A");
		lists.add(1); //error ClassCastException saat running
		Iterator itr = lists.iterator();
		while(itr.hasNext()) {
			String current = (String) itr.next();
			System.out.println(current);
		}
	}
	
}
