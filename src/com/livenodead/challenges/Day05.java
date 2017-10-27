package com.livenodead.challenges;

public class Day05 {

	public static void main(String[] args) {

	}

}

class Person {
	private int age;

	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge > 0) {
			this.age = initialAge;
		} else {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:
		String output = "You are old.";

		if (this.age < 13) {
			output = "You are young.";
		} else if (this.age >= 13 && this.age < 18) {
			output = "You are a teenager.";
		}
		System.out.println(output);
	}

	public void yearPasses() {
		this.age = this.age + 1;
		// Increment this person's age.
	}

}
