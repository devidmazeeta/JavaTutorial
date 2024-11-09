public class ConditionalStatements {
	public static void main(String[] args) {
		// When condition passes - if
		int number1 = 10;
		
		if (number1 > 5) { // true
			System.out.println("If 1");
		}

		// When condition fails
		int number2 = 4;

		if (number2 > 5) { // false
			System.out.println("If 2"); // this line doesn't execute
		}

		// When condition passes & fails - if, else
		if (number2 > 5) { // false
			System.out.println("If 3"); // this line doesn't execute
		}
		else {
			System.out.println("Else 1");
		}

		if (number2 < 5) { // true
			System.out.println("If 4");
		}
		else {
			System.out.println("Else 2"); // this line doesn't execute
		}
			
		boolean flag = true;
			
		if (flag) {
			System.out.println("If 5");
		}

		String name = "Ednue";

		if (name.length() == 5) { // true
			System.out.println("Length matches");
		}
		else {
			System.out.println("Length doesn't match");
		}

		// With multiple conditions - if, else if, else
		int count = 30;

		if (count % 4 == 0) { // false
			System.out.println("30 is divisible by 4");
		}
		else if ((count % 3) == 0) { // true | optional block
			System.out.println("30 is divisible by 3");
		}
		else { // optional block
			System.out.println("30 is not divisible by 3 & 4");
		}

		// Nested conditions
		int count2 = 50;

		if (count2 > 20) { // true
			if (count2 % 5 == 0) { // true
				System.out.println("50 is greater than 20 and divisible by 5");
			}
		}

		// Above nested condition simplified
		if ((count2 > 20) && (count2 % 5 == 0)) { // true
			System.out.println("Nested condition simplified");
		}
	}
}
