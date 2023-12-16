package homework;

import java.util.Scanner;
public class FlowerCounter {

	public static void main(String[] args) {
		String[] flowers = {"petunia", "pantsy", "rose", "violet", "carnation"};
		double[] price = {1, 1.50, 2, 2.50, 3};

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What flower would you like? ");
		String flowerkey = keyboard.next();
		
		int index = -1;
		for (int i=0; i<flowers.length; i++) {
			if (flowers[i].equals(flowerkey))
				index = i;
		}
		
		if (index == -1)
			System.out.println("Sorry this flower is unavailable");
		
		else {
			System.out.println("How many flowers do you need?");
			int num = keyboard.nextInt();
			double total = (num * price[index]);
			
			System.out.println("The total cost is: " + "$" + total);
		}
	}

}
