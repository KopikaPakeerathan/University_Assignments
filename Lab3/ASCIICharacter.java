package lab3a;

public class ASCIICharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int low = 32;
        int high = 127;

        int asciiCode = (int)((Math.random() * (high - low)) + low);
        char character = (char) asciiCode;

        System.out.println("Character: " + character);

        if (character >= 48 && character <= 57) {
            System.out.println("It is a digit");
        }
        else if (character >= 65 && character <= 90) {
            System.out.println("It is a uppercase letter");
        }
        else if (character >= 97 && character <= 122) {
            System.out.println("It is a lowercase letter");
        }
        else {
            System.out.println("It is a symbol");
        }
    }
}