package homework;

public class SUV extends Truck{

	// variables
	int passengers;
	
	// constructor
	public SUV(String name, int cylinderNum, double load, double towing, int passengers) {
		super(name, cylinderNum, load, towing);
		this.passengers = passengers;
	}
	
	// accessor
	public int getPassengers() {
		return passengers;
	}

	// mutator
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	// writeOutput
	public void writeOutput() {
		System.out.println("Owner name: " + name);
		System.out.println("Number of cylinders: " + cylinderNum);
		System.out.println("Load capacity: " + load);
		System.out.println("Towing capacity: " + towing);
		System.out.println("Number of Passengers: " + passengers);
	}

	@Override
	public String toString() {
		return "SUV [passengers=" + passengers + "]";
	}

	
	}
	
	
		

	


