package AAA_BasicCodings;
public class HelloPlanets03 {
	
	public static void main ( String[] args ) 
	{
		String[] planets = {"Mercury", "Venus",  "Earth",   "Mars", "Jupiter", 
	                        "Saturn",  "Uranus", "Neptune", "Pluto"};
		String x = "xxx, yyy";

		
	    for ( int j=8; j< planets.length; j++ )
	    {
	      System.out.println("Hello ");
	      System.out.println(planets[j] +"!" );
	      System.out.println(x);
	    }
	  
	}

}
