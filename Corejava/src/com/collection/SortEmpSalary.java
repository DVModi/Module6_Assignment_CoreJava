package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortEmpSalary implements Comparator<Employee> {
	



public int compare(Employee e1, Employee e2) {
	int value=0;
	if(e1.getSalary()>e2.getSalary())
	{
		value=1;
	}

	else if(e1.getSalary()<e2.getSalary())
	{
		value=-1;
	}
	else if(e1.getSalary()==e2.getSalary())
	{
		value=0;
	}
	return value;
}
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	
	Employee e1=new Employee();
	e1.setEid(1);
	e1.setEname("Pradeep");
	e1.setSalary(20000);

	Employee e2=new Employee();
	e2.setEid(2);
	e2.setEname("Brijesh");
	e2.setSalary(25000);
	

	Employee e3=new Employee();
	e3.setEid(3);
	e3.setEname("Deepa");
	e3.setSalary(60000);
	

	Employee e4=new Employee();
	e4.setEid(4);
	e4.setEname("Vatsal");
	e4.setSalary(45000);
	

	Employee e5=new Employee();
	e5.setEid(5);
	e5.setEname("Dhaani");
	e5.setSalary(70000);
	
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	
	Collections.sort(list, new SortEmpSalary());
	for(Employee e:list)
	{
		System.out.println(" EID : "+e.getEid()+" Ename : "+e.getEname()+" Salary : "+e.getSalary());
	}
}
}
