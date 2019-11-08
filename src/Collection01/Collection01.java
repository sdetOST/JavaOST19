package Collection01;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection01 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Aaa AAA", "1st Str");
		Employee e2 = new Employee(102, "Baa BBB", "2nd Str");
		Employee e3 = new Employee(103, "Caa CCC", "3rd Str");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		System.out.println(empList);

		// Display Data using ArrayList
		
		System.out.println("Eployee: ");
		System.out.println("No\t|Name	\t|Address");
		System.out.println("====================================================");
		for (Employee e : empList) {
			
			System.out.println( e.eNo + "\t|" + e.name + "\t|" + e.address);
//				System.out.println("Name: " + e.name);
//				System.out.println("Address: " + e.address );
			System.out.println("----------------------------------------------------");
		}

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the person name: ");
			String name = sc.nextLine();
		
			System.out.println("Enter the person address: ");
			String address = sc.nextLine();
			
			
			
			Employee e4 = new Employee();
			e4.setName(name);
			e4.setAddress(address);
			e4.seteNo(e4.geteNo());
			empList.add(e4);
			
			Employee e5 = new Employee();
			e5.setName(name);
			e5.setAddress(address);
			e5.seteNo(e4.geteNo());
			empList.add(e5);
			
			System.out.println(empList.toString());

	}

}
