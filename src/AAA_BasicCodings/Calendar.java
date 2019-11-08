/**
 * print a month calendar
 */
package AAA_BasicCodings;

public class Calendar {

	public static void main(String[] args) {
		
		int days = 28;
		int start = 6;
		System.out.println("S\tM\tT\tW\tT\tF\tS");
		
		for(int j = 1; j<= start; j++) {
			System.out.print("\t");
		}
		for(int i =1 ; i<= days; i ++) {
			System.out.print(i + "\t");
			if((i+start) % 7 ==0) 
				System.out.println();
		}
	}
	

}
