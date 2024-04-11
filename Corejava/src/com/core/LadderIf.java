package com.core;

import java.util.Scanner;

public class LadderIf{public static void main (String []args) {
int rollno,s1,s2,s3,total;
double per;
String sname;
Scanner sc=new Scanner(System.in);

System.out.println("Student name : ");
sname=sc.next();
System.out.println("Roll no : ");
rollno=sc.nextInt();
System.out.println("Marks of s1 : ");
s1=sc.nextInt();
System.out.println("Marks of s2 : ");
s2=sc.nextInt();
System.out.println("Marks of s3 : ");
s3=sc.nextInt();

total=s1+s2+s3;
per=total/3;

System.out.println("Student name : "+sname);
System.out.println("Roll no : "+rollno);
System.out.println("Total marks of subject: "+total);
System.out.println("Percentage : "+per);
if (per>=70)
{
	System.out.println("Distinction");
}
else if (per>=60)
{
	System.out.println("First class");
}
else if (per>=50)
{
	System.out.println("Second Class");
	}
else if (per>=40)
{
	System.out.println("Pass Class");
}
else 
{System.out.println("Fail class");
}
}
}




