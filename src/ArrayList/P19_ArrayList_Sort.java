package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class P19_ArrayList_Sort {

	public static void main(String[] args) {
		
		ArrayList<Double> myDbListA = new ArrayList<Double>();		// create new array list
		ArrayList<Double> myDbListB = new ArrayList<Double>();		// copy list													// "add" some values to list 
		
		myDbListA.add(10.00); myDbListA.add(100.00); myDbListA.add(50.0); myDbListA.add(50.5);			
		
		System.out.println(myDbListA);
		myDbListB.addAll(myDbListA);
		System.out.println(myDbListB);
		myDbListB.addAll(myDbListA);
		System.out.println(myDbListB);
		
		System.out.println("-------------------------------------");
		
		Collections.sort(myDbListA);
		System.out.println(myDbListA);								// sorted list

	}
}
