// Student ID: 5157004
// Name: Kopika Pakeerathan
// Assignment: 2
// Course: COSC-1046-F04 (Fall 2026)

package assignment_2;
import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get the fruits name from user
		System.out.print("Enter the first fruit: ");
		String fruit1 = input.nextLine();
		
		System.out.print("Enter the second fruit: ");
		String fruit2 = input.nextLine();
		
		System.out.print("Enter the third fruit: ");
        String fruit3 = input.nextLine();
        
        //Swap the names when they are in  wrong alphabetical order
        if (fruit1.compareToIgnoreCase(fruit2)>0) {
        	String temp = fruit1;
            fruit1 = fruit2;
            fruit2 = temp;
        }

        if (fruit1.compareToIgnoreCase(fruit3) > 0) {
            String temp = fruit1;
            fruit1 = fruit3;
            fruit3 = temp;
        }
        if (fruit2.compareToIgnoreCase(fruit3) > 0) {
            String temp = fruit2;
            fruit2 = fruit3;
            fruit3 = temp;
        }
        System.out.println("The three fruits in alphabetical order are "
                + fruit1 + ", " + fruit2 + ", " + fruit3 + ".");

        input.close();
        
	}

}
