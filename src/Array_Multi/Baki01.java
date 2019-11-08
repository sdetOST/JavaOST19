package Array_Multi;

public class Baki01 {

	public static void main(String[] args) {
		int arr1 [][]= {{1,2,3,4},{5,6,7,8}};
		int arr2 [][]= {{11,12,13,14},{43},{5,6,7,8}};
		
		System.out.println("This is the arr1");
		display(arr1);
		System.out.println("This is the arr2");
		display(arr2);	
	}
	
	public static void display(int [][] x) {
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				System.out.print(x[i][j]+"\t");				
			}
			System.out.println();
		}
	}
}
