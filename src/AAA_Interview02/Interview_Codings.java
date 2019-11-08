package akbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Interview_Codings {

	/*
	 * 1. Create a method that can remove duplicated values from an ArrayList. Do
	 * not use Set interfaces.
	 */

	public static ArrayList<Integer> removeDup(ArrayList<Integer> list) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++)
			if (!list2.contains(list.get(i)))
				list2.add(list.get(i));

		return list2;
	}

	/*
	 * 2. Create a method that can divide two numbers without using division
	 * operators and Math class.
	 */

	public static void devides(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Invalid Number");
			return;
		}

		System.out.print(num1 + " devid by " + num2 + " is: ");
		int count = 0;
		while (num1 >= num2) {
			num1 -= num2;
			count++;
		}
		System.out.println(count + " and remainder is " + num1);

	}

	/*
	 * 3. Write a method that check if a string is build out of the same letters as
	 * another string.
	 * 
	 * same("abc","cab"); -> true same("abc","abb"); -> false:
	 * 
	 */

	public static boolean same(String a, String b) {
		char[] myar1 = a.toCharArray(), myar2 = b.toCharArray();

		Arrays.sort(myar1);
		Arrays.sort(myar2);

		String a1 = "", a2 = "";

		for (char each : myar1)
			a1 += each;

		for (char each : myar2)
			a2 += each;

		if (a1.equals(a2))
			return true;

		return false;
	}

	/*
	 * 4. Write a method that will remove all dupplicates from string
	 * removeDup("abcc") ; -> "abc"
	 */

	public static String removeDup(String a) {
		String b = "";
		for (int i = 0; i < a.length(); i++)
			if (!b.contains("" + a.charAt(i)))
				b += "" + a.charAt(i);

		return b;
	}

	/*
	 * 5. Write a method which prints out the numbers from 1 to 30 but for numbers
	 * which are a multiple of 3, print "FIN" instead of the number and for numbers
	 * which are a multiple of 5, print "RA" instead of the number. for numbers
	 * which are a multiple of both 3 and 5, print "FINRA" instead of the number.
	 * 
	 */
	public static void FINRA() {
		String[] myarr = new String[30];

		for (int i = 0; i <= 29; i++)
			myarr[i] = "" + (i + 1);

		for (int j = 0; j < myarr.length; j++)
			if (new Integer(myarr[j]) % 3 == 0 && new Integer(myarr[j]) % 5 == 0)
				myarr[j] = "FINRA";
			else if (new Integer(myarr[j]) % 3 == 0)
				myarr[j] = "FIN";
			else if (new Integer(myarr[j]) % 5 == 0)
				myarr[j] = "RA";

		System.out.println(Arrays.toString(myarr));
	}

	/*
	 * 6. Write me a method which can identifies given number is even or odd
	 * identify(5) -> print "Odd" identify(6) -> print "Even"
	 */

	public static void identifyOddEven(int n) {
		if (n % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}

	/*
	 * 7. Write a method that returns max value out of array of integers, and than
	 * Srtings. int[] arr = {2,3,4}; max(arr) -> 4 DO NOT use sort method
	 */
	public static int maxValueinAnArray(int[] n) {
		int max = Integer.MIN_VALUE;

		for (int each : n)
			if (each > max)
				max = each;

		return max;
	}

	/*
	 * 8. create a method that can find the unique characters from the String
	 * unique("AAABBBCCCDEF") ==> "DEF";
	 */

	public static void unique(String AA) {
		String[] arr = AA.split("");
		String unique1 = "";
		for (int j = 0; j < AA.length(); j++) {
			int num = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(arr[j]))
					num++;
			}
			if (num == 1)
				unique1 += arr[j];
		}

		System.out.println(unique1);
	}

	/*
	 * 9. create a method that can find the frequencies of the String: frequencies(
	 * "AAABBCCCCDDD") ==> A3B2C4D3
	 * 
	 */
	// first way:
	public static void frequencies(String str) {
		String str2 = "", str3 = "";
		for (int i = 0; i < str.length(); i++)
			if (!str2.contains("" + str.charAt(i)))
				str2 += str.charAt(i);

		for (int z = 0; z < str2.length(); z++) {
			int num = 0;
			for (int i = 0; i < str.length(); i++)
				if (str.substring(i, i + 1).equals(str2.substring(z, z + 1)))
					num++;

			str3 += "" + str2.substring(z, z + 1) + num;
		}

		System.out.println(str3);
	}

	// second Way:
	public static void frequencies3(String str) {
		String b = new HashSet<>(Arrays.asList(str.split(""))).toString();
		b = b.replace(", ", "").replace("[", "").replace("]", "");
		String result = "";
		for (int j = 0; j < b.length(); j++) {
			int times = 0;
			for (int i = 0; i < str.length(); i++)
				if (str.substring(i, i + 1).equals("" + str.charAt(j)))
					times++;

			result += b.substring(j, j + 1) + times;
		}
		System.out.println(result);
	}

	// third way:
	public static void frequencies2(String str) {

		String b = new HashSet<>(Arrays.asList(str.split(""))).toString();
		b = b.replace(", ", "").replace("[", "").replace("]", "");
		String result = "";
		for (int i = 0; i < b.length(); i++) {
			int z = Collections.frequency(new ArrayList<>(Arrays.asList(str.split(""))), b.substring(i, i + 1));
			result += "" + b.charAt(i) + z;
		}
		System.out.println(result);
	}

	/*
	 * 10. String reverse:
	 * 
	 */
	// first way:
	public static void StrReverse(String str) {
		System.out.println(new StringBuffer(str).reverse().toString());
	}

	// second way:
	public static void StrReverse2(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverse += str.toCharArray()[i];

		System.out.println(reverse);
	}

	/*
	 * 11. Sort the Integer array without using sort method
	 */

	public static void sortingWithoutUsingSort(int[] a) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int each : a)
			list.add(each);

		ArrayList<Integer> sortedLists = new ArrayList<>();

		int z = list.size();

		for (int i = 0; i < z; i++) {
			int A = findMin(list);
			sortedLists.add(A);
			list.remove(new Integer(A));
		}
		System.out.println(sortedLists);

	}

	public static int findMin(ArrayList<Integer> a) {
		int min = Integer.MAX_VALUE;
		for (int each : a)
			if (each < min)
				min = each;

		return min;
	}

	public static void main(String[] args) {

		/*
		 * 12. Given a list of people�s names �Ahmed�,�John�,�Eric� , write a java
		 * operation to remove all the names named �Ahmed�
		 * 
		 */
		// first way:
		List<String> name = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Yashar","Huseyin"));
		name.removeIf(p -> p.equals("Ahmed"));
		System.out.println(name);

		// second way:
		List<String> name2 = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Yashar","Huseyin"));

		Iterator<String> it = name2.iterator();
		while (it.hasNext()) {
			if (it.next().equals("Ahmed"))
				it.remove();
		}
		System.out.println(name2);

		// thirdway:
		List<String> name3 = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Yashar"));
		name3.removeAll(Arrays.asList("Ahmed"));
		System.out.println(name3);

		// fourth way:
		List<String> name4 = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Yashar"));
		List<String> name5 = new ArrayList<>();
		name4.forEach(p -> {
			if (!p.equals("Ahmed"))
				name5.add(p);
		});
		System.out.println(name5);

		// fifth way:
		List<String> name6 = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed", "Yashar"));
		for (ListIterator<String> is = name6.listIterator(); is.hasNext();)
			if (is.next().equals("Ahmed"))
				is.remove();

		System.out.println(name6);

		/*
		 * 13. Given a list of integers 1,2,3,4,5,6,... remove all values greater than
		 * 100
		 * 
		 */
		// firstway
		List<Integer> lists1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
		lists1.removeIf(p -> p > 100);
		System.out.println(lists1);

		// second way:
		List<Integer> lists2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
		for (ListIterator<Integer> il = lists2.listIterator(); il.hasNext();)
			if (il.next() > 100)
				il.remove();

		System.out.println(lists2);

		// thirdway:
		List<Integer> lists3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
		Iterator<Integer> oo = lists3.iterator();
		while (oo.hasNext())
			if (oo.next() > 100)
				oo.remove();

		System.out.println(lists3);

	}

}