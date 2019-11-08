package Method;

public class StaticMethod01 {

	public static void main(String[] args) {
		

	}

}
class Person{
	
	String name;
	String address;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
//--------------------------------------------------------------------------	
//	Static method does not work with instance variables
//	It does use the parameter variables, which are not related to the object (Person)
//	And have general meanings like calculating the ages. 
//	This kind of methods are not specifically related to the certain object. Than we should use static method.
//	if we use use instant parameter for the object (such in Person2) than the method should be not static 
	
	public static void calculateAge(int day, int month,int year) {
		
		/* find the current date 		
		 * convert it in to days,months,years 
		 * find the birthday 
		 * convert the difference to years and months */
	}
}
class Person2{
	
	String name;
	String address;
	int day;
	int month;
	int year;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

//	if we use use instant parameter for the object (such in Person2) than the method should be not static 
	public /*static*/ void calculateAge() {			//eliminate static to be able work with instant variables above in class Person2
		
		/* find the current date 		
		 * convert it in to days,months,years 
		 * find the birthday 
		 * convert the difference to years and months */
	}
}