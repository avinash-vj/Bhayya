package collections.Programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class DemoTree {

	public static void main(String[] args) {
		
		//insertion oder not there
		//print result in assending
		//if both string and null is there so that time only classCastExceptions
		//dupli not allowd
		//if we try to add heterogenius in treeclass cast exception will come only in rum time only,
		//null not allow ,so classCastException
		TreeSet set=new TreeSet<>();
		set.add(120);
		set.add(220);
		set.add(80);
		set.add(20);
		set.add(210);
		
		try
		{
			set.add("dri");
			//set.add(null);
			
		}
		catch(Exception e)
		{
			set.add(50);
		}

		set.add(500);
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		
				

	}

}
