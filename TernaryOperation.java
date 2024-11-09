public class TernaryOperation {
	public static void main(String[] args) {
		// Normal method
		int number = 100;

		if (number > 50) { // true
			System.out.println("If condition satisfied");
		}
		else {
			System.out.println("Else condition satisfied"); // this line doesn't execute
		}

		// Ternary Operator
		// (condition) ? if true result : fail result
		String result = (number > 50) ? "Pass" : "Fail";
		System.out.println(result); // Pass
		String result2 = (number > 200) ? "Pass" : "Fail";
		System.out.println(result2); // Fail
	}
}
