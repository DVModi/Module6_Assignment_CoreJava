package com.codewithdeepa;

public class AverageValueArray10 {
	public static void main(String[] args) {
		int [] numbers=new int[] {20,30,35,25,60};
		
		
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print("");
			sum=sum+numbers[i];
		}
		double average = sum/numbers.length;
		System.out.println("Average of Array Elements value is : "+average);
	}

}
