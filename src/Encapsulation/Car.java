package Encapsulation;

public class Car {
	String name = "toyota";

	public Car(String name) {
		this.name = "honda";
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("subaru");
		
		c1.name = "nissan";
		c1.setName("bmw");
		
		System.out.println(c1.name);
		System.out.println(c1);
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
