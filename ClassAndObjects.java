public class ClassAndObjects {
	static int number1 = 100;
	static int number2 = 300;

	public static void sampleMethod() {
		System.out.println("This is a sample method!");
	}

	public static void main(String[] args) {
		System.out.println("Number 1 before update : " + number1);
		number1 = 200;
		System.out.println("Number 1 after update : " + number1);
		sampleMethod();

		System.out.println("\n*********** Explaining OOPS ***********");

		ClassAndObjects object1 = new ClassAndObjects(); // Creating an object
		System.out.println("Number 1 from an object1 : " + object1.number1);
		System.out.println("Number 2 from an object1 : " + object1.number2);
		ClassAndObjects object2 = new ClassAndObjects(); // Creating an object
		System.out.println("Number 1 from an object 2 : " + object2.number1);
		System.out.println("Calling sampleMethod() from an object 2");
		object2.sampleMethod();
	}
}
