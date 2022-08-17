package String;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num=12345;
		int rev=0;
//		StringBuffer s=new StringBuffer(num);
//		StringBuffer s1=s.reverse();
//		System.out.println(s1);
		
		while(num !=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}System.out.println(rev);

	}

}
