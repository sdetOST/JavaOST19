package Method;

public class pearA {
	
	private String girlName;
	
	public void setName(String name) {
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first gf name is %s",getName()); 
		System.out.printf("\nYour first gf name is %s",girlName);

	}
}

