package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A001_Comperator {

	public static void main(String[] args) {
		List <Person> plst = new ArrayList<>();
		plst.add(new Person("John",20, "Fort Worth"));
		plst.add(new Person("John",10, "Austin"));
		plst.add(new Person("Adam",38, "Conway"));
		plst.add(new Person("Mary",25, "Lewisburg"));
		
		System.out.println(plst);
//=========================================================================================
// SORT with COLLECTION: 
//-----------------------------------------------------------------------------------------		
//	The Person is combination of data type like integers and Strings, 
//   	we need to tell the collection which type of sort we ask. Regarding age or name
//  	So we should implements the Comparable <> interface class to Person class	
//	with param Person
//  	( <T> = Person in this case)
//  	Than we override the "compareTo(Person)" method respect to our need on Person class	
//  	Now we can implement "Collections.sort(list);" below		
//---------------------------------------------------------------------------------------		
//		Collections.sort(plst);   			System.out.println(plst);
		
		
//=========================================================================================
// SORT with COLLECTION with COMPARATOR: 
//-----------------------------------------------------------------------------------------		
//	
//		Comparator<Person> comp = new PersonNameComparator();
//		Collections.sort(plst, comp);			System.out.println(plst);
//		
////--------------------------------------------------------------------------------------------------
		
//=========================================================================================
// SORT with COLLECTION -COMPARATOR and Lambda: 
//-----------------------------------------------------------------------------------------
		Comparator<Person> ageComparator = Comparator.comparing(p -> p.age );
		Collections.sort(plst, ageComparator);			System.out.println(plst);
//		
		Comparator<Person> nameComparator = Comparator.comparing(p -> p.name );
		Collections.sort(plst, nameComparator);			System.out.println(plst);
//		
//		Comparator<Person> nameThanAgeComparator = nameComparator.thenComparing(ageComparator);				// ascending both
//		Collections.sort(plst, nameThanAgeComparator);			System.out.println(plst);
//			
//		Comparator<Person> nameThanAgeReversedComparator = nameComparator.thenComparing(ageComparator).reversed();	// descending both
//		Collections.sort(plst, nameThanAgeReversedComparator);			System.out.println(plst);
//		
//		Comparator<Person> nameThanReverseAgeComparator = nameComparator.thenComparing(ageComparator.reversed());	// ascending name - descending age
//		Collections.sort(plst, nameThanReverseAgeComparator);			System.out.println(plst);
//		
//		Comparator<Person> reverseNameThanAgeComparator = nameComparator.reversed().thenComparing(ageComparator);	// descending name - ascending age
//		Collections.sort(plst, reverseNameThanAgeComparator);			System.out.println(plst);
//			
////--------------------------------------------------------------------------------------------------		
//		Comparator<Person> nameComparator2 = ( o1, o2) -> o1.name.compareTo(o2.name) ;			// ascending
//		Collections.sort(plst, nameComparator2);			System.out.println(plst);
//		
//		Comparator<Person> nameReverseComparator1 = ( o2, o1) -> o1.name.compareTo(o2.name) ;		// descending
//		Collections.sort(plst, nameReverseComparator1);			System.out.println(plst);
//		
//		Comparator<Person> nameComparator3 = ( a, b) -> a.name.compareTo(b.name) ;				// ascending
//		Collections.sort(plst, nameComparator3);			System.out.println(plst);
//		
//		Comparator<Person> nameReverseComparator2 = ( b, a) -> a.name.compareTo(b.name) ;			// descending
//		Collections.sort(plst, nameReverseComparator2);			System.out.println(plst);
//		
////-----------------------------------------------------------------------------------------------------
		
		
				
		
	}

}
