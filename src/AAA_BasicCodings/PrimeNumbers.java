package AAA_BasicCodings;

public class PrimeNumbers {

	public static void main(String[] args) {

		int num = 100;

		for (int i = 2; i < num; i++) {
			for (int j = 2; j <= i; j++) {
				
				if (i == j)		System.out.println(i);

				if (i % j == 0)		break;
				
			}
		}
	}
}
