package com.week2.homework1;

import java.util.Scanner;

public class Task9 {

	/*
	 * Prints a triangle with equal sides
	 * for the given value n of a side.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		// Each row gets two extra stars
		// It starts from 1, then 3, 5, 7, etc.
		for (int i = 1; i <= n; i += 2) {
			for (int j = 0; j < (n - i) / 2; j++) {
				System.out.print(" "); // Print (n - i) / 2 spaces
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*"); // Print i spaces
			}
			
			System.out.println();
		}
	}

}
