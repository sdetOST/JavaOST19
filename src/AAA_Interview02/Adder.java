package akbar;

public class Adder {

	  int num ;
	  
	  public Adder add(int x) {
	    this.num = this.num + x ; 
	    //return new Adder() ;
	    // this keyword represent 
	    // current instance of the object 
	    // being worked on 
	    // and we can use below to return same object 
	    // after making modification to the object
	    return this ; 
	  }
	  
	  // create a method called substract 
	  // it accept one int as paramter 
	  // and it return current instance of the Adder
	  // being worked on
	  public Adder substract(int y){
	    
	    this.num = this.num - y ; 
	    return this ; 
	  }
	  
	  
	  
	  public void printNum() {
	    System.out.println(num);
	    
	  }
	}
