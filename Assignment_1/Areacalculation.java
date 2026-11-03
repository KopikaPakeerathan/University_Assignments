// Question 6
// Student ID:  5157004
// Name: Kopika Pakeerathan
// Assignment: 1 
// Course: COSC-1046-F04 (Fall 2026) package assignment_sixth_question;
package assignment_question;
import java.util.Scanner;

public class Areacalculation {



    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the hexagon: ");
        double side = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * side * side;
        System.out.printf("Area of the hexagon: %.2f%n", area);

        input.close();
    }
}



