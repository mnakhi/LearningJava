package basic;

public class UseCasting {

	// Casting: converting Data type

	public static void main(String[] args) {
		double salary = 5000.500;
		int newSalary = (int) salary;
		int number = (int) 60.75;

		byte x = (byte) 130;

		System.out.println(newSalary);
		System.out.println(number);
		System.out.println(x);
	}

}
