package Misc;

public class Factorial {

	public static void main(String[] args) {
		fact(4);
		System.out.println(factorial(3));
	}
	//without recursion
	public static void fact(int n) {
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact=fact*i;
					}System.out.println(fact);

	}//with recursion
	
	public static int factorial(int f) {
		if(f==0)
		return 1;
		else
		return (f * factorial(f-1));
		
	}

}
