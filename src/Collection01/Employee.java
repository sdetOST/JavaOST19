package Collection01;

public class Employee {
	
	int eNo;
	String name, address;
	

	
	
	Employee(int eNo, String name, String address) 
	{	
		this.eNo = eNo;
		this.name = name;
		this.address = address;
	}
	
// Display all data
	
//	void displayData(ArrayList<Emloyee> empList)
//	{
//		for(Emloyee e: empList)
//		{
//			System.out.println("Eployee: ");
//			System.out.println("No: /s" + e.eNo + 
//								"/s| Name: " + e.name + 
//								"/s| Address: " + e.address);
////			System.out.println("Name: " + e.name);
////			System.out.println("Address: " + e.address );
//			System.out.println("-------------------");
//		}
//		
//	}
	
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int geteNo() {
		eNo++;
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = ++eNo;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}

