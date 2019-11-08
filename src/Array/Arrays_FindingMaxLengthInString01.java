package Array;

public class Arrays_FindingMaxLengthInString01 {

	public static void main(String[] args) {
		String movies[] = { "aaaa", "bbbbb cccc", "ffff ff fff", "dddd" };

		for (int i = 0; i < movies.length; i++) {

			System.out.println("\"" + movies[i] + "\" char count is : " + movies[i].length());

		}

		int max = movies[0].length();
		int k = 0;
		for (int i = 1; i < movies.length; i++) {

			if (movies[i].length() > max) {
				max = movies[i].length();
				k = i;
			}
		}
		System.out.println(movies[k]);
		System.out.println(max);
//------------------------------------------------------------------		
		int arr[] = { 4,7,5,1 };
		int m = 0;
		int maxx = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > maxx) {
				maxx = arr[i];
				m = i;
			}
		}
		System.out.println("The index is : "+k);
		System.out.println(max);
		
		

	}
}


