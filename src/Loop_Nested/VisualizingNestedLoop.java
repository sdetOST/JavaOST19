package Loop_Nested;

public class VisualizingNestedLoop {

	public static void main(String[] args) {
		
		
		// Visualize with Excel that have 3 row and 5 column
		for(int row=1; row<=3 ; row++)	{
			System.out.println("Row Num: "+ row);
			//System.out.println("do something complex");
			for (int col = 1; col <= 5; col++) {
				System.out.print("  ColNum: "+col);
				// also try to comment above line and try below line for
				//System.out.print("Cell( "+row+","+col+")  ");
				
			}
			System.out.println();
		}	

	}

}
