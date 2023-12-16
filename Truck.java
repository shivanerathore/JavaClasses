package homework;

public class Truck extends Vehicles {

	// variables
	double load;
	double towing;
	
	// constructor
	public Truck(String name, int cylinderNum, double load, double towing) {
		super(name, cylinderNum);
		this.load = load;
		this.towing = towing;
	}

	// accessor for load
	public double getLoad() {
		return load;
	}

	// mutator for load
	public void setLoad(double load) {
		this.load = load;
	}

	// accessor for towing
	public double getTowing() {
		return towing;
	}

	//mutator for towing
	public void setTowing(double towing) {
		this.towing = towing;
	}
	
	// writeOutput
	public void writeOutput() {
		System.out.println("Owner name: " + name);
		System.out.println("Number of cylinders: " + cylinderNum);
		System.out.println("Load capacity: " + load);
		System.out.println("Towing capacity: " + towing);
	}

	@Override
	public String toString() {
		return "Truck [load=" + load + ", towing=" + towing + "]";
	}
	

}
