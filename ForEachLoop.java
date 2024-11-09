public class ForEachLoop {
	public static void main(String[] args) {
		/* Syntax:
		for (type variableName : arrayName) {
			// code block to be executed
		}
		*/

		// String text = "hello";
		String[] fruits = {"Orange", "Grapes", "Apple", "Pineapple"};

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
