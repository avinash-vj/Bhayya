package JavaPratice;

import java.util.HashMap;

public class DemoMap {

	public static void main(String[] args) {
		//inserion oder not maintain,oder depend on key
		//duplication is allowed,bt key should be different
		//hetterogenius is possible,but if
		//duplicate values are allowed,key not allowed
		HashMap map=new HashMap<Integer,String>();
		map.put(10, "deepa");
		map.put(50, "sandeepa");
		map.put(null, null);
		//map.put(null, "vijay");
		map.put(120, "avinash");
		map.put(101, "anusha");
		map.put(90, "sunitha");
		map.put(90, "sun");
		map.put(909,10 );
		map.put("add", "sunitha");
		System.out.println(map);
		
		

	}

}
