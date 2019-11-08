package a01;

public class sumOfDigits {

	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(111222349));

	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10; // for ones
			num = num / 10;
		}return sum;
	}
}
