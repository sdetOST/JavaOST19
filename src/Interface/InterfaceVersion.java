package Interface;

//If we use interface instead abstract we can inherit another class to Pin and Pincil

interface Write{
	void write();										// by default public abstract		
}

class Pin implements Write {							// besides implement we can extends any Parent class here too
	public void write() {								// class Pen extends classX implements Writer
		System.out.println("write with a Pen");
	}
}
	
class Pincil implements Write{							// besides implement we can extends any Parent class here too
	public void write() {								// class Pincel extends classX implements Writer
		System.out.println("write with a Pencil");
	}
}
class Kt{
	public void doSomething(Write p) {
		p.write();
	}
}
public class InterfaceVersion {
	
	public static void main(String[] args) {
		Kt k = new Kt();
		Write p = new Pin();						// need to create obj p from Write (reference) class to use it in doSomething method
		Write pc = new Pincil();					// need to create obj p from Write (reference) class to use it in doSomething method
		
		k.doSomething(p);							// write with a Pen
		k.doSomething(pc);							// write with a Pencil
		
	}

}
