package com.codewithdeepa;

public class SecondLargestNumber24 {
	public static int getSecondLargest(int[] a,int total)
	{
		int temp;
		int i,j;
		
		for(i=0;i<total;i++)
		{
			for(j=i+1;j<total;j++)
			{
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[]args) {
		int a[]= {1,4,9,6,2,5};
		int b[]= {44,99,22,67,47,39,55};
		System.out.println("Second Largest : "+getSecondLargest(a,6));

		System.out.println("Second Largest : "+getSecondLargest(b,7));
		}

}
