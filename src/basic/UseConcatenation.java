package basic;

public class UseConcatenation {

	// Concatenation

	public static void main(String[] args) {
		String fName = "James";
		String lName = "William";

		System.out.println("My First Name is " + fName);
		System.out.println("My Last Name is " + lName);
		System.out.println("My First Name is " + fName + " " + "Last Name is " + lName);

		System.out.println(fName.concat(lName));

	}

}
