package com.livenodead.challenges;

import java.util.Scanner;

public class Day07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] arrOut = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			arrOut[n - i - 1] = arr[i];
		}
		for (int i = 0; i < arrOut.length; i++) {
			System.out.print(arrOut[i] + " ");
		}

		in.close();
	}
}
