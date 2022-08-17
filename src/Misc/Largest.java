package Misc;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
		int ar[]= {1,5,9,10,19,-12,0};
		int largest=ar[0];
		int smallest=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(largest > ar[i]) {
				largest=ar[i];
			}else if(smallest<ar[i]) {
				smallest=ar[i];
			}
		}System.out.println(Arrays.toString(ar));
		System.out.println(largest);
		System.out.println(smallest);
		
		

	}

}
