package basic;

public class UseNonReturnMethod {

	/**
	 * Non Return Type Method It will not return anything void
	 * 
	 */

	static public void doDivision() { // class method
		int number1 = 60;
		int number2 = 20;
		int division = number1 / number2;
		System.out.println(division);

	}

	public void doDivisionNewly() {
		int number1 = 20;
		int number2 = 6;
		int division = number1 / number2;
		System.out.println(division);

	}

	public void doDivisionNewly(int num1, int num2) {

		int number1 = num1;
		int number2 = num2;
		int division = number1 / number2;
		System.out.println(division);
	}

	public void doDivisionNewly1(int num1, int num2) {

//		int number1 = num1;
//		int number2 = num2;
		int division = num1 / num2;
		System.out.println(division);
	}

	public void salaryCalcualtion(int salary) {

		double annualSalary = salary * 12;
		System.out.println(annualSalary);

	}

	public static void main(String[] args) {

		UseNonReturnMethod.doDivision();

		UseNonReturnMethod objDiv = new UseNonReturnMethod();
		objDiv.doDivisionNewly();
		objDiv.doDivisionNewly(200, 30);

	}

}
