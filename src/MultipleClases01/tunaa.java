package MultipleClases01;

public class tunaa {
	private String girlName;
	public void setName(String xxx) {
		girlName = xxx;
	}
	public String getName(){
		return girlName;
	}
	public void saying() {
		System.out.printf("your first gf was %s",getName()); 
		System.out.printf("\nyour first gf was %s",girlName);

	}
}
