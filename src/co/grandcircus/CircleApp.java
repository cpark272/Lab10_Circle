package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userInput = "y";
		double radius = 0; 
		
		// Title of program
		System.out.println("Welcome to the Circle Tester");
		
		// While loop to let user decide when to end program
		while (userInput.equalsIgnoreCase("y")) {
			
			// User inputs the radius of the circle
			System.out.print("Enter radius: " );
			radius = scan.nextDouble();
			
			// New object
			Circle newCircle = new Circle(radius);
			
			// Method in Circle class will calculate the circumference of the circle
			System.out.println("Circumference: " + newCircle.getFormattedCircumference());
			
			// Method in Circle class will calculate the area of the circle
			System.out.println("Area: " + newCircle.getFormattedArea());
			
			// Asks if the user want to continue or end the program
			System.out.print("Continue? (y/n): ");
			userInput = scan.next();
			System.out.println();
			
		}
		
		System.out.print("Goodbye.");
		
		scan.close();
		
	}

}
