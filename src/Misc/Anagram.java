package Misc;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("ACT", "CA  tt  "));
		
	}
	
	public static boolean isAnagram(String a, String b) {
		String a1=a.replaceAll("\\s","");
		String a2=b.replaceAll("\\s","");
		System.out.println(a1.length());
		System.out.println(a2.length());
		if(a1.length()!=a2.length()) {
			return false;
		}else {
			char aa[]=a1.toLowerCase().toCharArray();
			char aaa[]=a2.toLowerCase().toCharArray();
			Arrays.sort(aa);
			Arrays.sort(aaa);
			return Arrays.equals(aa, aaa);
		}
		
	}

}
