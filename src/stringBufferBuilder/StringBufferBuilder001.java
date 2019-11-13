package stringBufferBuilder;

public class StringBufferBuilder001 {

	public static void main(String[] args) {


		StringBuffer sb = new StringBuffer();
		sb.append("1  123 56 ");
		
		System.out.println(sb);												// 1  123 56 
		System.out.println(sb.length());									// 10
		System.out.println(sb.capacity());									// 26
		
		sb.trimToSize();															
		System.out.println(sb.capacity());									// 10
		System.out.println(sb.length());									// 10
		System.out.println(sb);												// 1..123 56.
//INDEXOF		
		System.out.println(sb.indexOf("5"));								// 7
		System.out.println(sb.indexOf("56 "));								// 7
		System.out.println(sb.indexOf("5555 "));							// -1
		System.out.println(sb.lastIndexOf("12", 5))	;						// 3
		System.out.println(sb.lastIndexOf("3 56"));							// 5
		
// REVERSE		
		sb.reverse();					System.out.println(sb);				//	.65 321..1		
		
//DELETE		
		sb.delete(2, 5);				System.out.println(sb);				// starts from index 2 but at the end its taking 5-1=4/(end-1)    
																			//  INDEX  2 3 4   gone -> 621  1    
		
		sb.delete(0, sb.length());		System.out.println(sb);				// make it EMTY
		
//ADD		
		sb.append("abc");				System.out.println(sb); 			//abc					
		
//INSERT		
		StringBuffer s = new StringBuffer("dbca"); 
		s.insert(2,"A");				System.out.println(s);				// dbAca
//REPLACE		
		s.replace(1, 4, "B");			System.out.println(s);				// dBa
		
//toString
		
		String str = s.toString();    	System.out.println(str);			// dBa
		
	}

}
