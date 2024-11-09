public class ConstructorParameters {
	int target; // int default value - 0
	String name;
	
	// Constructor
	public ConstructorParameters(int x, String y) {
		target = x; // 95
		name = y; // Ednue Technologies
	}

	public static void main(String[] args) {
		System.out.println("************ Constructors Parameters ************");

		// Creating object without parameters
		// ConstructorParameters obj = new ConstructorParameters(); // error

		// Creating object with parameters
		ConstructorParameters obj = new ConstructorParameters(95, "Ednue Technologies");
		System.out.println("Value of class attribute - target is : " + obj.target);
		System.out.println("Value of class attribute - name is : " + obj.name);

		// Creating new object with parameters
		ConstructorParameters obj2 = new ConstructorParameters(99, "Devid");
		System.out.println("Value of class attribute from new object - target is : " + obj2.target);
		System.out.println("Value of class attribute from new object- name is : " + obj2.name);
	}
}
