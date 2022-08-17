package Misc;

public class PrimeNumber {

	public static void main(String[] args) {
		//int count=0;
//		int num=9;
//		
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				
//				count++;
//			}
//			}
//		if(count>0) {
//				System.out.println("number is prime");	
//		}else {
//			System.out.println("number is prime");
//		}
	//2. type	
//		for(int i=2;i<=20;i++) {
//			int count=0;
//			for(int j=2;j<i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}if(count==0) {
//				System.out.println(i + " : is prime");}
//			}
		
		System.out.println(isPrimeNum(4));
		primeNumber(20);
		
	}
	
	public static boolean isPrimeNum(int num) {
		if(num<1) {
			return false;
		}for(int i=2;i<num;i++) {
			if(num %i==0) {
				return false;
			}
			}
		
		return true;
			
	}
	public static void primeNumber(int number) {
		for(int j=2;j<=number;j++) {
			if(isPrimeNum(j)) {
				System.out.print(j + " ");
			}
		}
	}
}


