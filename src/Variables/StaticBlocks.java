package Variables;

public class StaticBlocks {

	public static void main(String[] args) {
		Test t1 = new Test();
				
		int x1 = Test.count;  		// class name.variable name "Test.coun". This is have access STATIC.
		int x2 = Test.count+1;		// Because the object does not own it but the class owns the STATIC.
									// it can call STATIC even without creating any object and/or constructors.
		Test t2 = new Test();
	}
}
class Test{
	
	static int count=0;						// "static" makes ++ work inside the constructor Test below
	
	{
		count=10;													
		System.out.println("BLOCK called, count= "+ count);
	}
																	// ___it can be called by "int x=Test.count;"
	static {														// ___STATIC BLOCK called before the constructors!!!		
		count=1;													// ___it can be called by "int x=Test.count;"
		System.out.println("STATIC BLOCK called, count= "+ count);	// ___wirhout any constructor or object
	}																// ___
	static {														// ....another STATIC BLOCK.
		count++;													// ....
		System.out.println("STATIC BLOCK called, count= "+ count);	// ....
	}																// ....
	
	Test(){
	
		count++;
		System.out.println("Contractor called, count= "+ count);
	
	}
	
}
