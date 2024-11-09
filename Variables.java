public class Variables {
	public static void main(String[] args) {
		/* This method explains variables in java */

		String companyName = "Ednue Technologies"; // String  -> Text (Collection of characters)
		System.out.println(companyName);
		
		char alphabet = 'a'; // char    -> single character (alphabet, integer, symbol)
		System.out.println(alphabet);

		int number1 = 100; // int     -> positive integer
		System.out.println(number1);

		int number2 = -100; // int     -> negative integer
		System.out.println(number2);
		
		float pointNumbers1 = 10.12f; // float   -> positive integer with floating values
		System.out.println(pointNumbers1);
		
		float pointNumbers2 = -10.12f; // float   -> negative integer with floating values
		System.out.println(pointNumbers2);

		boolean flag = true; // boolean -> true/false or 0/1
		System.out.println(flag);

		// Method 2
		int number3; // declaring
		number3 = 200; // defining
		System.out.println(number3);

		// Update the variable values
		flag = false;
		System.out.println(flag);

		alphabet = 'z';
		System.out.println(alphabet);

		// final variable
		final int finalNumber = 1234;
		System.out.println(finalNumber);
		// finalNumber = 5678; // this line will throw error - cannot assign a value to final variable finalNumber
	}
}
