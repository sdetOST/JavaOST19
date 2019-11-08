package Parameters;


public class ExplicitParameters {

	public static void main(String[] args) {

		MyData2 d1 = new MyData2();

		d1.display("XYZ",3, true);

	}

}
class MyData2{
	
		
	public void display(String myName, int w, boolean t) {
		
		System.out.println(myName +" "+ w +" "+ t);
	}
}


