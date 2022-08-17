package Misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapToArrayList {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(200, "A");
		map.put(300, "B");
		map.put(400, "C");
		map.put(500, "D");
		
		List<Integer> a1=new ArrayList<Integer>(map.keySet());
		for(Integer i :a1) {
			System.out.println(i);
		}
		List<String> a2=new ArrayList<String>(map.values());
		Iterator<String> it=a2.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}

	}

}
