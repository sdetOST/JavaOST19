package Collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class A001_SortedMap {

	public static void main(String[] args) {

		SortedMap<String, Integer> scores = new TreeMap<>(); 

		scores.put("Ahmet", 60);
		scores.put("Mehmet", 20);
		scores.put("Firat", 60);
		scores.put("Mustafa", 40);
		scores.put("Kemal", 40);
		scores.put("Ali", 50);
		scores.put("Murat", 100);
		scores.put("Murat", 60);	
		
		System.out.println(scores); 						// {Ahmet=60, Ali=50, Firat=60, Kemal=40, Mehmet=20, Murat=60, Mustafa=40}
		
		System.out.println(scores.firstKey()); 				// Ahmet
		System.out.println(scores.lastKey()); 				// Mustafa
		
		System.out.println(scores.headMap("Kemal")); 			// {Ahmet=60, Ali=50, Firat=60}
		System.out.println(scores.tailMap("Kemal")); 			// {Kemal=40, Mehmet=20, Murat=60, Mustafa=40}
		
		System.out.println(scores.subMap("Ali", "Murat")); 		// {Ali=50, Firat=60, Kemal=40, Mehmet=20}


	}

}
