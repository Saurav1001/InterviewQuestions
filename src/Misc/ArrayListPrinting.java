package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListPrinting {

	public static void main(String[] args) {
		
//		List<String> al=new ArrayList<String>(Arrays.asList("A", "B","C", "D","E"));
//		 //using iterator
//		System.out.println("*******Using itreator**********");
//		Iterator<String> it=al.iterator();
//		while(it.hasNext()) {
//			String s=it.next();
//			System.out.println(s);
//		}
//		//using for each
//		System.out.println("********Using for each**************");
//		for(String alpha : al) {
//			System.out.println(alpha);
//		}
//		System.out.println("Duplicate number");
//		int ar[]= {1,2,3,4,5,1,4};
//		Set<Integer> s= new HashSet<Integer>();
//		for(Integer i : ar) {
//			if((s.add(i))==false) {
//				System.out.println(" Duplicate number: " + i);
//			}
//		}
//		for(int i=0;i<ar.length;i++) {
//			for(int j=i+1;j<ar.length;j++) {
//				if(ar[i]==ar[j]) {
//					System.out.println(ar[i] + " : is a duplicate number");
//				}
//			}
//		}
		isString("java Is the Best language java is the is java");
		}
	public static void isString(String userInput) {
		String a=userInput.toLowerCase();
		String s[]=a.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
	}

}
