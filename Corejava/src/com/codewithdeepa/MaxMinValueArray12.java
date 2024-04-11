package com.codewithdeepa;

import java.util.Arrays;

public class MaxMinValueArray12 {
	public static void main(String[] args) {
		int[]myArray= {28,56,92,35,75};
		int max = Arrays.stream(myArray).max().getAsInt();
		int min = Arrays.stream(myArray).min().getAsInt();
		System.out.println("Maximum Value in the Array is : "+max);
		System.out.println("Minimum Value in the Array is : "+min);
	}

}
