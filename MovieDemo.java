package homework;

public class MovieDemo {

		public static void main(String[] args) {
			
			// default
			Movie m1 = new Movie();
			m1.writeOutput();
			
			System.out.println(" ");
			
			// 4 parameters
			Movie m2 = new Movie("Harry Potter", "Chris Columbus", "7 stars", 835);
			m2.writeOutput();
			
			System.out.println(" ");
			
			// 1 string parameter
			Movie m3 = new Movie("Transformers");
			m3.writeOutput();
			
			System.out.println(" ");
			
			// 1 int parameter
			Movie m4 = new Movie(123);
			m4.writeOutput();
		}
}
