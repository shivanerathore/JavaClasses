// Shivane Rathore

package chapter3;
import java.util.Scanner;

public class Loopexample {

	public static void main(String[] args) {
		char letter = '\0';
		String answer = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		answer = keyboard.next();
		
		while (!answer.contentEquals("done"))
		{
			if (answer.charAt(0) == answer.charAt(answer.length()-1))
			{	
				System.out.println("The letters are the same");
			}
				
				System.out.println("Enter a word: ");
				answer = keyboard.next();
			
		}
		
	}


}