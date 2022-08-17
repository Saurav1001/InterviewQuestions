package Misc;



public class DailyPractise {
	static int p;
	String s;
	static char c;
	static Object o;
	static long l;
	static double dd;
	boolean b;
	public static void main(String[] args) {
		//isArmstrong(111);
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch +" : "+(int)ch);
		}
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(p);
		DailyPractise d=new DailyPractise();
		System.out.println(d.s);
		System.out.println(c);
		System.out.println(o);
		System.out.println(l);
		System.out.println(dd);
		System.out.println(d.b);
		
		
	}
	
//	public static void isArmstrong(int num) {
//		int temp=num;
//		int rem=0;
//		while(temp!=0) {
//			rem=rem*10 +temp%10;
//			temp=temp/10;
//		}if(num==rem) {
//			System.out.println(num + " : number is armstrong");
//		}else {
//			System.out.println(num + " : number is not armstrong");
//		}
//		
//	}
	
}