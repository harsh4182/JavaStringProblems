package integerProblem;

import java.util.Arrays;

public class LargestAndSmallestIntegerInAnArray {

	public static void main(String[] args) {
		int a[]= {6,5,7,99,34,78,109,54,11,2,189};
		int largest=a[0];
		int smallest=a[0];
		for(int i:a) {
			if (i>largest)
				largest = i;
			else if(i<smallest) {
				smallest = i;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Largest number is : "+ largest);
		System.out.println("Smallest number is : "+ smallest);
	}
}
