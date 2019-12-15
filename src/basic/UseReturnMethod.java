package basic;

public class UseReturnMethod {

	/**
	 * Variable: Method: Return Method: Non Return Method
	 * 
	 */

	// Return Method:
	// AccessModifier ReturnType NameOfMethod(){ // body of the method }
	// Method Name: verb+Noun

	// Non Parametarized Return Method
	public int doSummation() {
		// Method body
		// Non Dynamic Method
		int number1 = 50;
		int number2 = 60;
		int sum = number1 + number2;
		System.out.println(sum);
		return sum;
	}

	// Parametarized Return Method
	public int doMultiply(int num1, int num2) {
		int number1 = num1;
		int number2 = num2;
		int multiply = number1 * number2;
		System.out.println(multiply);

		return multiply;
	}

	public static void main(String[] args) {
		// create object
		UseReturnMethod objSum = new UseReturnMethod();
		objSum.doSummation();
		objSum.doMultiply(25, 30);
		objSum.doMultiply(15, 3);

	}

}
