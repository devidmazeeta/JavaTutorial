public class ParametersAndArguments {
	static void studentDetail(String name, String subject, int mark) {
		System.out.println(name + " Scored " + mark + " Marks in " + subject);
	}

	static void validateResults(String name, int mark) {
		if (mark < 50) {
			System.out.println(name + " is failed!");
		}
		else {
			System.out.println(name + " is passed!");
		}
	}

	public static void main(String[] args) {
		System.out.println("******** Parameters and Arguments ********");

		studentDetail("Arun", "Physics", 95);
		studentDetail("Ajay", "Chemistry", 99);
		studentDetail("Alex", "Maths", 94);
		// studentDetail("Alex", "Maths"); // Compile time error -> ParametersAndArguments.java:12: error: method studentDetail in class ParametersAndArguments cannot be applied to given types;

		validateResults("Arun", 80);
		validateResults("Ajay", 40);
		validateResults("Alex", 90);
	}
}
