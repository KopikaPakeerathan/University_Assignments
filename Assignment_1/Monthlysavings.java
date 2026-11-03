// Question 5
// Student ID:  5157004
// Name: Kopika Pakeerathan
// Assignment: 1 
// Course: COSC-1046-F04 (Fall 2026) 
package assignment_question;
import java.util.Scanner;

public class Monthlysavings {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your monthly saving amount: $");
        
        double monthlySaving = input.nextDouble();
        double monthlyInterestRate = 0.048 / 12;
        double accountValue = 0.0;

       
        for (int month = 1; month <= 7; month++) {
            accountValue = (accountValue + monthlySaving)
                    * (1 + monthlyInterestRate);
        }

        
        System.out.printf(
            "Account value after the seventh month: $%.2f%n",accountValue  );
        input.close();
    }
}

