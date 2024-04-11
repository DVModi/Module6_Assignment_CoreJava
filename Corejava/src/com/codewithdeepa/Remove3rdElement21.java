package com.codewithdeepa;

import java.util.ArrayList;

public class Remove3rdElement21 { public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<String>(5);
	arr.add("Mogra");
	arr.add("Water Lily");
	arr.add("Rose");
	arr.add("Marigold");
	System.out.println("The List of the size is : "+arr.size());
	for(String name : arr) {
		System.out.println("Flowers name is : "+name);
	}
	arr.remove("Rose");
	System.out.println("After removing element Array List is : "+arr.size());
	for(String name : arr) {
		System.out.println("Name is : "+name);
	}
	
}

}
