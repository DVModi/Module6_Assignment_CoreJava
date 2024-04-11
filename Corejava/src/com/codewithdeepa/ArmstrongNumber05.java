package com.codewithdeepa;

import java.util.Scanner;

public class armstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int number = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit * digit * digit;
			number /=10;
		}
		int originalNumber = number;
		if (sum == originalNumber) {
			System.out.println(originalNumber + "is an Armstrong number.");
			
		} else {
			System.out.println(originalNumber + "is not an Armstrong number.");
		}
		
	}

}
