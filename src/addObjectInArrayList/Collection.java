package addObjectInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
	
	
	
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Aaa AAA","1st Str"); 
		Employee e2 = new Employee(102,"Baa BBB","2nd Str"); 
		Employee e3 = new Employee(103,"Caa CCC","3rd Str"); 
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList);
		
		// Display Data using ArrayList
		
		for(Employee e: empList)
		{
			System.out.println("Eployee: ");
			System.out.println("No: /s" + e.eNo + 
								"/s| Name: " + e.name + 
								"/s| Address: " + e.address);
//			System.out.println("Name: " + e.name);
//			System.out.println("Address: " + e.address );
			System.out.println("-------------------");
		}
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the person name: ");
//		String name = sc.nextLine();
//
//		System.out.println("Enter the person address: ");
//		String address = sc.nextLine();
//		
//		e.setName(name);
//		e.setAddress(address);


		
		


	}

}
