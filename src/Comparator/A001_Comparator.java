package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class A001_Comparator {

	public static void main(String[] args)  {
		List<Laptp> laps = new ArrayList<>();
		
		laps.add(new Laptp("Dell", 16, 800));
		laps.add(new Laptp("Apple", 8, 1200));  
		laps.add(new Laptp("Acer", 12, 700));
		laps.add(new Laptp("Acer", 8, 600));
		laps.add(new Laptp("Dell", 12, 700));
		

//		Comparator<Laptp> ramComp = Comparator.comparing(p -> p.ram );
//		Collections.sort(laps, ramComp);													// sort by ramSize
//		
//		Comparator<Laptp> priceComp = Comparator.comparing(p -> p.price );
//		Collections.sort(laps, priceComp);													// sort by price
		
		Comparator<Laptp> brandComp = Comparator.comparing(p -> p.brand.charAt(3) );
		Collections.sort(laps, brandComp);													// sort by brand			
		
//		Comparator<Laptp> ramThanPriceComp = ramComp.thenComparing(priceComp);				
//		Collections.sort(laps, ramThanPriceComp);											// sort by ramSize than price
//		
//		Comparator<Laptp> revRamThanPriceComp = ramComp.reversed().thenComparing(priceComp);	// sort by reverseRamSize than price
//		Collections.sort(laps, revRamThanPriceComp);
		
		
		for(Laptp l: laps) System.out.println(l);
	

	}
}


class Laptp{
	
	 String brand;
	 int ram;
	 int price;
	
	

	public Laptp(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	

}