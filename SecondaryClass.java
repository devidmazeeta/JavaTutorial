public class SecondaryClass {
	String text = "Ednue";
	public static void main(String[] args) {
		SecondaryClass currentClassObject = new SecondaryClass(); // Creating an object
		System.out.println("Current class object => " + currentClassObject.text);
		
		ClassAndObjects otherClassObject = new ClassAndObjects(); // Creating an object
		System.out.println("Other class object => " + otherClassObject.number1);
		otherClassObject.sampleMethod(); // calling other class method
	}
}
