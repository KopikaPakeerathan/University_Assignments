package lab5;
import java.util.Scanner;
public class Lab5b {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String text = input.nextLine();
        System.out.print("Please enter a character: ");
        char ch = input.next().charAt(0);

        int characterCount = 0;
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (current == ch) {
                characterCount++;
            }

            if (Character.isUpperCase(current)) {
                uppercaseCount++;
            }

            if (Character.isLowerCase(current)) {
                lowercaseCount++;
            }
        }

        
        System.out.println("There are " + characterCount + " "+ ch + "s. There are " + uppercaseCount + " uppercase letters and " + lowercaseCount
                + " lowercase letters.");

        input.close();
    }
}


