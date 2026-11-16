package lab4;
import java.util.Scanner;

public class Mathpuzzle {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the edge length: ");
	        double edge = input.nextDouble();

	        double volume = ((15 + 7 * Math.sqrt(5)) / 4)
	                        * Math.pow(edge, 3);

	        double radius = Math.cbrt((3 * volume) / (4 * Math.PI));

	        System.out.printf("Volume of the dodecahedron: %.4f%n", volume);
	        System.out.printf("Radius of the sphere: %.4f%n", radius);

	        input.close();
	    }
	}



