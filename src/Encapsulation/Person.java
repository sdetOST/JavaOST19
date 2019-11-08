package Encapsulation;

public class Person {
	static private String name ="@@@";
	private int age=10;
	public String hairColour="black";
	int hight; 

	public Person(String name, int age) {
		Person.name="aaa";						//		this.setName(name);
		this.age=20;										//this.setAge(age);
	}
	public Person (String x, int xx, String xxx, int hight) {	
		Person.name = "     ";
		this.age=xx;
//		this.hairColour=hairColour;
		this.hight = hight;
	}
		
	public static void main(String[] args) {

		Person p1 =new Person("bbb", 30);
		Person p2 =new Person("bbb", 35,"yellow",180 );
		System.out.println(p1);
		Person.name="ccc";
		p1.setName("omer");
		p1.age=40;
//		p1.hairColur="green";
		
		System.out.println(p1);
		System.out.println(p2);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hairColour=" + hairColour + ", hight=" + hight + "]";
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
	
	

}
