package Constractors;

public class SuperclassSubclassTypecasting {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();		// regular
		Persoon p2= new Persoon();		// regular
		Student s1 = new Student();		// regular
		Student s2 = new Student();		// regular
		
		Persoon p3 = new Student();		// okay - Can call this way.but not the other way
/*		Student s3= new Persoon();		   not okay - Every student is person but not every person is student
 * 		--------->  more specific
 * 		less specific <----------
 * 		int x =! double y;				 not okay
 * 		double y = int x;				 okay
 * Than we can solve that problem with Typecasting    */
		
		Student s3 = (Student)p3;		// NOW IT WORKS
		System.out.println(s3);
	}
}
class Persoon{
	String name;
	int age;
	String address;
}
class Student extends Persoon{
	int marks;
	int rollNumber;
	
}