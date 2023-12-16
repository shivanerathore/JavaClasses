package FirstProject;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		int price;
		int change;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Price: ");
		
		price = keyboard.nextInt();
		change = 100 - price;
		System.out.println("You bought an item for " + price + " and you gave me a dollar so your change is "+ change + "cents");
		
		int quarters = change / 25;
		int quarterRemainder = change % 25;
		
		int dimes = quarterRemainder / 10;
		
		int nickels= quarterRemainder /10;
		int dimeRemainder = nickels/ 5;
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + dimeRemainder);
		
		
		
	

	}

}
