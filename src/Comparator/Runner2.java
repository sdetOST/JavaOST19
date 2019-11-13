package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner2 {

	public static void main(String[] args) {
		
		List<Laptp> laps = new ArrayList<>();
		
		Laptp l1 =new Laptp("Dell", 16, 800);
		laps.add(l1);
		laps.add(new Laptp("Apple", 8, 1200));  // no need to create name l2
		laps.add(new Laptp("Acer", 12, 700));
		laps.add(new Laptp("Acer", 8, 600));
		laps.add(new Laptp("Dell", 12, 700));
		

System.out.println("--- sort by ramSize option1 --------");
		Comparator<Laptp> ramComparator = Comparator.comparing(p -> p.ram );
		Collections.sort(laps, ramComparator);			
		
		for(Laptp l: laps) System.out.println(l);

//System.out.println("--- sort by ramSize option2 ---------");		
//		Comparator<Laptop> ramComparator2 = ( o1, o2) -> Integer.compare(o1.ram, o2.ram);			
//		Collections.sort(laps, ramComparator2);
//		
//		for(Laptop l: laps) System.out.println(l);		
			
		
System.out.println("--- sort by price ----------------");
		Comparator<Laptp> priceComparator = Comparator.comparing(p -> p.price );
		Collections.sort(laps, priceComparator);			
		
		for(Laptp l: laps) System.out.println(l);
		
System.out.println("--- sort by brand option1 -----------");
		Comparator<Laptp> brandComparator = Comparator.comparing(p -> p.brand );
		Collections.sort(laps, brandComparator);			
		
		for(Laptp l: laps) System.out.println(l);
		
//System.out.println("--- sort by brand2 option2-------------");		
//		Comparator<Laptop> brandComparator2 = ( o1, o2) -> o1.brand.compareTo(o2.brand) ;			// ascending
//		Collections.sort(laps, brandComparator2);
//		
//		for(Laptop l: laps) System.out.println(l);
		
		
System.out.println("--- sort by ramSize than price ---------");		
		Comparator<Laptp> ramThanPriceComparator = ramComparator.thenComparing(priceComparator);				// ascending both
		Collections.sort(laps, ramThanPriceComparator);
		for(Laptp l: laps) System.out.println(l);
			
System.out.println("--- sort by reverse-ramSize than price ---------");		
		Comparator<Laptp> revRamThanPriceComparator = ramComparator.reversed().thenComparing(priceComparator);				// ascending both
		Collections.sort(laps, ramThanPriceComparator);
		for(Laptp l: laps) System.out.println(l);

System.out.println("--- sort by ramSize than reverse-price ---------");		
		Comparator<Laptp> ramThanRevPriceComparator = ramComparator.thenComparing(priceComparator.reversed());				// ascending both
		Collections.sort(laps, ramThanPriceComparator);
		for(Laptp l: laps) System.out.println(l);


System.out.println("--- sort by ramSize than price reverse ---------");		
		Comparator<Laptp> ramThanPriceComparatorReverse = ramComparator.thenComparing(priceComparator).reversed();				// ascending both
		Collections.sort(laps, ramThanPriceComparator);
		for(Laptp l: laps) System.out.println(l);		
		
		
	}
}
		



/*-----------------------------------------------------
 * 
 * 	
 * 
 */
