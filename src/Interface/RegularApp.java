package Interface;

//Without using Abstract or interface we need to have both 
//doSomething methods for Penn and Pncil objects parameters.

class Penn{
	public void write() {
		System.out.println("i am a Pen");
	}
}

class Pncil{
	public void write() {
		System.out.println("i am a Pencil");
	}
}

class Kitt{
	public void doSomething(Penn p) {
		p.write();
	}
	public void doSomething(Pncil pc) {
		pc.write();
	}
}

public class RegularApp {
	
	public static void main(String[] args) {
		Kitt k = new Kitt();
		Penn p = new Penn();					// need to create obj p from Penn class to use it in doSomething method
		Pncil pc = new Pncil();					// need to create obj pc from Pncil class to use it in doSomething method
		
		k.doSomething(p);						// I am a Pen
		k.doSomething(pc);						// I am a Pencil
	}

}
