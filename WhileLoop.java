public class WhileLoop {
	public static void main(String[] args) {
		/* Syntax:
		while (condition) {
			// code block to be executed
		}
		*/

		short number = 1;

		while (number < 11) {
			System.out.println("number is: " + number);
			number += 1; // number = number + 1;
		}

		System.out.println("While loop ended!");

	}
}
