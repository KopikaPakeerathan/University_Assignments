
//Student ID: 5157004
//Name: Kopika Pakeerathan
//Assignment: 2
//Course: COSC-1046-F04 (Fall 2026)

package assignment_2;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Get weight from user
	System.out.print("Enter the package weight in pounds: ");
	double weight = input.nextDouble();
	
	if (weight <= 0) {
		System.out.println("Invalid input.");
    }
	else if (weight<=2) {
		System.out.println("Shipping cost: $4.00");
		}
	else if (weight<=5) {
		System.out.println("Shipping cost: $6.00");
	}
	else if (weight <= 12) {
		System.out.println("Shipping cost: $9.00");
	}
	else if (weight<=25 ) {
		System.out.println("Shipping cost: $12.00");
	}
	else {
		System.out.println("The package cannot be shipped.");
		
	}
	input.close();
	}
}
