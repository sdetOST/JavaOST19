package a001;

import java.util.*;
import java.util.Map.Entry;

public class B_MapPractice001 {

	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>(); // poly

		scores.put("Ahmet", 60);
		scores.put("Mehmet", 20);
		scores.put("Firat", 60);
		scores.put("Mustafa", 40);
		scores.put("Kemal", 40);
		scores.put("Ali", 50);
		scores.put("Murat", 60);
		
		for (String ky : scores.keySet()) {
			if (scores.get(ky)==40)
				System.out.println(ky);
			
		}


//====================================================================
// Print Map
//--------------------------------------------------------------------	
		System.out.println(scores); 						// {Ahmet=60, Mustafa=40, Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}


//====================================================================	// Map is not iterable, so to get value and key 
// Print Map Keys1									// we need something iterable like set and collection	
//--------------------------------------------------------------------	 
		System.out.println(scores.keySet());				// [Ahmet, Mustafa, Mehmet, Firat, Kemal, Murat, Ali]
		System.out.println(scores.values());				// [60, 40, 20, 60, 40, 60, 50]
//--------------------------------------------------------------------
		for (String k : scores.keySet()) 
			System.out.print(k + " ");  					// Ahmet Mustafa Mehmet Firat Kemal Murat Ali 
		
//--------------------------------------------------------------------
		System.out.println();
//--------------------------------------------------------------------
		for (int v : scores.values()) 
			System.out.print(v + " ");  					//  60 40 20 60 40 60 50
//-------------------------------------------------------------------		
		System.out.println();
//--------------------------------------------------------------------	
		List<String> kys = new ArrayList<>(scores.keySet());		
		System.out.println(kys);						//[Ahmet, Mustafa, Mehmet, Firat, Kemal, Murat, Ali]
		
		List<Integer> values = new ArrayList<>(scores.values());		
		System.out.println(values);						//  [60, 40, 20, 60, 40, 60, 50]
	
		
//====================================================================
// Print Map size
//--------------------------------------------------------------------		
		System.out.println(scores.size());					// 7
		
//====================================================================
// Is empty ?   -  Boolean
//--------------------------------------------------------------------		
		System.out.println(scores.isEmpty()); 				//false
		
//====================================================================
// Clear Map
//--------------------------------------------------------------------			
//		scores.clear();
//		System.out.println(scores.isEmpty());  				//true					

//====================================================================
// Get Value
//--------------------------------------------------------------------
		System.out.println(scores.get("Mehmet"));  			//20
		System.out.println(scores.get(20)); 				//null   --we need to write our key, not value -

//====================================================================
// containsKey(Key) ?  ----> KEY  -  Boolean
//--------------------------------------------------------------------
		System.out.println(scores.containsKey("Mustafa")); 		//true
		
//====================================================================
// containsValue (value) ? ---> VALUE  -  Boolean
//--------------------------------------------------------------------
		System.out.println(scores.containsValue(40)); 			//true
		
//--------------------------------------------------------------------
		System.out.println("1111111111111111111111111111111111111"); 
//====================================================================
// void putAll  --->  look like AddAll(list, set,queue)
//--------------------------------------------------------------------
		Map<String, Integer> scores2= new HashMap <> ();
		
		scores2.put("Ayse", 70);
		scores2.put("Fatma", 80);
		scores2.put("Gul", 90);
		
		scores2.putAll(scores); 						//add all scoreMAp elements inside scoreMap2
		
		System.out.println("scores2 : "+ scores2); 			//{Ahmet=60, Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Firat=60, Kemal=40, Murat=60, Gul=90, Ali=50}
		
		
//====================================================================
// Remove( key );
//--------------------------------------------------------------------
		System.out.println(scores.remove("Ahmet")); 			// 60
		System.out.println(scores.remove("Semih")); 			//null
		
//====================================================================
// Remove( key, value );
//--------------------------------------------------------------------
		System.out.println(scores2.remove("Fatma",70));  		//false  --> Fatma-80
		System.out.println(scores2); 						//{Ahmet=60, Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Firat=60, Kemal=40, Murat=60, Gul=90, Ali=50}
		
		System.out.println(scores2.remove("Gul",90));  			// true  --> it does match --> removes Gul
		System.out.println(scores2); 						//{Ahmet=60, Mustafa=40, Ayse=70, Fatma=80, Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}
		

//--------------------------------------------------------------------
		System.out.println("2222222222222222222222222222222222222"); 
//====================================================================
// putIfAbsent(K key, V value)  ---> the key have to match exactly. if key doesn't match, it return null and add the key and value in our map
//--------------------------------------------------------------------
		System.out.println(scores.putIfAbsent("Ali",80));  		//50 --> Already exist and value is 50
		
		System.out.println(scores.putIfAbsent("Halil",90));  		//null --> Halil-90 added to map
		
		System.out.println(scores); 						//{Mustafa=40, Halil=90, Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}
		
//====================================================================
// getOrDefault(ObjectKey, V defaultvalue);
//--------------------------------------------------------------------
		System.out.println(scores2.get("Lale"));  			//return null -not exist in our list
		
		System.out.println(scores2.getOrDefault( "Lale", 100)); 	//it gives 100 -default value
		
		System.out.println(scores2.getOrDefault( "Mehmet", 100)); 	//it gives 20-Mehmet's value 

//====================================================================
// replace(Key k,V Old Value, V new Value) --> Replace value  . Need to match key and old value
//--------------------------------------------------------------------		
		System.out.println(scores2.replace("Fatma",80,15)); 	//true
		System.out.println(scores2); 					//{Mustafa=40, Ayse=70, Fatma=15, Mehmet=20, Murat=60, Ali=50}
		
		System.out.println(scores2.replace("Fatma",80,30));  	//false 
		System.out.println(scores2); 					//{Mustafa=40, Ayse=70, Fatma=15, Mehmet=20, Murat=60, Ali=50}
		
		


//---------------------------------------------------------------------
		System.out.println("33333333333333333333333333333333333");
//====================================================================	// When we try to upload our key  
// Remove key with Set					// it directly affect Map 
//--------------------------------------------------------------------	// (linked with Map)
		Set<String> keys = scores.keySet(); 				// I try to get all keys--
		System.out.println(keys); 						// [Ahmet, Mustafa, Mehmet, Firat, Kemal, Murat, Ali]
		
		keys.remove("Ahmet");
		System.out.println(scores);						// {Mustafa=40, Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}

//====================================================================	 
//Remove key and value - with Collection 							 
//--------------------------------------------------------------------	
		Collection<Integer> value = scores.values();
		System.out.println(value); 					// [40, 20, 60, 40, 60, 50]
		value.remove(40); 						// it removes key and values-- it removes Mustafa from our Map
		System.out.println(scores); 					// {Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}
		
		Collection<String> k = scores.keySet();
		System.out.println(value); 					// [40, 20, 60, 40, 60, 50]
		k.remove("Firat"); 							// it removes key and values-- it removes Mustafa from our Map
		System.out.println(scores); 					// {Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50}
		System.out.println("Firat removed");
		
		
		
//---------------------------------------------------------------------
		System.out.println("4444444444444444444444444444444444444444");		
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
		System.out.println(entries); 						// [Mehmet=20, Firat=60, Kemal=40, Murat=60, Ali=50]

		for (Entry<String, Integer> entry : entries) { 			// .getKey() -->> return the key of the entry
			System.out.print(entry.getKey()+" "); 			// Mehmet Firat Kemal Murat Ali 
		}
		System.out.println();
		
		for (Entry<String, Integer> entry : entries) {			// .getValue() -->> return the values of the entry
			System.out.print(entry.getValue()+ " "); 			// 20 60 40 60 50
		}
		System.out.println();
		
		for (Entry<String, Integer> entry : entries) {
			if (entry.getValue() < 25) {					// getValue() -->> return the value of the entry
				entry.setValue(100); 					// setValue() -->> change the value of the entry
			}
		}

		System.out.println(scores); 						// {Mehmet=100, Firat=60, Kemal=40, Murat=60, Ali=50}
	}

}

