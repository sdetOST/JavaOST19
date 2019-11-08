package a01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class fibonacci {

	public static void main(String[] args) {
		fibonacci1(15);
		System.out.println();
		fibonacci2(15);
		System.out.println();
		fibonacci3(15);
		System.out.println();

		System.out.println(fibonacci4(15));

	}

	public static void fibonacci1(int num) {
		int num1 = 0;
		int num2 = 1;
		int fibonacci = 1;
		System.out.print(num1 + " " + num2 + " " + fibonacci + " ");
		for (int i = 0; i < num - 3; i++) {
			num1 = num2;
			num2 = fibonacci;
			fibonacci = num1 + num2;
			System.out.print(fibonacci + " ");
		}
	}

	public static void fibonacci2(int num) {
		int n1 = 0;
		int n2 = 1;
		int f = 0;
		System.out.print(0 + " " + 1 + " ");
		for (int i = 0; i < num - 2; i++) {
			f = n1 + n2;
			n1 = n2;
			n2 = f;
			System.out.print(f + " ");

		}
	}

	public static void fibonacci3(int num) {
		int n1 = 0;
		int n2 = 1;
		int f = 1;
		System.out.print(0);
		for (int i = 0; i < num - 1; i++) {
			System.out.print(" " + f);
			f = n1 + n2;
			n1 = n2;
			n2 = f;
		}
	}

	public static ArrayList fibonacci4(int num) {

		ArrayList<Integer> f = new ArrayList<>(Arrays.asList(0, 1));
		for (int i = 0; i < num - 2; i++) {
			f.add(f.get(i) + f.get(i + 1));
		}
		return f;
	}

}
