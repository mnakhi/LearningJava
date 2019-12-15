package basic;

public class Car {
	String carName = "Toyota";
	String carPrice = "50000";
	static String carModel = "Camry";

	public static void main(String[] args) {

		// Object:
		// className objectName=new ConstructorOfClass();
		Car myCar = new Car(); // object created
		myCar.carName = "BMW";
		System.out.println(myCar.carPrice);
		myCar.carPrice = "60000";
		System.out.println(myCar.carPrice);
		myCar.carModel = "2018 S";

		System.out.println(Car.carModel);

		Car.carModel = "2019 S";

		Car jakiirCar = new Car();
		jakiirCar.carModel = "2020 S";
		System.out.println("*********************");
		System.out.println(jakiirCar.carModel);
		System.out.println(myCar.carModel);

	}

}
