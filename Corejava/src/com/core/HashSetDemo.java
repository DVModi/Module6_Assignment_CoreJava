package com.core;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add(" Tops");
		hs.add('t');
		hs.add(true);
		hs.add(null);
		hs.add(10);
		hs.add(10);
		 System.out.println(hs);
		
		
	}

}
