package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Swaping {

	public static void main(String[] args) {
		//Map<Integer, String> map=new HashMap<Integer, String>();
//		map.put(1, "A");
//		map.put(2, "B");
//		map.put(3, "C");
//		
//		Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
//		while(it.hasNext()) {
//			Entry e=it.next();
//			System.out.println("Key is: "+e.getKey());
//			System.out.println("Value is: "+e.getValue());
//		}
		
//		List<Integer> li=new ArrayList<Integer>();
//		
//		li.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
//		System.out.println(li);
//		for(int i=0;i<li.size();i++) {
//			int j=li.get(i);
//			System.out.println(j);
//		}
//			map.keySet().addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
//			map.values().addAll(Arrays.asList(new String[]{"Saurav","Q","W","E","T"}));
//			
//			Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
//			while(it.hasNext()) {
//				Entry<Integer, String> e=it.next();
//				Integer a=e.getKey();
//				String b=e.getValue();
//				System.out.println("key is :"+ a);
//				System.out.println("value is: "+ b);
//				
//			}
		
		
		int a=10;
		int b=12;
		a=a+b;//22
		b=a-b;//22-12=10
		a=a-b;
		System.out.println(a +" =" +b);
		System.out.println('A'+'B');
		
		char c='A';
		int d=(int)c;
		System.out.println(d);
		
		}

	}


