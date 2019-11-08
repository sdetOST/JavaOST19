package a01;

public class factorial {

	public static void main(String[] args) {
		System.out.println(Factorial(4));

	}

	public static int Factorial(int num) {

		int factorialNum = 1;
		for (int i = 1; i <= num; i++) {
			factorialNum = factorialNum * i;
		}
		return factorialNum;
	}

}
