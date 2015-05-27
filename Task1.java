package com.week2.homework1;

import java.util.Scanner;

public class Task1 {

	/*
	 * Prints a rectangle with given values of its sides.
	 * Assume height > 1 and width > 2.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt(); // Input the height
		int width = input.nextInt();  // Input the width
		
		for (int i = 0; i < height; i++) {
			char c1 = '|';
			char c2 = ' ';

			// If it is an edge tile use '+' and '-'
			if (i == 0 || i == height - 1) {
				c1 = '+';
				c2 = '-';
			}
			
			System.out.print(c1);
			for (int j = 1; j < width - 1; j++) {
				System.out.print(c2);
			}
			System.out.println(c1);
		}
		
		input.close();
	}

}
