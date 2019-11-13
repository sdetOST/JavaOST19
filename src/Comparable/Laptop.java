package Comparable;

import java.util.Collections;

/* 
 *    Sort any list by any attribute ==> see options below
 * 1. implement implements Comparable interface
 * 2. override compareTo(class x) method
 * 3. in runner(main method) implement Collections.sort(list);
 * 
 *  related class is Comparable.Runner
 */
public class Laptop implements Comparable<Laptop>{
	
	private String brand;
	private int ram;
	private int price;
	
	

	public Laptop(String brand, int ram, int price) {
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

//=========================================================================
// Option 1 ==> compare ram
//-------------------------------------------------------------------------	
//	@Override   
//	public int compareTo(Laptop x) {
//		if (this.ram > x.getRam()) return 1;
//		else if (this.ram == x.getRam()) return 0;
//		else return -1;
//	}
	
//=========================================================================
// Option 2A ==> compare ram
//-------------------------------------------------------------------------	
//	@Override
//	public int compareTo(Laptop o) {
//		return (Integer.compare(this.ram, o.ram) );	
//	}
//=========================================================================
// Option 2B ==> sort brandName than ramSize
//-------------------------------------------------------------------------		
//	@Override
//	public int compareTo(Laptop o) {
//		return (this.brand.compareTo(o.brand) ) == 0 ? Integer.compare(this.ram, o.ram) : this.brand.compareTo(o.brand);    // sort name than age
//	}
//=========================================================================
// Option 2C ==> sort brandName than ramSize than price
//-------------------------------------------------------------------------			
	@Override
	public int compareTo(Laptop o) {
		return (this.brand.compareTo(o.brand) ) == 0 ? 
					( Integer.compare(this.ram, o.ram) == 0 ? Integer.compare(this.price, o.price)
					:Integer.compare(this.ram, o.ram))
					: this.brand.compareTo(o.brand);
	}
//=========================================================================
// Option 2C ==> sort price than ramSize than brandName
//-------------------------------------------------------------------------			
//	@Override
//	public int compareTo(Laptop o) {
//		return (Integer.compare(this.price, o.price) ) == 0 ? 
//					( Integer.compare(this.ram, o.ram) == 0 ? 
//							this.brand.compareTo(o.brand)
//									:Integer.compare(this.ram, o.ram))
//					: Integer.compare(this.price, o.price);
//	}
	
	

}
