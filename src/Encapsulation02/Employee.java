package Encapsulation02;

public class Employee {
	 String name ="@@@";

	public Employee(String name ) {
		this.name ="aaa";
	}
	
	public static void main(String[] args) {

		Employee p1 =new Employee ("bbb" );
		
		p1.name="ccc";
		p1.setName("omer");
		
		System.out.println(p1.name);
		System.out.println(p1);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name +  "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}