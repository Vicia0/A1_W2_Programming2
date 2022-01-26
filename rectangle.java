///Java program to print perimeter and area of a rectangle
import java.util.*;

///importing the java.text.*  such that the inputs and values are formatted correctly
import java.text.*;

/// creating the class rectangle
public class rectangle {
	
	/// creating the main method
	public static void main(String[] args){
		
		/// Create scanner class object
		Scanner user_input = new Scanner(System.in);
		/// Input length and width of rectangle
		System.out.println("Enter length in meters: ");
		/// Accepting user input in the form of a float
		float length = user_input.nextFloat();
		/// Print and request another user input
		System.out.println ("Enter width in meters: ");
		/// Accepting user input in the form of a float
		float width = user_input.nextFloat();
		
		/// Calculate area and perimeter of rectangle and name the variable a double 
		double area = length * width;
		
		double perimeter = 2*(length + width);
		
		/// Create a format for the double values allowing only up to 4 decimals
		DecimalFormat double_value  = new DecimalFormat("0.0000");
		
		///Print the area of the rectangle
		/// Using explicit casting to convert the double area type to short and print the result
		System.out.println("The area using short data type : " + (short)(area));
		/// Using explicit casting to convert the double area type to an int and print the result
		System.out.println("The area using int data type : " + (int)(area));
		/// Using implicit casting to convert the double area type to long and print the result
		System.out.println("The area using long data type : " + (long)(area));
		/// Using DecimalFormat, print the round off of the double area with only four decimals.
		System.out.println("The area using double data type : " + double_value.format(area));
		
		///Print the perimeter of the rectangle
		/// Using explicit casting to convert the double perimeter type to short and print the result
		System.out.println("The perimeter using short data type : " + (short)(perimeter));
		/// Using explicit casting to convert the double perimeter type to int and print the result
		System.out.println("The perimeter using int data type : " + (int)(perimeter));
		/// Using implicit casting to convert the double perimeter type to long and print the result
		System.out.println("The perimeter using long data type : " + (long)(perimeter));
		/// Using DecimalFormat, round off the double perimeter with only four decimals.
		System.out.println("The perimeter using double data type : " + double_value.format(perimeter));
	}
}
