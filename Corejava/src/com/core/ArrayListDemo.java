package com.core;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo { 
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("tops");
		al.add('t');
		al.add(null);
		al.add(true);
		al.add(10);
		
			System.out.println(al);
			System.out.println(al.size());
			System.out.println(al.get(0));
			System.out.println(al.isEmpty());
			System.out.println(al.add(al));
			System.out.println(al.lastIndexOf(10));
			System.out.println("--------Iterator Demo--------");
			Iterator itr=al.iterator();
			while(itr.hasNext())
			{System.out.println(itr.next());
		}
			ListIterator litr=al.listIterator();
			while(litr.hasNext())
			{
				System.out.println(litr.next());
			}
}
}
