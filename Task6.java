package com.week2.homework1;

import java.util.Scanner;

public class Task6 {

	/*
	 * For a given number and also number n
	 * it prints the n-th digit of the given number.	
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int n = input.nextInt();
		input.close();
		
		// Keep removing digits until enough are removed
		for (int i = 1; i < n; i++) {
			number /= 10;
		}
		
		System.out.println("The digit is " + (number % 10));
	}

}
