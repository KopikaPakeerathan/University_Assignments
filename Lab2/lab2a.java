package lab2;
import java.util.Scanner; // Importing Scanner class for input.

public class lab2a {
	/*
    (Health application: computing BMI)
    Body Mass Index (BMI) is calculated by taking your weight
    in kilograms and dividing it by the square of your height in meters.
   */
	public static void main(String[] args) {
		// 1. Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Prompting for weight in pounds
        System.out.print("Enter weight in pounds: ");

        // Getting weight from user
        double weightInPounds = input.nextDouble();

        // Prompting for height in inches
        System.out.print("Enter height in inches: ");

        // 2. Getting height from user
        double heightInInches = input.nextDouble();

        // 3. Convert pounds to kilograms
        double weightInKilograms = weightInPounds * 0.45359237;

        // 4. Convert inches to meters
        double heightInMeters = heightInInches * 0.0254;

        // 5. Calculate BMI
        double bmiResult = weightInKilograms /
                           (heightInMeters * heightInMeters);

        // Formatting result to 4 decimal places
        String formattedResult = String.format("BMI is %.4f", bmiResult);

        // Displaying output
        System.out.println(formattedResult);

        // Closing Scanner
        input.close();	

	}

}
