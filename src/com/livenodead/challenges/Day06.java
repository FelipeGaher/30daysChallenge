package com.livenodead.challenges;

import java.util.Scanner;

public class Day06 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int nTestCases = scan.nextInt(); // tip percentage
		scan.nextLine();
		String text = "";

		for (int i = 0; i < nTestCases; i++) {
			String outEven = "";
			String outOdd = "";
			text = scan.nextLine();
			char[] myCharArray = text.toCharArray();
			for (int n = 0; n < myCharArray.length; n++) {
				if (n % 2 == 1) {
					outEven += myCharArray[n];
				} else {
					outOdd += myCharArray[n];
				}
			}
			System.out.println(outOdd + " " + outEven);
		}
		scan.close();
	}
}
