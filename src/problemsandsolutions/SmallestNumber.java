package problemsandsolutions;

public class SmallestNumber {

//	Write a Java method to find the smallest number among three numbers.
//
//	Test Data:
//	Input the first number: 35
//	Input the Second number: 47
//	Input the third number: 24

	public static void main(String[] args) {

		SmallestNumber sm = new SmallestNumber();
		System.out.println(sm.smallestNumber());

	}

	public int smallestNumber() {

		int number1 = 35;
		int number2 = 47;
		int number3 = 24;
		// Math.min();

		return Math.min(Math.min(number1, number2), number3);
	}

}
