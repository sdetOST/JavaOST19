package Array;

public class Laptop01_01 implements Comparable<Laptop01_01> {

	private String brand;
	private int ram;
	private int price;
	
	
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @param brand
	 * @param ram
	 * @param price
	 */
	public Laptop01_01(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public int compareTo(Laptop01_01 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
