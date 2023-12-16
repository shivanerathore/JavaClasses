package homework;

public class displayArray {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;
		
		int[ ][ ] displayArray = new int[4][5];
		
		for (row = 0; row < displayArray.length; row++)
		   for (column = 0; column < displayArray[row].length; column++)
		       displayArray[row][column] = column;
		for (row = 0; row < displayArray.length; row++)
		
		{
		   for (column = 0; column < displayArray[row].length; column++)
		       System.out.print(displayArray[row][column] + " ");
		   System.out.println();
		}
}
}