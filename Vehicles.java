package homework;

public class Vehicles {
	//variables
	String name;
	int cylinderNum;
	
	// constructor
	public Vehicles(String name, int cylinderNum) {
		this.name = name;
		this.cylinderNum = cylinderNum;
	}
	
	// accessor for name
	public String getName() {
		return name;
	}

	// mutator for name
	public void setName(String name) {
		this.name = name;
	}

	// accessor for cylinderNum
	public int getCylinderNum() {
		return cylinderNum;
	}

	// mutator for cylinderNum
	public void setCylinderNum(int cylinderNum) {
		this.cylinderNum = cylinderNum;
	}
	
	// writeOutput
	public void writeOutput() {
		System.out.println("Owner name: " + name);
		System.out.println("Number of cylinders: " + cylinderNum);
	}
	
	
	
}
