package AAA_BasicCodings;

public class HelloPlanets01W2 {
	public static void main ( String[] args ) 
	{
		String[] planets = {"Mercury", "Venus",  "Earth",   "Mars", "Jupiter", 
	                        "Saturn",  "Uranus", "Neptune", "Pluto"};
				
		int j = 0;
		
		while ( j < planets.length) {
			
			j = j+1; 
			System.out.println("Hello " + planets[j] +"!" );
		}
	}
}