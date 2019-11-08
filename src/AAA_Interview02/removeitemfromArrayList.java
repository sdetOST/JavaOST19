package a01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeitemfromArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>
		(Arrays.asList("Ahmad","John","Eric","Marc","Ahmad","Ahmad","Eric"));
		
//		removeItem1(list);
//		removeItem2(list);
		removeItem3(list);
	}
	
	public static void removeItem1(List<String> list) {
		
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(!list.get(i).equals("Ahmad")) 
				list2.add(list.get(i));
		}
		System.out.println(list2);
	}
	
	public static void removeItem2(List<String> list) {
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("Ahmad")) { 
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
	}
	
	public static void removeItem3(List<String> list) {
		while (list.contains("Ahmad")) 
			list.remove("Ahmad");			
		
		System.out.println(list);
	}
	
	


}
