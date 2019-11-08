package String;

public class String_3thWord {

	public static void main(String[] args) {
		String str = "Sunday is Java Day";
		
//		Get 3th word 
		
		System.out.println(str.indexOf(' '));				// 6
		String st = str.substring(7,str.length());			// 7 =6+1
		
		System.out.println(st.indexOf(' '));				// 2
		String s = st.substring(3,st.length());				// 3 =2+1
		
		System.out.println(s.indexOf(' '));					// 4
		System.out.println(s.substring(0,5));				// 5 = 4+1
		
//		Get 3th word  better way
		
		System.out.println(str.indexOf(' '));				// 6 --- index of first space
		System.out.println(str.indexOf(' ',7));				// 9 --- index of second space
		System.out.println(str.indexOf(' ',10));			//14 --- index of third space
		
		System.out.println(str.substring(10,14));			// Java   ---  10 = 9+1
		
//		Get 3th word in one line
		System.out.println(str.substring((str.indexOf(' ',(str.indexOf(' ')+1))+1),
											(str.indexOf(' ',(str.indexOf(' ',(str.indexOf(' ')+1))+1)))));
		

	}
}
