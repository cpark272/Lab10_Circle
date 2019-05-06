
// a method (function) performs an action (does something, a logic)
// instance variable stores the result


/*public vs private
 * 4 levels of visibility public, private, protected, packaged level
 * packaged - only classes in a package can see that class, but nothing
 * outside of the package can see that class
 * 
 * public -  means anything outside the class can see the class, methods, wherever public is
 * private - means nothing can see it except for the class itself
 * private methods are usually helper methods, because the usually used by some other internal method within the class
 * 
 * static - it's something that's been instantiated (to create) when your application runs
 * when something is static, it's just there, it already exists, and you don't make a new one,
 * there is only one
 * 
 * when making a static method, that method is available without
 * creating a new object (new instance) of the class
 * it also cannot access the instance variables of the class
 *
 *because a static method is not a part of the class, but just housed in it
 *it doesn't store anything to use later
 *
 * constant -  doesn't change
 * 
 * getter gets something
 * usually public, user accessing (getting) instance variables
 * 
 * setter sets something
 * usually public, 
 * 
*/ 

package co.grandcircus;

import java.text.DecimalFormat;

public class Circle {

	// Instance variable
	private double radius;
	
	// Constructor for Circle.class
	public Circle(double radius) {
		this.radius = radius; // this.radius assigns the value to the instance variable also named radius
	}	
	
	// Getter to calculate circumference
	public double getCircumference() {
		
		double circumference = 2 * Math.PI * radius; 
		
		return circumference;
	}
	
	// Getter to calculate area
	public double getArea() {
		
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
		
	}
	// This is a helper method, not to be accessed outside, to format a number to two decimal points
	private static String formatNumber(double x) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		String numberFormatted = df.format(x); // Creates a new object
	    
		return numberFormatted;
	    
	}
	
	// Getter to format a circumference to two decimal points using formatNumber method
	public String getFormattedCircumference() {
		
		String circumferenceFormatted = formatNumber(getCircumference());
		
		return circumferenceFormatted;
		
	}
	
	// Getter to format an area to two decimal points using formatNumber method
	public String getFormattedArea() {
		
		String areaFormatted = formatNumber(getArea());
		
		return areaFormatted;
		
	}
	
}


