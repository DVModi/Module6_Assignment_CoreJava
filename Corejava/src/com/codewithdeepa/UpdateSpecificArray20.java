package com.codewithdeepa;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateSpecificArray20 {
	public static void main(String[] args) {
	Integer arr[] = {1,2,3,4,5};
		
		System.out.println("Original Array : "+Arrays.toString(arr));
		
		ArrayList<Integer>arraylist = new ArrayList<Integer>(Arrays.asList(arr));
		arraylist.add(6);
		arr = arraylist.toArray(arr);
		System.out.println("New Updated Array : "+Arrays.toString(arr));
	}
	}


