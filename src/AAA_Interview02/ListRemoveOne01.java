package a01;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveOne01 {
	/*
	 Given a list of people’s names “Ahmad”,”John”,”Eric” , write a  java operation to remove all the names named “Ahmad”
	 */
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("Ahmad");
		myList.add("John");
		myList.add("Eric");
		myList.add("Marc");
		myList.add("Ahmad");
		myList.add("Ahmad");
		
		System.out.println(myList);
		
		for(int i = 0; i<myList.size(); i++) {
			if(myList.get(i).equalsIgnoreCase("Ahmad")) {
				myList.remove(i);
				i--;
			}
		}
		System.out.println(myList);
		
		
		
		
	}

}