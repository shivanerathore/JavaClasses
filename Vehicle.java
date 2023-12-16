package homework;

public class Vehicle {

	private String license_plate;
	private int num_doors;
	private String vehicle_id;
	// static variable
	private static int numOfVehicles;
	
	
	// default constructor
	public Vehicle() {
		license_plate = "No licence plate yet";
		num_doors = 0;
		vehicle_id = "No id yet";
		numOfVehicles++;
	}
	
	// all parameter constructor
	public Vehicle(String plate, int door, String id) {
		license_plate = plate;
		num_doors = door;
		vehicle_id = id;
		numOfVehicles++;
	}
	
	// static method
	public static void numOfVehicles() {
		System.out.println("Number of Vehicles" + numOfVehicles);
	}
	
	// write output
	public void writeOutput() {
		System.out.println("License Plate: " + license_plate);
		System.out.println("Number of doors: " + num_doors);
		System.out.println("Vehicle id: " + vehicle_id);
	}
	
	// overloading??? im pretty sure i didnt do this correctly
	public static String Add(String license_plate, String vehicle_id) {
		return vehicle_id + license_plate;	
	}

	
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public int getNum_doors() {
		return num_doors;
	}
	public void setNum_doors(int num_doors) {
		this.num_doors = num_doors;
	}

	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
}

