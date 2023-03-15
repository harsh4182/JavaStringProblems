package integerProblem;

import java.util.Arrays;

public class SortArrayInAscendingAndDescendingOrder 
{
	public static void main(String[] args) 
	{
		int[] unsortedArray= {2,1,3,9,4,7,6,5,8,10,4,3,11};
		//Ascending Order
		for(int i=0;i<unsortedArray.length;i++) 
		{
			for(int j=i;j<unsortedArray.length;j++) 
			{
				if (unsortedArray[i]>unsortedArray[j]) 
				{
					int temp= unsortedArray[i];
					unsortedArray[i]=unsortedArray[j];
					
					unsortedArray[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(unsortedArray));		
		//Descending Order
		for(int i=0;i<unsortedArray.length;i++) 
		{
			for(int j=i;j<unsortedArray.length;j++) 
			{
				if (unsortedArray[i]<unsortedArray[j]) 
				{
					int temp= unsortedArray[i];
					unsortedArray[i]=unsortedArray[j];
					
					unsortedArray[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(unsortedArray));
	}

}
