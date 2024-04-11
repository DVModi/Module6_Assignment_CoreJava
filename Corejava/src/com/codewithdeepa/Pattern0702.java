package com.codewithdeepa;

public class Pattern0702 {
	public static void main(String[] args) {
		int i,number;
		for(i=1;i<=5;i++) {
			if(i%2==0) {
				number = 0;
				System.out.print(number);
			} else {
				number = 1;
				System.out.print(number);
			}
			for(int j=1;j<5;j++) {
				if(number==1) {
					number = 0;
					
					
				}else {
					number =1;
				}
				System.out.println();
			}
			
		}
			
	}
}
