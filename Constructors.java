/* 
	Constructor is a special method.
	It can be used to set initial values for object attributes.
	Author: Devid
*/
public class Constructors {
	int target; // class variable
	String name; // class variable

	// Constructor method
	public Constructors() {
		target = 100; // updating class variable
		name = "Ednue";
	}

	public static void main(String[] args) {
		System.out.println("************ Constructors ************");

		Constructors obj = new Constructors(); // Syntax -> ClassName objectName = new ConstructorName();
		System.out.println("Value of class attribute - target is : " + obj.target);
		System.out.println("Value of class attribute - target is : " + obj.name);
	}
}
