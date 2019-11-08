package Break_Countinue;

public class Continue {

	public static void main(String[] args) {
		System.out.print("i: ");				// i:
		for (int i = 1; i <=10; i++) {
			if(i>=6) continue;					// exclude 6,7,8,9,10
			System.out.print(i+", ");			// 1,2,3,4,5,
		}
		System.out.print("\nj: ");				// j:
		int j = 0;
		while(j < 10) {
			j++;			
			if(j==3 || j==4) {					// exclude 3 and 4
				continue;
				}

			System.out.print(j+", ");			// 1,2,5,6,7,8,9,10
			
		
		}
	}
}
