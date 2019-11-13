package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<>();
		
		Laptop l1 =new Laptop("Dell", 16, 800);
		laps.add(l1);
		laps.add(new Laptop("Apple", 8, 1200));  // no need to create name l2
		laps.add(new Laptop("Acer", 12, 700));
		laps.add(new Laptop("Acer", 8, 600));
		laps.add(new Laptop("Dell", 12, 700));
		
		Collections.sort(laps);
		
		for(Laptop l: laps) System.out.println(l);
		
	}

}
/*-----------------------------------------------------
 * 	Laptop [brand=Apple, ram=8, price=1200]	
 * 	Laptop [brand=Acer, ram=12, price=700] 	
 * 	Laptop [brand=Dell, ram=16, price=800]
 * 
 */
