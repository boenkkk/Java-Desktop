package bJava5Update.aaEnhancedForLoop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ccMap {

	public static void main(String[] args) {
		//sebelum java 5
		Map maps = new HashMap();
		maps.put("Rp", "IDR");
		maps.put("$", "USD");
		Iterator itr = maps.keySet().iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println("sebelum java 5 - Key|Value : " +key+"|"+maps.get(key));
		}
		
		//di java 5
		Map<String, String> mapss = new HashMap<String, String>();
		mapss.put("Rp", "IDR");
		mapss.put("$", "USD");
		for (String key : mapss.keySet()) {
			System.out.println("java 5 - Key|Value : " +key+"|"+maps.get(key));
		}
	}
	
}
