package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStream {

	public static void main(String[] args) {

		List<Integer> litOfInt = Arrays.asList(11,3,5,20,4,3,21);
		
		
		
		
		
//1-----filter out greater than 10, print
		litOfInt.stream().filter(x->x>10).forEach(p->System.out.println(p));				// 11 20 21
		

//2-----filter out greater than 10 and put them in new list
		List<Integer> listofBiggerThen10 = new ArrayList<>();
		litOfInt.stream().filter(x->x>10).forEach(p->listofBiggerThen10.add(p));			// [11, 20, 21]

//3-----filter out greater than 10, map it to square of its elements and print	
		litOfInt.stream().filter(x->x>10).map(x->x*x).forEach(p->System.out.println(p));	// 121 400 441
		
//4-----filter out greater than 10, map it to square of its elements and save that map
		Map<Integer, Integer> mapOfsq = new HashMap<>();
		litOfInt.stream().filter(x->x>10).forEach(p->mapOfsq.put(p, p*p));					// {11=121, 20=400, 21=441}	
		
//5-----filter out greater than 10, map it to square of its elements and print the sum of those
		int sum = litOfInt.stream().filter(x->x>10).mapToInt(x->x*x).sum();					// 962	
		System.out.println(sum);
		
	
		

	}

}
