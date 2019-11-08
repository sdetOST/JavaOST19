package String;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;

public class AAAString_0001 {

	public static void main(String[] args) {
		
		String drink = "Cofeef";
		String drink2 = "latte.";
		
		
//		System.out.println(drink.equals("Cofeef"));				// 	true
//		System.out.println(drink.equals(drink2));				// 	true
//		
//		System.out.println(drink.equals("Cofee "));				//	false	
//		System.out.println(drink.equals(" cofee "));			// false
//		System.out.println(drink.equalsIgnoreCase("cofEe"));	// true ------ ignore Case
//		System.out.println(drink+"&".repeat(3));				// Cofee&&&
//		
//		String s = "abcdef";
//		String st = s.substring(s.length()-3);
//		System.out.println(st.repeat(3));						// CofeefCofeefCofeef
//		System.out.println("ab".repeat(3));						// ababab
//		
//		System.out.println(drink.charAt(3)==drink.charAt(4));
//
//		System.out.println(drink.concat(drink2));			// Cofeelatte
//		
//		System.out.println(drink.length());					// 5
//		
//		System.out.println(drink.toLowerCase());			// cofee
//		System.out.println(drink.toUpperCase());			// COFEE
//		
//		System.out.println(drink.charAt(3));				// e
//		System.out.println(drink.charAt(4));				// e
//		
//		How to print character
//		System.out.print(drink.charAt(3)+", "+drink.charAt(4));
//		System.out.printf("%c%c\n",drink.charAt(3),drink.charAt(4));
//		
//		System.err.println(drink.substring(3,5));			// ee
//		System.err.println(drink.trim());					// Cofee
//		
//		System.out.println(drink.contains("f"));			// true
//		System.out.println(drink.startsWith("Co"));			// true
//		System.out.println(drink.endsWith("e "));			// false
//
//		System.out.println(drink.indexOf('f'));				// 2
//		System.out.println(drink.indexOf('f',3));			// 5		
//		System.out.println(drink.isEmpty());				// false
//		
//		System.out.println(drink.replace('C','K'));			// Kofee
//		System.out.println(drink.toCharArray());			// Cofee ---> char to array
//=============================================================================================		
//----------------Sting to Integer-------------------------------------------
//		String s = "12";
//		int a = Integer.parseInt(s);
//		int a = Integer.valueOf(s);
//		int a = new Integer(s).intValue();
//
//		DecimalFormat decFor = new DecimalFormat("#");
//		int a = 0;
//		try {
//			a = decFor.parse(s).intValue();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		System.out.println(a);
//
//-------------------Integer to String-----------------------------------------		
//		String s1 = Integer.toString(x);
//		String s2 = String.valueOf(x);
//---------------------------------------------------------------------------------------------		
//		
//		String str = "123";
//		int n = Integer.parseInt(str);					// 
//		System.out.println(n);							// from string "123" to number n=123
//		
//		n= Integer.parseInt(str.substring(0, 1));		// from string "123" to number n=1
//		System.out.println(n);							
//		n = Integer.parseInt(str.substring(1, 2));		// from string "123" to number n=2
//		System.out.println(n);							
//		n = Integer.parseInt(str.substring(1, 3));		// from string "123" to number n=23
//		System.out.println(n);							
//
//		
//---------------------------------------------------------------------------------------		
//				int number to string number
//-----------------------------------------------------------------------------------	
//		int a = 97;									// from integer 97 to string "97"
//		
//		
///*1*/		String s1 = String.valueOf(a); 
//
//
///*2*/		String s2 = new Integer(a).toString();
///*3*/		String s3 = String.format("%d", a);
//		
///*4*/		StringBuilder sbu = new StringBuilder();		// not synchronize, multiple treat
//			sbu.append(a);
//			String s4 = sbu.toString();
//
///*5*/		StringBuffer sbf = new StringBuffer();			// synchronize, only one treat at a time
//			sbf.append(a);
//			String s5 = sbf.toString();			
//			
//			String S = s1+s2+s3+s4+s5;
//			System.err.println(S);
//			System.out.println(s1+s2+(s3+s4+s5));
//		
//			String [] array1 = {s1,s2,s3,s4,s5};
//			System.out.println(Arrays.toString(array1));

	
//---------------------------------------------------------------------------------------------		
//		int x = 98;
//		Character myChar = (char)98;
//		int y = myChar;
//		System.out.println(myChar);							
//		System.out.println(y);
//		
//		
//		int a = 12, b = 43;
//		String sa = String.valueOf(a);
//		String sb = String.valueOf(b);
//		int a1 = Integer.parseInt(sa.substring(0, 1));
//		int a2 = Integer.parseInt(sa.substring(1, 2));
//		int b1 = Integer.parseInt(sb.substring(0, 1));
//		int b2 = Integer.parseInt(sb.substring(1, 2));
//		
//		System.out.println(sa);
//		System.out.println(sb);
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b%10);
//		System.out.println((b-b%10)/10);
//		  System.out.println(a1);
//		  System.out.println(a2);
//		  System.out.println(b1);
//		  System.out.println(b2);
		
//		String s = "[1, 2, 3, 1]";
//
//		
//		String ss = "-";
//		for (int i=0; i<s.length();i++) {
//			String c = s.charAt(i)+"";
//			String sss = s.substring(i+1);
//			if (!sss.contains(c)) ss = ss + c;
//			
//		}
//		System.out.println(ss);
// 
		String a = "a";
		String b = "04";
		
		System.out.println(a.compareTo(b));
		
		
		
	}

}
