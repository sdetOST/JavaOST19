package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda_001 {
// Functional Interface Class	(One Parameter)
	@FunctionalInterface
	interface Moveable{
		void move (int mile);
	}
	
// Functional Interface Class	(NO Parameter)
	@FunctionalInterface
	interface Measurable{
		void measure ();
	}

// Functional Interface Class	 (Two Parameters)
	@FunctionalInterface
	interface Computeable{
		void compute (int num1, int num2);
	}
	
// Functional Interface Class	 (return type)
	@FunctionalInterface
	interface Flyable{
		boolean flyHigh (int mile);
	}
		

	public static void main(String[] args) {
//Anonymous Inner Class moveXmile
		Moveable moveXmile = new Moveable() {
			@Override
			public void move(int mile) {
				System.out.println("moving "+ mile);
			}
		};
//Anonymous Inner Class moveShortMile
		Moveable moveShortMile = new Moveable() {
			@Override
			public void move(int mile) {
				System.out.println("moving short mile"+ mile);
			}
		};
		
		Moveable moveXmileLambda = (int mile) -> { System.out.println("moving "+ mile +" miles.");};
		Moveable moveShortMilelambda = mile ->  System.out.println("moving short "+ mile +" miles.");
		
		moveXmileLambda.move(20);													// moving 20 miles.
		moveShortMilelambda.move(2);													// moving short 2 miles.
		
		Measurable m1 = () ->  System.out.println("measuring square");
		Measurable m2 = () ->  System.out.println("measuring rectangle");
		Measurable m3 = () ->  {System.out.println("measuring circle step 1,");
						System.out.println("measuring circle step 2,");
						System.out.println("measuring circle step 3.");
						};
		m1.measure();													// measuring square			
		m2.measure();													// measuring rectangle				
		m3.measure();													// measuring circle step 1,
																	// measuring circle step 2,
		
		Computeable	adder = (num1, num2) -> System.out.println("adding result: "+(num1+num2));													// measuring circle step 3.			
		Computeable	multiplyer = (n, m) -> System.out.println("multiplication result: "+(n * m));
		
		adder.compute(3, 5);												// adding result: 8
		multiplyer.compute(3, 5);											// multiplication result: 15
		
		Flyable high = mile -> mile >= 10 ;  
		System.out.println(high.flyHigh(11));
		
		Flyable mideum = mile -> mile < 10 && mile >= 5 ;
		System.out.println(mideum.flyHigh(5));
		
		Flyable low =  mile -> mile < 5 ;
		System.out.println(low.flyHigh(5));
		
//=============================================================================================		
// PREDICATE -single abstract method called test. Accept one parameter, return a boolean 	
//-----------------------------------------------------------------------------------------------	
// Predicate<String> checkMoreThan5Char = myString -> myString.length() > 5; 
// Predicate<Integer> checkDivisibleBy5 = num -> num % 5 == 0; 	
// Predicate<Person> isAdult = person -> person.age >= 18; 	
//		 					assuming we have a Person class with age field
//				
//	@FunctionalInterface
//	interface Predicate<T>{
//		void accept(T arg);
//	}	
//------------------------------------------------------------------------------------------------		
		Predicate<String> moreThan5Char = t -> t.length()>5;
		
		System.out.println(moreThan5Char.test("abcdef"));				// true
		System.out.println(moreThan5Char.test("abcde"));				// false
		
		List<String> names = new ArrayList<>(Arrays.asList("James", "John", "Alexander", "Diana", "Johnatton"));


//		names.removeIf(moreThan5Char);
		names.removeIf( t -> t.length()>5);							// that much simple 
		System.out.println(names); 								// [James, John, Diana]

		
//============================================================================================================		
// CONSUMER  -->  Has single abstract method called accept --> It does accept one parameter and return no value
//-------------------------------------------------------------------------------------------------------------		
// Consumer<String> strPrinter = arg -> System.out.println ( arg ); 
// Consumer<Integer> sqAreaCalculator = arg -> System.out.println ( arg*arg ); 	
// Consumer<Person> setPersonInfo = p -> p.setName ( "Some Name" ); 	
// 							assuming we have a Person class with name field
//		
//	@FunctionalInterface
//	interface Consumer<T>{
//		void accept(T arg);
//	}	
//-------------------------------------------------------------------------------------------------------------		
		Consumer<String> doublePrinter = t -> System.out.println ( t +" || "+ t );
		
		doublePrinter.accept("Apple");							// Apple || Apple
		
		names.forEach(doublePrinter);								// James || James
														// John || John
														// Diana || Diana
		names.forEach(s -> System.out.println(s.concat("son")));			// James || James
		System.out.println(names); 								// [James, John, Diana]

		
//============================================================================================================		
// SUPPLIER  -->  Has single abstract method called get --> It does accept NO parameter and return type T (specified)
//-------------------------------------------------------------------------------------------------------------		
// Supplier<String> providedStr = () -> new String("Your String"); 
// Supplier<Integer> randomNum  = () -> new Random().nextInt(); 	
// Supplier<Person> personSupp  = () -> new Person("Some Name", 28); 	
//		 				    assuming we have a Person class with name and age field.
//				
//		@FunctionalInterface
//		interface Supplier<T>{
//			T get();
//		}	
//-------------------------------------------------------------------------------------------------------------	
		
		

		
//============================================================================================================		
// FUNCTION  -->  Has single abstract method called apply --> accept 1 parameter firstType, return secondType
//-------------------------------------------------------------------------------------------------------------		
// Function<String,Integer> lengthGetter = str -> str.length; 
// Function<String,String> doubleTheStr  = str -> str +"-"+ str; 	
// Function<Person,Integer> birthYear    = p   -> 2019 - p.getAge(); 	
//		 				    assuming we have a Person class with name and age field and getters.
//				
//		@FunctionalInterface
//		interface Function<T,R>{
//			R apply(T);
//		}	
//-------------------------------------------------------------------------------------------------------------	
		
		Function<String,Integer> lengthGetter = str -> str.length();
		
		String s = "ABC";
		System.out.println( lengthGetter.apply(s) );				// 3	
		System.out.println( lengthGetter.apply("abcd") );			// 4	
		
		
// Create string length List according to the Provided String List "names" above
		
		List<Integer> lengths = new ArrayList<>();
		for (String str : names) {
			lengths.add( lengthGetter.apply(str) );			
		}
		System.out.println(lengths);						// [5, 4, 9, 5, 9]
		
		
// Using Comparator Functional Interface - sort the names according last character
			
		Comparator<String> lastChar = (s1,s2) -> s1.substring(s1.length()-1).compareTo(s2.substring(s2.length()-1)) ;
		names.sort(lastChar);
		System.out.println(names);						// [Diana, John, James]
		
		
// Using Comparator Functional Interface - sort the names according second character --second method

		Comparator<String> secondChar = Comparator.comparing( str -> str.substring(1,2) );
		names.sort(secondChar);
		System.out.println(names);						// [James, Diana, John]
		
// OR		
		Comparator<String> thirdChar = Comparator.comparing( str -> str.charAt(2) );
		names.sort(thirdChar);
		System.out.println(names);						// [Diana, John, James]
		
	}


	
}





