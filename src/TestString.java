import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestString {
	
	public static void main(String[] args){
		
		//aaa
		String var1 = null;
		String var2 = null;
		ArrayList<String> list = new ArrayList<String>();

		//1
		/*String[] var1a = new String[]{"Select 1 dual","Select 2 dual"};
		list.addAll(Arrays.asList(var1a));
		//System.out.println("#"+list);
		
		// print cara 1
		for(String var3 : list){
			var2 = String.join(" union ", var1a);
			var2 = var2.substring(0, var2.lastIndexOf("dual"))+"dual;";
			//System.out.println("1a-"+var2);//dobel
		}
		System.out.println("1b-"+var2);//ga dobel*/		
		
		//2
		int a = 3; 
		for (int b = 0; b < a; b++) {
			var1 = "Select "+b+" dual";
			String[] varArr = new String[]{var1};
			list.addAll(Arrays.asList(varArr));
			//System.out.println("#"+list);
		}
		//System.out.println("#"+list);
		for(String var3 : list){
			var2 = String.join(" onion ", list);
			var2 = var2.substring(0, var2.lastIndexOf("dual"))+"dual;";
			//System.out.println("1a-"+var2);
		}
		System.out.println("1b-"+var2);
		
		List<Integer> source = Arrays.asList(1,2,3);
		List<Integer> dest = Arrays.asList(4,5,6);
		Collections.copy(dest, source);
		System.out.println(source);
		System.out.println(dest);
		System.out.println("END");
		
		//bbb
		for (int i = 0; i <= 5;) {
			System.out.println(i++);
		}
	}
	
}