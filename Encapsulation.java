public class Encapsulation {
	public static void main(String[] args) {
		Car obj = new Car();
		// obj.carName = "BMW"; // error: carName has private access in Car
		// System.out.println(obj.carName); // error: carName has private access in Car

		System.out.println(obj.getCarModelYear()); // returns default int value => 0
		obj.setCarModelYear(2024);
		System.out.println(obj.getCarModelYear()); // returns updated value => 2024
	}
}
