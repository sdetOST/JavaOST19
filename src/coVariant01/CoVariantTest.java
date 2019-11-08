package coVariant01;

public class CoVariantTest {

	public static void main(String[] args) {

		DoctorTester dt1 = new DoctorTester();
		Doctor doctor1 = dt1.getPerson();

		PersonTester pt1 = new DoctorTester();
		// at compile time what method pt1 can access
		// the PersonTester version of getPerson

		Person person1 = pt1.getPerson(); //

		// in order to cast safely we can use
		// instanceof keywrod to check for Type of object
		
		if (person1 instanceof Doctor) {
			Doctor doctor2 = (Doctor) person1;
		} else {
			System.out.println("Not A Doctor object");
		}

		Doctor person2 = (Doctor) pt1.getPerson();

		// at runtime which method will be invoked
		// the DoctorTester version of getPerson

	}
}

class Doctor extends Person {

}

class Person {

}
