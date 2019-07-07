package aPengenalanJava.ggCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ffMap {
	
	public static void main(String[] args){
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "nol");
		map.put(1, "satu");//tidak diambil
		map.put(2, "dua");
		map.put(1, "satukedua");
		System.out.println("isi dari map : ");
		
		//1
		for (int i = 0; i < map.size(); i++) {
			System.out.println("Print cara 1 : "+map.get(i));
		}
		
		//2
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println("Print cara 2 : "+m.getKey()+"-"+m.getValue());
		}
		
		//3
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("Print cara 3 : "+entry.getKey()+"-"+entry.getValue());
		}
	}
	
}