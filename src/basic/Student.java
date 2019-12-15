package basic;

public class Student {

	public String stName; // Declared Variable
	public String stID;

	public Student() {
		// Default constructor

	}

	public Student(String stName) {
		this.stName = stName;
		System.out.println("Student Name is" + stName);

	}

	public Student(String stName, String stID) {
		this.stName = stName;
		this.stID = stID;
	}

}
