package Printing;

import Array.Array;

// Shortcut Printing for int:" %d  string = %s)
// %d --> ,int       System.out.printf("%d:%d:%d %s",hour,minute,second,amOrPm);  // 12:24:33 PM
// %s --> ,string
// \t --> Insert tab
// \n --> Insert a new line
// \' --> Insert a single quotation
// \" --> Insert a double quotation

public class ShortcutPrintingIntString {

	public static void main(String[] args) {

//		int hour=12;
//		int minute=24;
//		int second=33;
//		String amOrPm = "PM";
//		    
//		System.out.printf("%d:%d:%d %s",hour,minute,second,amOrPm);  // 12:24:33 PM			

//		double hour=12.45;
//		double minute=24.4;
//		double second=33.6;
//		String amOrPm = "PM";
//		    
//		System.out.printf("%d:%d:%d %s",hour,minute,second,amOrPm);  // 12:24:33 PM	

//--------------------------------------------------------------------------------		
		int[][] array1 = {{1,2,3},{11,12,13,14},{21,22},{31,32,33,34,35}};
		
		System.out.println("\tcol1\tcol2\tcol3\tcol4\tcol5");
		System.out.println("\t----\t----\t----\t----\t----");
		 int n = 1;
		 for (int[] x: array1) {
			
			 System.out.print("row"+(n++)+" :\t");
			 for (int y: x) {
			
				 System.out.print(" "+y+"\t");
			 }System.out.println();
			 
		 }
		 
//		  			col1	col2	col3	col4	col5
//		  	row1	1		2		3	
//		  	row2	11		12		13		14	
//		  	row3	21		22		
//		  	row4	31		32		33		34		35
		
		
		
	
//		System.out.print("1\n2\n3\n4\n");
//		System.out.print("1\n 2\n  3\n   4\n");
//		
//		System.out.print("a\rb\rc\rd\r");
//		System.out.print("a\r b\r  c\r   d\r");
		
//		System.out.println(age > 18? "adult": "not adult");
	}

}
