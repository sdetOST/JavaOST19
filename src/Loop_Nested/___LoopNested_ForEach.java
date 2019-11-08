package Loop_Nested;

public class ___LoopNested_ForEach {

	public static void main(String[] args) {

System.out.println("Nested forEach loop");
		
		int[] rows = {1,2,3,4,5};
		int[] cols = {1,2,3};
		for(int row : rows) {
			for(int col : cols) {
				System.out.println(" |Row"+ row +"-Column"+col);
			}
//			System.out.println();
		}
//System.out.println("---------------------------------------------");
//System.out.println("Nested while loop");
//		
//		int i=0;
//		while (i<5) {
//			i++;
//			int j=0;
//			while (j<3) {
//				j++;
//				System.out.print(" |Row"+ i +"-Column"+ j);
//			}
//			System.out.println();
//		}
//System.out.println("---------------------------------------------");
//System.out.println("Nested do while loop");
//		
//		int n=0;
//		do {
//			n++;
//			int m=0;
//			do {
//				m++;
//				System.out.print(" |Rowm"+ m +"-Column"+ n);
//			}while(m<3);
//			System.out.println();
//		}while(n<5);
//System.out.println("---------------------------------------------");	
//System.out.println("Nested for loop");
//
//		for(int b=1; b<=5; b++) {
//			for(int c=1; c<=3; c++)
//				System.out.print(" |Row"+ b +"-Column"+ c);
//			System.out.println();
//		}
//System.out.println("---------------------------------------------");	
//System.out.println("Nested while in for loop");
//		
//		for(int p=1; p<=5; p++) {
//			int r=1;
//			while(r<=3) {
//				System.out.print(" |Row"+ p +"-Column"+ r);
//				r++;
//			}
//			System.out.println();
//		}
//System.out.println("---------------------------------------------");
	}
}

