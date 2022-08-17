package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String name[]= {"java","javaScript", "python","c","c++","java"};
		//1; solution by comparing and time complexity is O(n^2) - it is the worst solution
		
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println("duplicate element is: "+ name[i]);
				}
			}
		}//2. Using hash set time complexity is O(n). this is good approach
		Set<String> s=new HashSet<String>();
		for(String names : name) {
			if((s.add(names))==false) {
				System.out.println("duplicate element is: "+ names);
			}
		}

	}

}
