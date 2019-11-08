package AAA_BasicCodings;

public class HelloPlanets04_Combine 
{
	public static void main ( String[] args ) 
	{
		String[] planets = {"Mercury", "Venus",  "Earth",   "Mars", "Jupiter", 
	                        "Saturn",  "Uranus", "Neptune", "Pluto"};
		
		System.out.println("There are " + planets.length + " in solar system.");
		System.out.println("Hello " + planets[0]);
		System.out.println("Hello " + planets[1]);
		System.out.println("Hello " + planets[2]);
		System.out.println("Hello " + planets[3]+","+ planets[4]+","+ planets[5] +","+ planets[6] +","+ planets[7] +","+ planets[8] + "!");
	  
	    for ( int j=0; j< planets.length; j++ )
	    {
	      System.out.println("Hello " + planets[j] +"!" );
	    }
	    for ( int j=0; j< planets.length; j++ )
	    {
	      System.out.println("Hello ");
	      System.out.println(planets[j] +"!" );
	    }
	  
	 }

}
