
package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Comparable.Laptop;

public class Runner {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<>();
		
		Laptop l1 =new Laptop("Dell", 16, 800);
		laps.add(l1);
		laps.add(new Laptop("Apple", 8, 1200));  // no need to create name l2
		laps.add(new Laptop("Acer", 12, 700));
		laps.add(new Laptop("Acer", 8, 600));
		laps.add(new Laptop("Dell", 12, 700));
		
		Comparator<Laptop> comRam = new Comparator<Laptop>()
				{	@Override
					public int compare(Laptop a, Laptop b) {				
						if (a.getRam() > b.getRam()) return 1;			//	\
						else if (a.getRam() == b.getRam()) return 0;	//	 => return a.getRam() > b.getRam()? 1 : -1 ;
						else return -1;									//	/
					}
				};
				
		Comparator<Laptop> comBrand = new Comparator<Laptop>()
				{	@Override
					public int compare(Laptop a, Laptop b) {
						return a.getBrand().charAt(0) > b.getBrand().charAt(0)? 1 : -1; 
					}
				};
				
		Comparator<Laptop> comPrice = new Comparator<Laptop>()
				{	@Override
					public int compare(Laptop a, Laptop b) {
						return a.getPrice() > b.getPrice()? 1 : -1 ;
					}
				};				
		
		Collections.sort(laps, comRam);
		for(Laptop l: laps) System.out.println(l);
		System.out.println("--------------------");
		
		Collections.sort(laps, comBrand);
		for(Laptop l: laps) System.out.println(l);
		System.out.println("--------------------");
		
		Collections.sort(laps, comPrice);
		for(Laptop l: laps) System.out.println(l);
		System.out.println("--------------------");
		
	}

}
/*-----------------------------------------------------
 * 	Laptop [brand=Apple, ram=8, price=1200]	
 * 	Laptop [brand=Acer, ram=12, price=700] 	
 * 	Laptop [brand=Dell, ram=16, price=800]
 * 
 */
