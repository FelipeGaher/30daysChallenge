package com.livenodead.challenges;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (n >= 2 && n <= 20) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " x " + i + " = " + (n * i));
			}
		}
		in.close();
	}

}
