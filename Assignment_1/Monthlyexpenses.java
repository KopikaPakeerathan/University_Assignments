// Question 7
// Student ID:  5157004
// Name: Kopika Pakeerathan
// Assignment: 1 
// Course: COSC-1046-F04 (Fall 2026) package assignment_question;

package assignment_question;
import java.util.Scanner;

public class Monthlyexpenses {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your total monthly expenses: $");
       double expenses = input.nextDouble();
        if (expenses < 500) {
            System.out.println("Budget Friendly");
        } 
        else if (expenses <= 1000) {
            System.out.println("Moderate Spending");
        } 
        else if (expenses <= 2000) {
            System.out.println("High Spending");
        } 
        else {
            System.out.println("Excessive Spending");
        }

        input.close();
    }
}



