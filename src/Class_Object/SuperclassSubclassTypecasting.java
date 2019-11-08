package Class_Object;

public class SuperclassSubclassTypecasting {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();		// regular
		Persoon p2= new Persoon();		// regular
		Student s1 = new Student();		// regular
		Student s2 = new Student("Bbb",22,"Bbb Street");		// regular
		Student s2 = new Student(
		
		Persoon p3 = new Student();		// okay - Can call this way.but not the other way
/*		Student s3= new Persoon();		   not okay - Every student is person but not every person is student
 * 		--------->  more specific
 * 		less specific <----------
 * 		int x =! double y;				 not okay
 * 		double y = int x;				 okay
 * Than we can solve that problem with Typecasting    */

		
		p1.setName("Aaa");
		p1.setAddress("Aaa Street");
		p1.setAge(32);
		System.out.println(p1.toString());
		
		s1.setName("Stt");
		s1.setAddress("Stt Street");
		s1.setAge(20);
		s1.setRollNumber(101);
		s1.setMarks(93);
		System.out.println(s1.toString());
		
		p3.setName("Pss");
		p3.setAge(21);
		p3.setAddress("Pss Street");
		System.out.println(p3.toString());
		
		
		Student s3 = (Student)p3;		// NOW IT WORKS
		System.out.println(s3.toString());
	
		s3.setMarks(100);
		s3.setRollNumber(102);
		System.out.println(s3.toString());
		
		System.out.println(s2.toString());
		
		
	}
}
class Persoon{
	String name;
	int age;
	String address;
	public Persoon() {
		Persoon(name, age, address);
		
	}
	public Persoon(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Persoon [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
}
class Student extends Persoon{
	int marks;
	int rollNumber;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}
	public Student(int marks, int rollNumber) {
		super();
		this.marks = marks;
		this.rollNumber = rollNumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", rollNumber=" + rollNumber + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}



	
}
