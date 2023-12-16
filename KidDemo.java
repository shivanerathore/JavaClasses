package homework;

public class KidDemo {
	
	public static void main(String[] args) {
	
	// ExaggeratingKid object 1
	ExaggeratingKid ek1 = new ExaggeratingKid("Joe", "Ms. Blake", "Hola", 14);
	System.out.println(ek1.toString());
	
	System.out.println(" ");
	
	// ExaggeratingKid object 2
	ExaggeratingKid ek2 = new ExaggeratingKid("Rick", "Mrs. Peters", "Hello", 12);
	System.out.println(ek2.toString());
	
	System.out.println(" ");

	// ExaggeratingKid object 3
	ExaggeratingKid ek3 = new ExaggeratingKid("Jill", "Mr. Mike", "Hi", 11);
	System.out.println(ek3.toString());
	
	System.out.println(" ");

	// equals
	if (ek1.equals(ek2)) {
		System.out.println("Joe and Rick are equal");
	}
	else {
		System.out.println("Joe and Rick are not equal");
	}

}
}