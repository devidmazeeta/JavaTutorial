public class ForLoop {
	public static void main(String[] args) {
		/* Syntax:

		for (statement 1; statement 2; statement 3) {
			// code block to be executed
		}
		*/

		// Print numbers from 0 to 4
		for (int number = 0; number < 5; number++) {
			System.out.println(number);
		}

		// System.out.println("For loop ended!" + number); // error: cannot find symbol

		// print numbers between 0 and 100 which are divisible by 3
		// Method 1:
		for (int number = 3; number <= 100; number+=3) {
			System.out.println("Number is: " + number);
		}
		
		// Method 2:
		for (int number = 1; number <= 100; number++) {
			if (number % 3 == 0) {
				System.out.println("Number 2 is: " + number);
			}
		}
	}
}
