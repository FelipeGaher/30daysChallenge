package com.livenodead.challenges;

import java.util.Scanner;
/**
 * Day to Hacker Rank
 * @author Felipe
 *
 */
public class Day2 {

    private static final int ONE_HUNDRED_NUM = 100;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		double aux = 0;

		// Write your calculation code here.
		aux = mealCost + (mealCost * tipPercent / ONE_HUNDRED_NUM) + (mealCost * taxPercent / ONE_HUNDRED_NUM);
		// cast the result of the rounding operation to an int and save it as totalCost
		int totalCost = (int) Math.round(aux);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

}
