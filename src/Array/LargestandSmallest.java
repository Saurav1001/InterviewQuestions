package Array;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {
		int number[]= {1,4,-12,88,39,9878};
		int largest=number[0];
		int smallest=number[0];
		for(int i=1;i<number.length;i++) {
			if(largest<number[i]) {
				largest=number[i];
			}else if(smallest>number[i]) {
				smallest=number[i];
			}
		}System.out.println("Given array is: "+ Arrays.toString(number));
		System.out.println("Larest number is: "+ largest);
		System.out.println("Smallest number is: "+ smallest);
		

	}

}
