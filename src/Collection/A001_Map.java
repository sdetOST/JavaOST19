package Collection;

import java.util.*;
import java.util.Map.Entry;

public class A001_Map {

	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>(); 

		scores.put("Ahmet", 60);
		scores.put("Mehmet", 20);
		scores.put("Firat", 60);
		scores.put("Mustafa", 40);
		scores.put("Kemal", 40);
		scores.put("Ali", 50);
		scores.put("Murat", 100);
		scores.put("Murat", 60);			// updated Murat 100 to 60
		
//====================================================================
// Get Value
//--------------------------------------------------------------------
		System.out.println(scores.get("Mehmet"));  			// 20
		System.out.println(scores.get(20)); 				// null   --we need to write our key, not value -

//====================================================================
// containsKey(Key) ?  ----> KEY  -  Boolean
//--------------------------------------------------------------------
		System.out.println(scores.containsKey("Mustafa")); 		// true
		
//====================================================================
// containsValue (value) ? ---> VALUE  -  Boolean
//--------------------------------------------------------------------
		System.out.println(scores.containsValue(40)); 			// true
		
//====================================================================
// Map size
//--------------------------------------------------------------------		
		System.out.println(scores.size());					// 7
		
//====================================================================
// Is empty ?   -  Boolean
//--------------------------------------------------------------------		
		System.out.println(scores.isEmpty()); 				// false
		

//====================================================================
// Print Map
//--------------------------------------------------------------------	
		System.out.println(scores); 						// {Ahmet=60, Mustafa=40, Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}
		System.out.println(scores.keySet());				// [Ahmet, Mustafa, Mehmet, Firat, Kemal, Murat, Ali]
		System.out.println(scores.values());				// [60, 40, 20, 60, 40, 60, 50]
		
// Print keys, using loop----------------------------------------------
		
		for (String k : scores.keySet()) 
			System.out.print(k + " ");  					// Ahmet Mustafa Mehmet Firat Kemal Murat Ali 
		System.out.println();

// Print values, using loop----------------------------------------------
		
		for (int v : scores.values()) 
			System.out.print(v + " ");  					//  60 40 20 60 40 60 50
		System.out.println();
		
//====================================================================	
// Print Specific Keys	- Values								
//--------------------------------------------------------------------	
		for (String ky : scores.keySet()) {					// Mustafa, Kemal, 
			if (scores.get(ky)==40)
				System.out.print(ky+", ");
		}
//-------------------------------------------------------------------
		System.out.println();
//-------------------------------------------------------------------
		for (String ky : scores.keySet()) {					 
			if (scores.get(ky) > 40) {
				System.out.print(ky+":"+scores.get(ky)+", ");		// Ahmet: 60, Firat: 60, Murat: 60, Ali: 50,
			}
		}
//-------------------------------------------------------------------
		System.out.println();
//-------------------------------------------------------------------
//	locate key and update (replace)  its value
//-------------------------------------------------------------------
		for (String kyy : scores.keySet()) {					
			if (scores.get(kyy)==40)					// Mustafa and Kemal values updated 40 to 50 
				scores.put(kyy,50);					
		}
		System.out.println(scores);						// {Ahmet=60, Mustafa=50, Mehmet=20, Firat=60, Kemal=50, Murat=60, Ali=50}
		
		
//====================================================================
// Clear Map
//--------------------------------------------------------------------			
//		scores.clear();
//		System.out.println(scores.isEmpty());  				//true					


		System.out.println("1111111111111111111111111111111111111"); 
//====================================================================
// void putAll  --->  look like AddAll(list, set,queue)
//--------------------------------------------------------------------
		Map<String, Integer> scores2= new HashMap <> ();
		
		scores2.put("Ayse", 70);
		scores2.put("Fatma", 80);
		scores2.put("Gul", 90);
		System.out.println(scores2);					//  {Ayse=70, Fatma=80, Gul=90} 
 
		scores2.putAll(scores); 					//  add all scores map elements into scores2 map  (scores2 += scores)
		System.out.println(scores2); 					//  {Ahmet=60, Mustafa=50, Ayse=70, Fatma=80, Mehmet=20, 
											//	Firat=60, Kemal=50, Murat=60, Gul=90, Ali=50}

		
//====================================================================
// Remove( key );
//--------------------------------------------------------------------
		System.out.println(scores.remove("Ahmet")); 			// 60
		System.out.println(scores.remove("Semih")); 			// null
		
//====================================================================
// Remove( key, value );
//--------------------------------------------------------------------
		System.out.println(scores2.remove("Fatma",70));  		// false  --> Fatma-80 -- NO (100%)  MACH --> can't remove   
		System.out.println(scores2); 						// {Ahmet=60, Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, 
												//         Firat=60, Kemal=40, Murat=60, Gul=90, Ali=50}
		
		System.out.println(scores2.remove("Gul",90));  			// true  --> it does match --> removes Gul
		System.out.println(scores2); 						// {Ahmet=60, Mustafa=50, Ayse=70, Fatma=80, Mehmet=20, 
												//        		 Firat=60, Kemal=50, Murat=60, Ali=50}
		

//--------------------------------------------------------------------
		System.out.println("2222222222222222222222222222222222222"); 
//====================================================================
// putIfAbsent(K key, V value)  ---> the key have to match exactly. if key doesn't match, it return null and add the key and value in our map
//--------------------------------------------------------------------
		System.out.println(scores.putIfAbsent("Ali",80));  		// 50 --> Already exist and value is 50
		
		System.out.println(scores.putIfAbsent("Halil",90));  		// null --> Halil-90 added to map
		
		System.out.println(scores); 						// {Mustafa=50, Halil=90, Mehmet=20, Firat=60, Kemal=50, Murat=60, Ali=50}
		 
//====================================================================
// getOrDefault(ObjectKey, V defaultvalue);
//--------------------------------------------------------------------
		System.out.println(scores2.get("Lale"));  			// null --> not exist in our list
		
		System.out.println(scores2.getOrDefault( "Lale", 100)); 	// it gives 100 --> default value  because Lale does not exist in scores2
		
		System.out.println(scores2.getOrDefault( "Mehmet", 100)); 	// it gives 20-Mehmet's value because Mehmet does exist in scores2

		System.out.println("333333333333333333333333333333333333333"); 		
//====================================================================
// replace(Key k, V new Value) --> Replace value  		
// replace(Key k,V Old Value, V new Value) --> Replace value  . Need to match key and old value
//--------------------------------------------------------------------	
		System.out.println(scores2.replace("Fatma",100)); 		//  80  ---> 80 replace by 100
		System.out.println(scores2); 						//  {Ahmet=60, Mustafa=50, Ayse=70, Fatma=100, Mehmet=20, 
												//                    Firat=60, Kemal=50, Murat=60, Ali=50}					
		
		System.out.println(scores2.replace("Fatma",100,15)); 		//  true --> Fatma:100  --> 100 replaced by 15
		System.out.println(scores2); 						//  {Ahmet=60, Mustafa=50, Ayse=70, Fatma=15, Mehmet=20, 
												//                  Firat=60, Kemal=50, Murat=60, Ali=50}
		
		System.out.println(scores2.replace("Fatma",80,30));  		//  false --> Fatma:15  --> NO REPLACEMENT
		System.out.println(scores2); 						//  {Mustafa=40, Ayse=70, Fatma=15, Mehmet=20, Murat=60, Ali=50}
		

//---------------------------------------------------------------------
		System.out.println("4444444444444444444444444444444444444444");
//====================================================================	// When we try to upload our key  
// Remove key with Set									// it directly affect Map 
//--------------------------------------------------------------------	// (linked with Map)
		Set<String> keys = scores.keySet(); 				
		System.out.println(keys); 						// [Mustafa, Halil, Mehmet, Firat, Kemal, Murat, Ali]
		
		scores.keySet().remove(Key)
		keys.remove("Firat");							// Firat has been removed from keys AND ALSO SCORES  (keys Set is linked with scores Map)
		System.out.println(keys); 						// [Mustafa, Halil, Mehmet, Kemal, Murat, Ali]
		System.out.println(scores);						// {Mustafa=50, Halil=90, Mehmet=20, Kemal=50, Murat=60, Ali=50}

//====================================================================	 
//Remove key and value - with Collection 							 
//--------------------------------------------------------------------	

		Collection<String> ks = scores.keySet();
		System.out.println(ks); 					// [Mustafa, Halil, Mehmet, Kemal, Murat, Ali]
		ks.remove("Murat"); 						// it removes Murat from ks and also from map-scores at the same time
		System.out.println(ks); 					// [Mustafa, Halil, Mehmet, Kemal, Ali]

		System.out.println(scores); 					// {Mustafa=50, Halil=90, Mehmet=20, Kemal=50, Ali=50}
											// Murat has been removed from ks AND ALSO SCORES  (ks Collection is linked with scores Map) 
		
		Collection<Integer> vals = scores.values();
		System.out.println(vals); 					// [50, 90, 20, 50, 50]
		vals.remove(50); 							// it removes first 50 vals (Mustafa) and also from map-scores at the same time
		System.out.println(vals);					// [90, 20, 50, 50]					
		System.out.println(scores);					// {Halil=90, Mehmet=20, Kemal=50, Ali=50}
		
		
				
//---------------------------------------------------------------------
		System.out.println("555555555555555555555555555555555555555555");		
//====================================================================	  
// Set<Map.Entry<K, V>> entrySet()
//--------------------------------------------------------------------
// 	Map is not an Iterable so we can not iterate over them 
// 	However we can get entrySet view out of the map 
// 	and it will store the keyValue pair as single Entry 
// 	and store it into the Set of Entry<KeyType, ValueType>
//	
//	Entry has 3 useful method to get the information in the map
//--------------------------------------------------------------------
		
		Set<Entry<String, Integer>> entries = scores.entrySet();
		System.out.println(entries); 						// [Halil=90, Mehmet=20, Kemal=50, Ali=50]

		for (Entry<String, Integer> entry : entries) { 			// .getKey() -->> return the key of the entry
			System.out.print(entry.getKey()+" "); 			// Halil Mehmet Kemal Ali 
		}
		System.out.println();
		
		for (Entry<String, Integer> entry : entries) {			// .getValue() -->> return the values of the entry
			System.out.print(entry.getValue()+ " "); 			// 90 20 50 50 
		}
		System.out.println();
		
		for (Entry<String, Integer> entry : entries) {
			if (entry.getValue() < 25) 					// getValue() -->> return the value of the entry
				entry.setValue(100); 					// setValue() -->> change the value of the entry
		}

		System.out.println(scores); 						// {Halil=90, Mehmet=100, Kemal=50, Ali=50}
		

		
//====================================================================
// MapKeys to ArrayList  - MapValues to ArrayList
//-------------------------------------------------------------------		
		List<String> kys = new ArrayList<>(scores.keySet());		
		System.out.println(kys);							// [Halil, Mehmet, Kemal, Ali]
		
		List<Integer> values = new ArrayList<>(scores.values());		
		System.out.println(values);							//  [90, 100, 50, 50]
		
//====================================================================
// Useing Method -  removeItemFromMapByValue 
//--------------------------------------------------------------------
		
		System.out.println(scores); 							// {Halil=90, Mehmet=100, Kemal=50, Ali=50}
		
		System.out.println(updateValues(scores, 50 , 555));	 		// {Halil=90, Mehmet=100, Kemal=555, Ali=555}
		
		System.out.println(updateValues2(scores, 555 , 555555));	 	// {Halil=90, Mehmet=100, Kemal=555, Ali=555}

		
		System.out.println(removeItemFromMapByValue(scores, 555555));	// {Halil=90, Mehmet=100}
		
		
//==============================================================================
// SortedMap -- TreeMap+ 
//------------------------------------------------------------------------------		
		SortedMap<String, Integer> sortedScores = new TreeMap<>(scores2); 
		
		System.out.println(sortedScores);					// {Ahmet=60, Ali=50, Ayse=70, Fatma=15, Firat=60, Kemal=50, Mehmet=20, Murat=60, Mustafa=50}
					
		
		System.out.println(sortedScores.firstKey()); 			// Ahmet
		System.out.println(sortedScores.lastKey()); 			// Mustafa
		
		System.out.println(sortedScores.headMap("Kemal")); 		// {Ahmet=60, Ali=50, Ayse=70, Fatma=15, Firat=60}
		System.out.println(sortedScores.tailMap("Kemal")); 		// {Kemal=50, Mehmet=20, Murat=60, Mustafa=50}
		
		System.out.println(sortedScores.subMap("Ali", "Kemal")); 	// {Ali=50, Ayse=70, Fatma=15, Firat=60}
		
		
	
		
	}
	
	
	
	
	
	
	
//====================================================================
// update Item values by value Method
//-------------------------------------------------------------------
	
	public static Map<String, Integer> updateValues(Map<String, Integer> map, int value, int newvalue ){
		for (String ky : map.keySet()) {					
			if ( map.get(ky) == value )					
				map.put( ky, newvalue);					
		}
		return map;

	}
	
	public static Map<String, Integer> updateValues2(Map<String, Integer> map, int value, int newvalue ){
		Set<Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			if (entry.getValue() == value) 					
				entry.setValue(newvalue); 					
		}
		return map;
	}
	

	
//====================================================================
// Remove Item from map by value Method
//-------------------------------------------------------------------	
	public static Map<String, Integer> removeItemFromMapByValue(Map<String, Integer> map, int value ){
		Map<String, Integer> copyOfmap = new HashMap<>(map);
		for (String s : copyOfmap.keySet())
			if (copyOfmap.get(s) == value)
				map.remove(s);
		return map;
	}
	



}

