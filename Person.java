package homework;

// This class has objects that have details about Person
// Shivane Rathore

public class Person {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	
	public void writeOutput()
	{
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Email: " + email);
		System.out.println("Phone number: " + phoneNum);
	}
	
	public void setPerson(String f, String l, String e, String p) {
		this.firstName = f;
		this.lastName = l;
		this.email = e;
		this.phoneNum = p;
		
	}
	
	// accessor method for first name
	public String getFirstName() {
		return firstName;
	}
	
	// mutator method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// accessor method for last name
	public String getLastName() {
		return lastName;
	}
	
	// mutator method for last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// accessor method for email
	public String getEmail() {
		return email;
	}
	
	// mutator method for email
	public void setEmail(String email) {
		this.email = email;
	}
	
	// accessor method for phone number
	public String getPhoneNum() {
		return phoneNum;
	}
	
	// mutator method for phone number
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public boolean equals (Person otherObject) {
		return(this.firstName == otherObject.firstName) && (this.lastName == otherObject.lastName) && (this.email == otherObject.email) && (this.phoneNum == otherObject.phoneNum);
	}
	
	
	}


