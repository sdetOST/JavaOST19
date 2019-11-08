package Encapsulation;

public class Employee {

	private String name ="@@@";
	private int age=10;
	String hairColour="black";
	int hight; 
		
	public Employee(String x, int age, String xxx, int hight) {
		this.name = name;
		this.age = age;
		this.hairColour = hairColour;
		this.hight = hight;
	}
	
	public static void main(String[] args) {

		Employee p1 =new Employee ("aaa", 20 , "blue" , 170);
		Employee p2 =new Employee ("bbb", 30,"yellow",180 );

		p1.name="ccc";
		System.out.println(p1);

		p1.setName("omer");
		System.out.println(p1.name);
		p1.age=40;
		p1.hairColour="green";
		
		System.out.println(p1);
		System.out.println(p2);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", hairColour=" + hairColour + ", hight=" + hight + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	

}