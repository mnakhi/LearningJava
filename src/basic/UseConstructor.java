package basic;

public class UseConstructor {

	// Constructor:
	// Constructor has no return type
	// Constructor name have to be same as className
	// AcessModifier constructorName(){ }

	String stName;
	String stID = "56161658";
	String admissionDate;
	int admissionFee;

	public UseConstructor() {
		// Default constructor
		System.out.println("This is Default constructor");

	}

	public UseConstructor(String sName) { // signature
		this.stName = sName;
		System.out.println(stName);

	}

	public UseConstructor(String sName, String sID) { // signature
		this.stName = sName;
		this.stID = sID;
		System.out.println(stName + " " + stID);

	}

	public UseConstructor(String sName, String sID, String sAdmission) { // signature
		this.stName = sName;
		this.stID = sID;
		this.admissionDate = sAdmission;
		System.out.println(stName + " " + stID + " " + admissionDate);

	}

	public UseConstructor(String sName, String sID, String sAdmission, int adFee) { // signature
		this.stName = sName;
		this.stID = sID;
		this.admissionDate = sAdmission;
		this.admissionFee = adFee;
		System.out.println(stName + " " + stID + " " + admissionDate + " " + adFee);

	}

	public void studentInfo() {
		System.out.println("This is Student Information Method");
	}

	public static void main(String[] args) {

		UseConstructor myObj = new UseConstructor();

		UseConstructor myobj1 = new UseConstructor("Afsana");

		UseConstructor studentMarjana = new UseConstructor("Marjana", "54649843");

		UseConstructor studentRobin = new UseConstructor("Robin", "4984664", "12/05/2019");

		UseConstructor studentShamim = new UseConstructor("Shamim", "354684", "12/06/2019", 5000);

	}

}
