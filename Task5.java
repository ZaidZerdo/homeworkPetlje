package com.week2.homework1;

import java.util.Scanner;

public class Task5 {

	/*
	 * For a given number n it prints n without zeroes.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		input.close();
		
		long newNumber = 0;
		long multiplier = 1;
		// Keep getting the last digit of n until n becomes zero
		// The multiplier increases if the last digit is not zero
		while (n != 0) {
			newNumber += (n % 10) * multiplier;
			multiplier *= (n % 10 == 0)? 1: 10; // If the digit is zero than don't increase
			n /= 10;
		}
		
		System.out.println("The new number is " + newNumber);
	}

}
