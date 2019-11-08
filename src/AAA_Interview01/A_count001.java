package a001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class A_count001 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1,2,2,3,3,3,4,4,4,4,5 };
		String[] words = { "aa", "aa", "bbb", "bbb", "aa", "b" };
		String word = "aa";
		String str = "aaa abbb cc def cc aaa";
		char c = 'b';

//		countNumbers1(numbers);
//		countNumbers2(numbers);
//		countElement(words, word);
//		countElements1(words);
//		countElements2(words);
//		countElements3(words);
//		countChar(str, c);
//		System.out.println(countAllChars1(str));   
//		countAllChars2(str);
//		countLetters(str);
//		countWords(str);
//		findUnicChars(str);
//		findUnicWords1(str);
//		System.out.println(findUnicWords2(str));
//		findUnicItems(words);
//		System.out.println(findUnicItems(words));
	}

//===============================================================
// 1. Count numbers -int[] -HashMap -loop -->{1=1, 2=2, 3=3, 4=4, 5=1}
//---------------------------------------------------------------	
	public static void countNumbers1(int[] numbers) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int key : numbers) {
			if (map.containsKey(key)) {
				int count = map.get(key) + 1;
				map.put(key, count);
			} else
				map.put(key, 1);
		}
		System.out.println(map); // opt 1
	}

//===============================================================
// 2. Count numbers - int[] - ArrayList - loop -->1-1 2-2 3-3 4-4 5-1 
//---------------------------------------------------------------		
	public static void countNumbers2(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			if (list.contains(numbers[i])) {
				continue;
			}
			list.add(numbers[i]);
			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j])
					count++;
			}
			System.out.print(numbers[i] + "-" + count + " ");
		}System.out.println();
	}

//===============================================================
// 3. Count An Element - StringArrays -  loop -->3
//---------------------------------------------------------------		
	public static void countElement(String[] str, String word) {

		int count = 0;
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			if (s.contains(word))
				count++;
		}
		System.out.println(count);
	}

//===============================================================
// 4. Count Elements - StringArrays - HashMap -->{aa=3, b=1, bbb=2}
//---------------------------------------------------------------	
	public static void countElements1(String[] words) {
		Map<String, Integer> map = new HashMap<>();
		for (String key : words) {
			if (map.containsKey(key)) {
				int count = map.get(key) + 1;
				map.put(key, count);
			} else
				map.put(key, 1);
		}
		System.out.println(map); 
	}

//===============================================================
// 5. Count Elements2 - StringArrays -  ArrayList -->aa-3 bbb-2 b-1 
//---------------------------------------------------------------		
	public static void countElements2(String[] words) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			if (list.contains(words[i])) {
				continue;
			}
			list.add(words[i]);
			int count = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i] == words[j])
					count++;
			}
			System.out.print(words[i] + "-" + count + " ");
		}System.out.println();
	}

//===============================================================
// 6. Count Elements2 - StringArrays  - loop -->aa-3 bbb-2 b-1 
//---------------------------------------------------------------		
	public static void countElements3(String[] words) {
		List<String> s = new ArrayList<>();
		for (int j = 0; j < words.length; j++) {
			String a = words[j];
			if (s.contains(a + ""))
				continue;
			s.add(a);

			int m = 0;
			for (int i = 0; i < words.length; i++) {
				String b = words[i];
				if (b.equals(a))
					m++;

			}
			System.out.print(a + "-" + m + " ");
		}System.out.println();
	}

//===============================================================
// 7. Count char - String -  loop -->"b" is used 3 times.
//---------------------------------------------------------------
	public static void countChar(String str, char c) {

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				counter++;
		}
		System.out.println("\"" + c + "\" is used " + counter + " times.");
	}

//===============================================================
// 8. Count allChars - String -  loop -returnString -->a-7 b-3 c-4 d-1 e-1 f-1
//---------------------------------------------------------------
	public static String countAllChars1(String str) {
		str = str.replace(" ", "");
		int l = str.length();
		String result = "";
		String s = "";
		for (int i = 0; i < l; i++) {
			if (s.contains(str.charAt(i) + "")) {
				continue;
			}
			s += str.charAt(i) + "";

			int count = 0;
			for (int j = 0; j < l; j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			result += str.charAt(i) + "-" + count + " ";
		}
		return result;
	}

//===============================================================
// 9. Count allChars2 - String -  loop - print -->a-7 b-3 c-4 d-1 e-1 f-1
//---------------------------------------------------------------	
	public static void countAllChars2(String str) {
		str = str.replace(" ", "");
		int l = str.length();
		String s = "";
		for (int i = 0; i < l; i++) {
			if (s.contains(str.charAt(i) + "")) {
				continue;
			}
			s += str.charAt(i) + "";

			int count = 0;
			for (int j = 0; j < l; j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			System.out.print(str.charAt(i) + "-" + count + " ");
		}System.out.println();
	}

//===============================================================
// 10. Count allLetters - String - HashMap - loop -->{a=7, b=3, c=4, d=1, e=1, f=1}
//---------------------------------------------------------------	

	public static void countLetters(String str) {
		str = str.replace(" ", "");
		Map<String, Integer> map = new LinkedHashMap<>();
		String[] arr = str.split("");
		for (String s : arr) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else
				map.put(s, 1);

		}
		System.out.println(map);
	}

//===============================================================
// 11. Count allWords - String - HashMap -->{aaa=2, abbb=1, cc=2, def=1}
//---------------------------------------------------------------	

	public static void countWords(String str) {

		Map<String, Integer> map = new LinkedHashMap<>();
		String[] arr = str.split(" ");
		for (String s : arr) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else
				map.put(s, 1);

		}
		System.out.println(map);
	}

//===============================================================
// 12. Find Unique Chars - String -  loop -->def
//---------------------------------------------------------------	
	public static void findUnicChars(String str) {
		String uniqs = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			if (count == 1)
				uniqs += "" + str.charAt(i);
		}
		System.out.println(uniqs);
	}
	
//===============================================================
// 13. Find Unique Words - String -  loop -->abbb def
//---------------------------------------------------------------	
	public static void findUnicWords1(String str) {
		List<String> list = new ArrayList(Arrays.asList(str.split(" ")));
		String uniqs = "";
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j)) )
					count++;
			}
			if (count == 1)
				uniqs +=list.get(i)+" ";
		}
		System.out.println(uniqs);
	}
	
//===============================================================
// 14. Find Unique Words - String -  HashMap --> abbb def
//---------------------------------------------------------------	
	public static String findUnicWords2(String str) {
		String [] keys = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String key : keys) {
			if (map.containsKey(key)) {
				int count = map.get(key) + 1;
				map.put(key, count);
			} else
				map.put(key, 1);
		}
		String result = "";
		for(String key: map.keySet()) {
			if (map.get(key)==1)
				result += key+" ";
		}return result;
	}
	
//===============================================================
//15. Find Unique Words - String[] - HashMap - print -->  b
//---------------------------------------------------------------	
	public static void findUnicItems1(String[] str) {
		Map<String, Integer> map = new HashMap<>();
		for (String key : str) {			
			if (map.containsKey(key)) {
				int count = map.get(key) + 1;
				map.put(key, count);
			} else
				map.put(key, 1);
		}
		for(String key: map.keySet()) {
			if (map.get(key)==1)
				System.out.println(key+" ");
		}
	}

//===============================================================
// 16. Find Unique Words - String[] -  HashMap - returnList -->  b
//---------------------------------------------------------------		
	public static List<String> findUnicItems(String[] str) {
		Map<String, Integer> map = new HashMap<>();
		for (String key : str) {
			if (map.containsKey(key)) {
				int count = map.get(key) + 1;
				map.put(key, count);
			} else
				map.put(key, 1);
		}
		List<String>result = new ArrayList<>();
		for(String key: map.keySet()) {
			if (map.get(key)==1)
				result.add(key);
		}return result;
	}
	
//===============================================================
// 17. Same Char Strings
//---------------------------------------------------------------		
	public static boolean same2(String a, String b) {
		a = new TreeSet<String>(Arrays.asList( a.split("") ) ).toString( );
		b = new TreeSet<String>(Arrays.asList( b.split("") ) ).toString( );
		
		return  a.equals(b) ;
	}
}
