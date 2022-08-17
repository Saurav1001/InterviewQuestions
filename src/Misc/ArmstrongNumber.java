package Misc;

public class ArmstrongNumber {

	public static void main(String[] args) {
		isArmstrong(1);
	}
	
	public static void isArmstrong(int n) {
		int r;
		int cube=0;
		int t=n;
		while(t>0) {
			r=t%10;
			t=t/10;
			cube=cube + (r*r*r);
		}if(cube==n) {
			System.out.println(n + " number is armstrong");
		}else {
			System.out.println(n + " number is not armstrong");
		}
	}
	
	}


