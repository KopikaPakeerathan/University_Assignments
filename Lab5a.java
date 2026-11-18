package lab5;
import java.util.Scanner;


public class Lab5a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number > 12) {
            System.out.println("Factorial is too large for int type!");
        } 
        else if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
        } 
        else {
        	int factorial = 1;
            int i = 1;
        	while (i <= number) {
                factorial = factorial * i;
                i++;
            }
            
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        input.close();
    }
}
