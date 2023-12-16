package FirstProject;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("Enter a four-digit number: ");
		Scanner keyboard = new Scanner(System.in);
		int number;
		number = keyboard.nextInt();
		
		int num1;
		num1 = (number / 1000);
		System.out.println(num1);
		
		int num2, num02;
		num2 = (number %  1000);
		num02 = (num2 / 100);
		System.out.println(num02);
		
		int num3, num03;
		num3 = (number % 100);
		num03 = (num3 / 10);
		System.out.println(num03);
		
		int num4;
		num4 = (number % 10);
		System.out.println(num4);
		
		

	}

}
