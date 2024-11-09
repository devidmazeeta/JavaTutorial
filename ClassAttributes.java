public class ClassAttributes {
	String text = "Ednue";

	public static void main(String[] args) {
		ClassAttributes curObject = new ClassAttributes(); // Creating an object for current class
		System.out.println("Text value before updating : " + curObject.text);
		curObject.text = "Technology";
		System.out.println("Text value after updating : " + curObject.text);

		ClassAndObjects othObject = new ClassAndObjects();
		System.out.println("Number attribute value from other object before updating : "+ othObject.number1); // 100
		othObject.number1 = 500;
		System.out.println("Number attribute value from other object after updating : " + othObject.number1); // 500
	}
}
