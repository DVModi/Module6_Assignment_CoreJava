package com.codewithdeepa;

public class CopyArray22 {
	public static void main(String[] args) {
		int arr1[]=new int[] {1,2,3,4,5};
		int arr2[]=new int[arr1.length];
		int i;
		for(i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Array Elements are : ");
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + "");
		}
		System.out.println();
		System.out.println("Elements of Array Copied : ");
		for(i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + "");
		}
		
	}

}
