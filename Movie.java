package homework;

public class Movie {
	
	private String title;
	private String director;
	private String rating;
	private int productionDays;
	
	// Default Constructor
	public Movie() {
		this.title = "No title yet";
		this.director = "No director yet";
		this.rating = "No rating yet";
		this.productionDays = 0;
	}

	// Constructor that takes 4 parameters
	public Movie(String initialTitle, String initialDirector, String initialRating, int initialproductionDays) {
		this.title = initialTitle;
		this.director = initialDirector;
		this.rating = initialRating;
		if (initialproductionDays < 0) {
			System.out.println("Error: Negative number of production days");
			System.exit(0);
		}
		else {
			this.productionDays = initialproductionDays;
		}
	}
	
	// Constructor that takes 1 String parameter
	public Movie(String initialTitle) {
		this.title = initialTitle;
		this.director = "No director yet";
		this.rating = "No rating yet";
		this.productionDays = 0;
	}
	
	// Constructor that takes 1 int parameter
	public Movie(int initialProductionDays) {
		title = "No title yet";
		director = "No director yet";
		rating = "No rating yet";
		if (initialProductionDays < 0) {
			System.out.println("Error: Negative number of production days");
			System.exit(0);
		}
		else {
			productionDays = initialProductionDays;
		}
	}
	
	
	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getRating() {
		return rating;
	}

	public int getProductionDays() {
		return productionDays;
	}

	public void writeOutput() {
		System.out.println("Title: " + title);
		System.out.println("Director: " + director);
		System.out.println("Rating: " + rating);
		System.out.println("Production Days: " + productionDays);
	}



}

