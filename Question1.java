package FirstProject;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a decimal number: ");
		float x = keyboard.nextFloat();
		int y = (int) x;
		System.out.println("Casted as an integer; ");
		System.out.println("x is: " + x);
		System.out.println("y is: " + y);
		
		
		byte z = (byte) x;
		System.out.println("Casted as a byte; ");
		System.out.println("x is: " + x);
		System.out.println("z is: " + z);
		
	}

}
