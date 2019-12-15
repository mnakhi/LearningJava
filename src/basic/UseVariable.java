package basic;

public class UseVariable {

	// Variable :
	// DataType nameOfVariable = Value;
	// Global Variable: outside of any method but inside of a class
	// Local Variable: if inside of any method

	int number = 10;// Global variable
	int x; // Declare variable
	String stName = "Malika"; // Global and initialized value
	String stID;// Declared
	static String contactNumber = "46459686318"; // class Variable

	int y = 20; // Declare and initialize variable value

	int age = 21;
	int salary = 8000;

	public void studentInfo() {

		stID = "16816";
		System.out.println("Student ID is : " + stID);

	}

	public void newDisplay() {
		int tvSize = 65;

	}

	public static void main(String[] args) {

		int num = 15;// local variable
		UseVariable objUseVariable = new UseVariable();
		objUseVariable.x = 30;
		// x = 29;
		objUseVariable.studentInfo();
		objUseVariable.stName = "Zakiir";// called by object because of variable is non static

		System.out.println(objUseVariable.stName);

		UseVariable.contactNumber = "644868851"; // called by class name because of class variable which is static

	}

}
