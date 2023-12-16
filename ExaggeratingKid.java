package homework;

public class ExaggeratingKid extends SchoolKid {
	public ExaggeratingKid (String childName, String teacherName, String greeting, int age) {
		super(childName,teacherName, age, greeting);
	}

	// override accessor for age + 2
	public void setAge(int age) {
		super.setAge(age + 2);
	}
	
	// override accessor for returning (greeting) + "i am the best"
	public void setGreeting(String greeting) {
		super.setGreeting(greeting + "i am the best");
	}
}
