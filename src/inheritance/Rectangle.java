package inheritance;

class Rectangle extends Shape{
	  
	  int width;
	  int height;
	  public Rectangle(String color, int width, int height) {
	    super(color);
	    this.width = width;
	    this.height = height;
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    
	    Rectangle s1 = new Rectangle("Red", 7, 10); 
	    s1.calculatePerimeter();
	    
	    System.out.println(  s1.calculateArea()   );
	    System.out.println(s1);
	    
	    
	    Circle s2 = new Circle("red" , 10) ; 
	    System.out.println(s2);
	    s2.calculatePerimeter();
	    System.out.println(  s2.calculateArea()   );
	    
	  }
	  
	  
	  @Override
	  public void calculatePerimeter() {
	    System.out.println("Perimeter is: "+(2*width+2*height));
	    
	  }
	  @Override
	  public double calculateArea() {
	    return width*height;
	    
	  }
	  @Override
	  public String toString() {
	    return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", calculateArea()="
	        + calculateArea() + "]";
	  }
	    
	}
