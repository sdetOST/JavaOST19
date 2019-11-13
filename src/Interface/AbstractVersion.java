package Interface;

abstract class Writer{
	public abstract void write();
}

class Pen extends Writer{
	public void write() {
		System.out.println("write with a Pen");
	}
}

class Pencil extends Writer{
	public void write() {

		System.out.println("write with a Pencil");
	}
}

class Kit{
	public void doSomething(Writer p) {
		p.write();
	}
}

public class AbstractVersion {
	
	public static void main(String[] args) {
		Kit k = new Kit();
		Writer p = new Pen();					// need to create obj p from Writr (reference) class to use it in doSomething method
		Writer pc = new Pencil();				// need to create obj p from Writr (reference) class to use it in doSomething method
		
		k.doSomething(p);						// write with a Pen
		k.doSomething(pc);						// write with a Pencil

	}

}
