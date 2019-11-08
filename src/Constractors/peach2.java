package Constractors;

public class peach2 {
	private String girlName;
	
	public peach2(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first gf name is %s",getName()); 

	}
}
