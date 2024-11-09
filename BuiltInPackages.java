import java.util.Scanner;

/* 
Syntax:

import package.name.ClassName;   // Import a single class
import package.name.*;   // Import all classes in a package
*/

public class BuiltInPackages {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter Car Name: ");

		String carName = myObj.nextLine();
		System.out.println("Car name is: " + carName);
	}
}
