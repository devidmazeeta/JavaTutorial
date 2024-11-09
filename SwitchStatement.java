public class SwitchStatement {
	public static void main(String[] args) {
		int number = 60;

		// Normal Approach
		if (number == 10) {
			System.out.println("Number is 10");
		}
		else if (number == 20) {
			System.out.println("Number is 20");
		}
		else if (number == 30) {
			System.out.println("Number is 30");
		}
		else if (number == 40) {
			System.out.println("Number is 40");
		}
		else { // else statement will execute
			System.out.println("Number is not 10, 20, 30 & 40");
		}

		// Switch Statement
		switch (number) {
			case 40:
				System.out.println("Case Number is 40");
			case 20:
				System.out.println("Case Number is 20");
			case 30:
				System.out.println("Case Number is 30");
			case 10:
				System.out.println("Case Number is 10");
			default: // default case will execute
				System.out.println("Default Case Line 1");
				System.out.println("Default Case Line 2");
		}

		// Explaining break statement
		number = 20;
		switch (number) {
			case 20:
				System.out.println("New 1 => Case Number is 20");
			default:
				System.out.println("New 1 => Default Case");
		}

		switch (number) {
			case 20:
				System.out.println("New 2 => Case Number is 20");
				break;
			default:
				System.out.println("New 2 => Default Case");
		}
	}
}
