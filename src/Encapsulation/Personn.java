package Encapsulation;

public class Personn {
	private String name;
	private int age;
	public String hairColur;

	public Personn () {		
	}
	public Personn (String name, int age) {
		this.name = name;
		this.age=age;
	}
	public Personn (String x, int xx, String xxx) {	
		this.name = "     ";
		this.age=xx;
		this.hairColur=xxx;
	}	
	public static void main(String[] args) {
		Personn p1 =new Personn();
		Personn p2 =new Personn("aaa", 45);
		Personn p3 =new Personn("bbb", 35, "brown");
		Person p4 =new Person("aaa", 45);
		p1.name="ccc"; 		p1.age=25; 		p1.hairColur="blue";
		
		p4.setName("qqq"); 		p4.setAge(99); 		p4.hairColour="red";
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hairColur=" + hairColur + "]";
	}
	
	

}
