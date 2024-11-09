public class DoWhileLoop {
	public static void main(String[] args) {
		/* Syntax:
		do {
			// code block to be executed
		}
		while (condition);
		*/

		// Method 1 - Execute the bock only once
		short number = 1;

		do {
			System.out.println("number is: " + number);
			number += 1; // number = number + 1;
		}
		while (number > 10); // false

		System.out.println("Do While loop 1 ended!");

		// Method 2 - Executes the block multiple times
		short number2 = 1;

		do {
			System.out.println("number is: " + number2);
			number2 += 1; // number2 = number2 + 1;
		}
		while (number2 < 11); // false

		System.out.println("Do While loop 2 ended!");
	}
}
