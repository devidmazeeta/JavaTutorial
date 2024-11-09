public class ClassMethods {
	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("********* Class Methods - Static vs Plublic *********");

		myStaticMethod(); // Call the static method
		// myPublicMethod(); // Compile Time Error - non-static method myPublicMethod() cannot be referenced from a static context

		ClassMethods myObj = new ClassMethods(); // Create an object of MyClass
		myObj.myPublicMethod(); // Call the public method
		myObj.myStaticMethod(); // Call the static method using object
	}
}
