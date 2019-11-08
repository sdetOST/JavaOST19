package CyberInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 	ArrayList -- Remove "Ahmed"
	Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... 
	Write a java operation to remove all the names named Ahmed
 */
public class arrayListRemoveStringXxx {

	public static void main(String[] args) {
		String [] ar = {"aa","aa","b","bb","a","b","aa"};
		
		removeAll6(ar);
	}
	
	public static void removeAll1(String[] arr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		list.removeAll(Arrays.asList("aa"));
		System.out.println(list);
	}

	public static void removeAll2(String[] arr) {
		List<String> list = new ArrayList<>();
		for (String s: arr) 
			if(!s.equals("aa"))  		
				list.add(s);
		System.out.println(list);
	}
	public static void removeAll3(String[] arr) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		for (String s: arr) 
			if(s.equals("aa"))  		
				list.remove(s);
		System.out.println(list);
	}
	public static void removeAll4(String[] arr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		Iterator<String> st = list.iterator();
		    while(st.hasNext()) {
		        if(st.next().equals("aa"))       
		      	  st.remove();
		    }System.out.println( list );
	}
	public static void removeAll5(String[] arr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		for(ListIterator<String> it=list.listIterator(); it.hasNext();)
		        if(it.next().equals("aa"))		
		      	  it.remove();
		System.out.println(list);
	}
	public static void removeAll6(String[] arr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));	
		list.removeIf(p -> p.equals("aa"));

		System.out.println(list);
	}
	

}


		 



