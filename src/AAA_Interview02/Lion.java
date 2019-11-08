package akbar;

import interview.sub.AnimalSuper;

public class Lion extends AnimalSuper {
  
  //  public int leg1 ; 
  //  protected int leg2 ;
  
  public static void main(String[] args) {
    
    // Having animal reference will not 
    // make it access protected member 
    // even in sub class , because only ref type
    // decide what you can access 
      //  AnimalSuper animal = new AnimalSuper(); 
    // THIS IS THE CORRECT WAY TO ACCESS 
    // PROTECTED MEMBER SUB CLASS OUTSIDE PACKAGE 
    // WITH SUB CLASS REFEFENCE
    Lion animal = new Lion(); 
    //AnimalSuper animal = new Lion(); 
    // what you can access with animal ref
    
    System.out.println( animal.leg1 );
    System.out.println( animal.leg2 );
//    System.out.println( animal.leg3 );
//    System.out.println( animal.leg4 );
    
    
    
    
  }
  
  
  
}
