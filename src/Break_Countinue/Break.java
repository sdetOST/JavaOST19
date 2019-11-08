package Break_Countinue;

// first 6 positive integers divisible by 3, using "break"

public class Break {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 102; i++) {
			if(i%3==0) {
				System.out.println(i);
				count++;
			}
			if(count == 6) {
				break;
			}
		}
		System.out.println(count);
	}
}
