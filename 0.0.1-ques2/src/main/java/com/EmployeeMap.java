package com;
import java.util.HashMap;
import java.util.Map;
public class EmployeeMap {
	public static String show() {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"Anam");
		map.put(2,"Tina");
		map.put(3,"Pinky");
		map.put(4,"Tom");
		map.put(5,"Jerry");
		map.put(1,"Tamboli");
		//System.out.println(map.get(1));
		return map.get(1);
	}

}
