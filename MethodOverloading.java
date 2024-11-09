public class MethodOverloading {

	// Normal Method
	static int intAddition(int num1, int num2) {

		return num1 + num2;
	}

	static double doubleAddition(double num1, double num2) {

		return num1 + num2;
	}

	// Method Overloading
	static int intMultiply(int num1, int num2) {

		return num1 * num2;
	}

	static double intMultiply(double num1, double num2) {

		return num1 * num2;
	}

	public static void main(String[] args) {
		System.out.println("********* Method Overloading in JAVA *********\n");

		System.out.println("********* Normal Method *********");
		int intResult = intAddition(10, 20);
		System.out.println("Integer type numbers addition result is : " + intResult);
		double doubleResult = doubleAddition(10, 20);
		System.out.println("Double type numbers addition result is : " + doubleResult);

		System.out.println("********* Method Overloading *********");
		int intResult2 = intMultiply(10, 20);
		System.out.println("Integer type numbers multiply result is : " + intResult2);
		double doubleResult2 = intMultiply(10, 20);
		System.out.println("Double type numbers multiply result is : " + doubleResult2);

	}
}
