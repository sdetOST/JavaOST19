package Static;

public class Oca001 {
	
	static int Count = 0;
	int i = 0;
	
	public void changeCount() {
		while(i<5) {
			i++;
			Count++;
		}
	}
	

	public static void main(String[] args) {
		Oca001 one = new Oca001();
		Oca001 two = new Oca001();
		System.out.println("one i: "+ one.i+",  one count: "+ Oca001.Count);
		System.out.println("two i: "+ two.i+",  two count: "+ Oca001.Count);		
		
System.out.println("------------------------------");
		
		one.changeCount();														// i=5, Count = 5
		System.out.println("one i: "+ one.i+",  one count: "+ Oca001.Count);
		System.out.println("two i: "+ two.i+",  two count: "+ Oca001.Count);
		
System.out.println("------------------------------");

		two.changeCount();
		System.out.println("two i: "+ two.i+",  two count: "+ Oca001.Count);
		System.out.println("one i: "+ one.i+",  one count: "+ Oca001.Count);
		
		
		
		System.out.println(Oca001.Count + " : " + Oca001.Count);
	
	}


	
	

}
