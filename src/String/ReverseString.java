package String;

public class ReverseString {

	public static void main(String[] args) {
		String name="SAURAV";
		int len=name.length();
		String s="";
		for(int i=len-1;i>=0;i--) {
			s= s+name.charAt(i);
		}System.out.println(s);
		
		StringBuffer sb=new StringBuffer(name);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		

	}

}
