package bJava5Update.ddGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class aaClassCastExceptionsJava5 {
	
	public static void main(String[] args) {
		//Menggunakan Generics
		Collection<String> lists = new ArrayList<String>();
		lists.add("A");
		//lists.add(1); //langsung error karena yg dimasukkan bukan String
		Iterator<String> itr = lists.iterator();
		while(itr.hasNext()) {
			String current = (String) itr.next();
			System.out.println(current);
		}
	}
	
}
