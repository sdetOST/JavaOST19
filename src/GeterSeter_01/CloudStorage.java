package GeterSeter_01;

public class CloudStorage {
	  private int capacity;
	  private double price;
	  private String username;
	  private String password;
	  

	  public CloudStorage(int capacity, double price, String username, String password) {
	    this.capacity = capacity;
	    this.price = price;
	    this.username = username;
	    this.password = password;
	  }
	  
	  final public void printInfo() {
	    System.out.println("Info about cloud storage..");
	  }
	  
	  final public void printInfo(String name) {
	    System.out.println("Info about cloud storage..");
	  }

	  public int getCapacity() {
	    return capacity;
	  }

	  public void setCapacity(int capacity) {
	    this.capacity = capacity;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  @Override
	  public String toString() {
	    return "CloudStorage : capacity=" + capacity + ",  price=" + price + ",  username=" + username + ",  password="
	        + password ;
	  }
public static void main(String[] args) {
	CloudStorage c1 = new CloudStorage(500, 15, "username"," password");
	
	System.out.println("c1 "+c1.toString());
	
	
	
}
	  
	  
	}
