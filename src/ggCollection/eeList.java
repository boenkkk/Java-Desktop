package ggCollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class eeList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("z");
		System.out.println("isi dari list : ");
		
		//1
		for(int i=0; i < list.size(); i++) {
			System.out.println("Print cara 1 : "+i+"-"+list.get(i) );
		}
		
		//2
		for(String s:list){
			System.out.println("Print cara 2 : "+s);
		}
		
		//3
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Print cara 3 : "+itr.next());
			
		}
		
		//sorting
		Collections.sort(list);//asc
		Collections.sort(list,Collections.reverseOrder());//desc
		for(String s:list){
			System.out.println("Soritng : "+s);
		}
	}

}
