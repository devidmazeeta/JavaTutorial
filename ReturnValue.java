public class ReturnValue {
	static String returnMethod(String text1, String text2) {
		
        // String resultText = text1 + " " + text2;
		// return resultText;

        return text1 + " " + text2;
	}

	public static void main(String[] args) {
		System.out.println("********* Return Value *********");

		String resultText = returnMethod("Ednue", "Technologies");

		System.out.println(resultText);
	}
}
