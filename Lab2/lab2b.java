package lab2;
import java.util.Scanner;
public class lab2b {
	/*
     Average acceleration is defined as the change of velocity 
     divided by the time taken to make the change.
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Initialize Scanner
				Scanner input = new Scanner(System.in);
				
		//  Prompt the user to enter v0, v1, and t
				System.out.print("Enter starting velocity v0: ");
				double v0 = input.nextDouble();
				
				System.out.print("Enter ending velocity v1: ");
				double v1 = input.nextDouble();
				
				System.out.print("Enter time span t: ");
				double t = input.nextDouble();
				
	     //  Calculate the average acceleration
				double result = (v1 - v0) / t;
						
		// Formatting the result for displaying
				String formattedString = String.format(
				    "The average acceleration is : %.4f", result);
				
		// Displaying the formatted string
				System.out.println(formattedString);
				
	    // Close the input resource
				input.close();

	}

}
