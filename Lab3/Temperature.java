package lab3a;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int temperature = input.nextInt();

        if (temperature > 40) {
            System.out.println("high");
        }
        else if (temperature < 10) {
            System.out.println("low");
        }
        else {
            System.out.println("just right");
        }

        input.close();

	}

}
