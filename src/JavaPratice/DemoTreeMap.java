package JavaPratice;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		//based on key it will sort and print
		//insertion oder is not following
		//compilor check only key only
		//in key homogenious only allowed
		
		TreeMap map=new TreeMap();
		map.put('w', "mno");
		map.put('d', "abc");
		map.put('g', 10);
		map.put('u', "anu");
		//map.put(10, "ddri");
		map.put('d', "erp");
		System.out.println(map);
		
		

	}

}
