public class MethodsForArtimeticOperation {

	static void demoMethod() {
		System.out.println("Main method called demoMethod()");
	}

	static void multiplication(int a, int b) { // int a = 10; int b = 20;
		int c = a * b;
		System.out.println("Multiplication of A dnd B is : " + c);
	}

	static void addition(int a, int b) { // int a = 10; int b = 20;
		int c = a + b;
		System.out.println("Addition of A dnd B is : " + c);
	}

	// Main method orchestrates the program flow
	public static void main(String[] args) {
		System.out.println("******** Java Methods ********");

		demoMethod();
		demoMethod();

		addition(10, 20);
		multiplication(10, 20);
	}
}

