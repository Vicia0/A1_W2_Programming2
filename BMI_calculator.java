///importing java.util.* to collect and manage inputs
import java.util.*; 

///importing the java.text.* such that the inputs and values are formatted correctly
import java.text.*;

/// create the class BMI_calculator 
public class BMI_calculator {
	
	/// making the main method
	public static void main(String[] args){
		
		try (/// Creating the Scanner to allow for the passing of arguments
		Scanner user_input = new Scanner(System.in)) {
			/// soliciting input from the user(name)
			System.out.println("Enter your Name:");
			///Accepting user input in the form of a string
			String Name = user_input.nextLine();
			/// calling for another input(height)
			System.out.println("Enter your height in meters squared: ");
			
			/// defining the format for the new inputs, which should be only two decimals
			DecimalFormat value  = new DecimalFormat("0.00");
			
			///Scanner accepts new input
			///converting it to the format that was specified
			///after which it is parsed to meet the variable type
			double height = Double.parseDouble(value.format(user_input.nextDouble()));
			
			/// calling for another input (weight)
			System.out.println ("Enter your weight(kg): ");
			double weight = Double.parseDouble(value.format(user_input.nextDouble()));
			
			/// Calculate the BMI, format it, and parse it as a double with two decimal points.
			double BMI = Double.parseDouble(value.format(weight/height));
			
			///printing the result
			System.out.println("Name: " + Name);
			System.out.print("Height: " + height);
			System.out.println(" m ");
			System.out.print("Weight: " + weight);
			System.out.println(" kgs ");
			System.out.println("Your BMI is " + BMI);
		} 
	}

}