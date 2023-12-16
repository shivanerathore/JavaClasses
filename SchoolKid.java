package homework;

public class SchoolKid {
	// variables
	private String childName;
	private String teacherName;
	private String greeting;
	private int age; 
	
	
	// default constructor
	public SchoolKid () {
		this.childName = "No name yet";
		this.teacherName = "No name yet";
		this.greeting = "No greeting yet";
		this.age = 0;
	}
	
	// constructor that takes 4 parameters
	public SchoolKid (String initialChildName, String initialTeacherName, int initialAge, String initialGreeting) {
		this.childName = initialChildName;
		this.teacherName = initialTeacherName;
		this.greeting = initialGreeting;
		if (initialAge < 0) {
			System.out.println("Error: Negative age");
			System.exit(0);
		}
		else {
			this.age = initialAge;
		}
	}
	
	// constructor that takes 1 String parameter
	public SchoolKid (String initialChildName) {
		this.childName = initialChildName;
		this.teacherName = "No name yet";
		this.greeting = "No greeting yet";
		this.age = 0;
	}
	
	
	// setters and getters
	//accessor method for childName
	public String getChildName() {
		return childName;
	}
	
	// mutator method for childName
	public void setChildName(String childName) {
		this.childName = childName;
	}

	//accessor method for teacherName
	public String getTeacherName() {
		return teacherName;
	}

	// mutator method for teacherName
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	//accessor method for age
	public int getAge() {
		return age;
	}

	// mutator method for age
	public void setAge(int age) {
		this.age = age;
	}

	//accessor method for greeting
	public String getGreeting() {
		return greeting;
	}

	// mutator method for greeting
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	// toString
	public String toString() {
		return ("Child Name = " + childName + " Age = " + age + " Teacher Name = " + teacherName + " Greeting = " + greeting);
	}
	
	// equals
	public boolean equals (SchoolKid otherObject) {
		return (this.childName == otherObject.childName) && (this.age == otherObject.age);
	}
	
	// writeOutput
	public void writeOutput() {
		System.out.println("Child's name: " + childName);
		System.out.println("Teacher's name: " + teacherName);
		System.out.println("Greeting: " + greeting);
		System.out.println("Age: " + age);
	}
	
	

}

