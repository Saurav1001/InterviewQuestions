package Misc;

public class PalindromeNumber {

	public static void main(String[] args) {
		isPalindronNumber(151);
		isPalindromeString("naman");

	}
	
	public static void isPalindronNumber(int num) {
		int rev=0;
		int t;
		t=num;
		while(t>0) {		
			rev=rev*10 + t%10;
			t=t/10;
		}
		System.out.println(rev);
		if(rev==num) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("not palindrom");
		}
		
	
			
		}
	public static void isPalindromeString(String s) {
		String a="";
		
		for(int i=s.length()-1;i>=0;i--) {
			a=a + s.charAt(i);
		}System.out.println(a);
		if(a.equals(s)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("not palindrome");
		}

}
	}
