package coVariant01;

public class PersonTester {
  
	  // a method that return a Person object 
	  public Person getPerson() {
	    System.out.println("PersonTester getPerson");
	    return new Person(); 
	  }  
	}
	class DoctorTester extends PersonTester{
	  
	//  @Override
	//  public Person getPerson() {
//	    System.out.println("DoctorTester getPerson");
//	    return  new Doctor(); 
	//  }  
	  // overriding method can have sub class type 
	  // of super class return type 
	  // this is called covariant return type 
	  @Override
	  public  Doctor  getPerson() {
	    System.out.println("DoctorTester getPerson");
	    return new Doctor(); 
	  }
	  
	}