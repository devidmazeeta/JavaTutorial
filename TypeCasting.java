public class TypeCasting {
	/* 	Types of Type Casting:
		- Widening TypeCasting (Automatic)
		- Narrowing TypeCasting (Manual) */

	public static void main(String[] args) {

		// Widening TypeCasting (Automatic)
		byte num1 = 100;
		System.out.println(num1);

		int num2 = num1;
		System.out.println(num2);

		float num3 = num1;
		System.out.println(num3);

		// Narrowing TypeCasting (Manual)
		int num4 = 1001;
		System.out.println(num4);
		
		// byte num5 = (float) num4; //  incompatible types: possible lossy conversion from float to byte
		// System.out.println(num5);
		
		short num6 = (short) num4;
		System.out.println(num6);
		
		// String testString = (String) num4; // incompatible types: int cannot be converted to Strin
		// System.out.println(testString);
	}
}
