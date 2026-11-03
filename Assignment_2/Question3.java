// Student ID: 5157004
// Name: Kopika Pakeerathan
// Assignment: 2
// Course: COSC-1046-F04 (Fall 2026)

package assignment_2;

public class Question3 {
	public static void main(String[] args) {
		final int ROWS = 5;

        for (int row = 1; row <= ROWS; row++) {

            // Print empty spaces before the numbers.
            for (int space = 1; space <= ROWS - row; space++) {
                System.out.print("    ");
            }

            // Print increasing powers of 3, including the centre
            for (int power = 0; power < row; power++) {
                System.out.printf("%4d", (int) Math.pow(3, power));
            }

            // Print decreasing powers of 3 after the centre.
            for (int power = row - 2; power >= 0; power--) {
                System.out.printf("%4d", (int) Math.pow(3, power));
            }
            //Move to next row
            System.out.println();
		
        }
    }
}


