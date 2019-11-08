package a001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A_eliminateDublicates001 {

	public static void main(String[] args) {
		String item = "Umbrellaaaaabbmns Erththrgh";
		int[] arr = { 1,8,3,4,3,3,1,4,5,4,3  };
		String [] ar = {"aa","aa","b","bb","a","b"};
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(eliminateDublicates1(item));
//		System.out.println(eliminateDublicates2(item));
		System.out.println(Arrays.toString(eliminateDublicates3(arr)));
		System.out.println(Arrays.toString(eliminateDublicates4(arr)));
		System.out.println(Arrays.toString(eliminateDublicates5(ar)));
		System.out.println(Arrays.toString(eliminateDublicates6(ar)));
		System.out.println(Arrays.toString(eliminateDublicates7(ar)));

	
	}

	
//==============================================================
//1.Eliminate Duplicates - String - Using Loop --> Umbrelans Ethg
//--------------------------------------------------------------
	public static String eliminateDublicates1(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (!s.contains("" + str.charAt(i)))
				s += str.charAt(i);
		}
		return s;
	}
	
	
	
//==============================================================	
//2.Eliminate Duplicates - String - Using LinkedHashSet --> Umbrelans Ethg
//--------------------------------------------------------------
	public static String eliminateDublicates2(String str) {
		str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		str = str.replace(", ","").replace("[","").replace("]", "");
		return str;
	}
	
	
	
//==============================================================	
//3.Eliminate Duplicates - int[] arr - Using ArrayList -->[1, 8, 3, 4, 5]
//--------------------------------------------------------------
	public static Integer[] eliminateDublicates3(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i])) continue;
			list.add(arr[i]);
		}
		Integer[] result = list.toArray(new Integer[1]);
		return result;
	}
	
	
	
	
	
	
//==============================================================
//4.Eliminate Duplicates- int[] arr -Using LinkedHashSet -->[1, 8, 3, 4, 5]
//--------------------------------------------------------------	
	public static Integer[] eliminateDublicates4(int[] arr) {
		
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) set.add(arr[i]);		

		Integer[] result = set.toArray(new Integer[1]);
		return result;
	}
	
	
//==============================================================
//5.Eliminate Duplicates- String[] arr -Using LinkedHashSet -->[aa, b, bb, a]
//--------------------------------------------------------------	
	public static String[] eliminateDublicates5(String[] arr) {
		
		Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
				
		String[] result = set.toArray(new String[1]);
		return result;

	}
	
//==============================================================	
//6.Eliminate Duplicates - Sting[] - Using ArrayList -->[aa, b, bb, a]
//--------------------------------------------------------------
	public static String[] eliminateDublicates6(String[] arr) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i]))
				list.add(arr[i]);
		}
		String[] result = list.toArray(new String[1]);
		return result;
	}

//==============================================================	
//7.Eliminate Duplicates-Sting[] -Using ArrayList -->[aa, b, bb, a]
//--------------------------------------------------------------
	public static String[] eliminateDublicates7(String[] arr) {	
	
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		for( String s : arr) {
			while( list.contains(s)) 
				list.remove(s);
			list.add(s);
		}
		String[] result = list.toArray(new String[1]);
		return result;
	}
	
	
	
	
	
}
			

	



