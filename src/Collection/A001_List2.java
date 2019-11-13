package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * sort list according to the last digit
 */
public class A001_List2 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
//===============================================================	
// opt1 - anonymous class
//------------------------------------------------------------		
//		Comparator<Integer> comp = new Comparator<>() 
//		{	@Override
//			public int compare(Integer a, Integer b) {
//				return a%10 > b%10 ? 1 : -1;
//			}
//		};
//		Collections.sort(values, comp);
//		for (Integer i : values)  System.out.println(i);
		
//===============================================================	
// opt2 - lambda
//---------------------------------------------------------------		
//		Comparator<Integer> comp = (a,b) -> a%10 > b%10 ? 1 : -1;
//		Collections.sort(values, comp);
//		for (Integer i : values)  System.out.println(i);
		
//===============================================================	
// opt3 - lambda
//---------------------------------------------------------------		
		Collections.sort(values, (a,b) -> a%10 > b%10 ? 1 : -1);
		for (Integer i : values)  System.out.println(i);			
		
		


	}
}

