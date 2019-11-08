package inheritance;
/*

instance filed : 
	color

1 arg constructor to set the field value 

abstract methods 

	calculatePerimeter() 
	calculateArea()  
	abstract toString() method accpet no param , return String 

sub classes 

Circle 
	radius as double 

2 args constructor to set the field values 

implement abstract methods from super class 



Rectangle 
	
	protected instance fields   width , height 

	3 args constructor to set the field values 
	implement abstract methods from super class 

create a main method in rectangle and 
	create 1 Circle and 1 Rectangle object 
	call their methods 

*/
public abstract class Shape {
	  
	  String color;
	  
	  
	  public Shape(String color) {
	    this.color=color;
	  }
	  
	  public abstract  void calculatePerimeter();
	  public abstract  double calculateArea();
	  @Override
	  public abstract String toString(); 
	  
	  
	  
	  // THE OBJECT VERSION OF TOSTRING METHOD IS NOT ABSTRACT METHOD 
	  
	  // --->> YOU CAN OVERRIDE A NON-ABSTRACT METHOD WITH ABSTRACT METHOD IF IT'S DEFINED IN ABSTRACT METHOD
	  

	}




