package basic;

public class Test {

	public static void main(String[] args) {

		AccessModifier ac = new AccessModifier();
		ac.studentName = "James William";
		System.out.println(ac.studentName);
		// ac.studentContactNumber="654684"; // Private Variable
		ac.studentID = "stID101566";
		System.out.println(ac.studentID);

	}

}
