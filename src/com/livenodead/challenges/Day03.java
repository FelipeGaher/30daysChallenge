package com.livenodead.challenges;

import java.util.Scanner;

public class Day03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n >= 1 && n <= 100) {
			if (n % 2 == 1) {
				ans = "Weird";
			} else {
				// Complete the code
				if ((n >= 2 && n <= 5) || n > 20) {
					ans = "Not Weird";
				}else {
					ans = "Weird";
				}
			}
		}
		System.out.println(ans);
	}

}
