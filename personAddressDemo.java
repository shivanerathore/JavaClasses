// Shivane Rathore

package homework;

public class personAddressDemo {

	public static void main(String[] args) {
		
		Person alex = new Person();
		alex.setFirstName("Alex");
		alex.setLastName("Morgan");
		alex.setEmail("alexmorgan@gmail.com");
		alex.setPhoneNum("12345678");
		alex.writeOutput();
		
		System.out.println(" ");
		
		Person julie = new Person();
		julie.setFirstName("Julie");
		julie.setLastName("Ertz");
		julie.setEmail("julieertz@gmail.com");
		julie.setPhoneNum("87654321");
		julie.writeOutput();
		
		System.out.println(" ");
		
		Person megan = new Person();
		megan.setFirstName("Megan");
		megan.setLastName("Rapinoe");
		megan.setEmail("meganrapinoe@gmail.com");
		megan.setPhoneNum("98765432");
		megan.writeOutput();
		
		System.out.println(" ");
		
		Person julie2 = new Person();
		julie2.setFirstName("Julie");
		julie2.setLastName("Ertz");
		julie2.setEmail("julieertz@gmail.com");
		julie2.setPhoneNum("87654321");
		julie2.writeOutput();
		
		System.out.println(" ");
		
		if (alex.equals(julie)) {
			System.out.println("Alex and Julie are equal");	
		}
		else {
			System.out.println("Alex and Julie are not equal");
		}
			
		System.out.println(" ");
		
		if (alex.equals(megan)) {
			System.out.println("Alex and Megan are equal");
		}
		else {
			System.out.println("Alex and Megan are not equal");
		}
		
		System.out.println(" ");
		
		if (alex.equals(julie2)) {
			System.out.println("Alex and Julie2 are equal");	
		}
		else {
			System.out.println("Alex and Julie2 are not equal");
		}
		
		System.out.println(" ");
		
		if (julie.equals(megan)) {
			System.out.println("Julie and Megan are equal");	
		}
		else {
			System.out.println("Julie and Megan are not equal");
		}
		
		System.out.println(" ");
		
		if (julie.equals(julie2)) {
			System.out.println("Julie and Julie2 are equal");	
		}
		else {
			System.out.println("Julie and Julie2 are not equal");
		}
	
		System.out.println(" ");
		
		if (megan.equals(julie)) {
			System.out.println("Megan and Julie are equal");	
		}
		else {
			System.out.println("Megan and Julie are not equal");
		}
		
	}
	
	
}
