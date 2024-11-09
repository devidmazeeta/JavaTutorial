public class NestedLoop {
	public static void main(String[] args) {
		// print numbers between 1 to 9 as below
		// 111
		// 222
		// 333
		// .
		// .
		// 999
		for (int number1 = 1; number1 < 10; number1++) {
			for (int number2 = 1; number2 <= 3; number2++) {
				System.out.print(number1);
			}

			System.out.print("\n");
		}
	}
}

