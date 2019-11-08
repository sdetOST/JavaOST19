package CyberInterviewQ;

// Swap two variable' values without using a third variable

public class swapNumbers {

	public static void main(String[] args) {
		swap(5,6);
		swap2(5,6);
		swap2(-1,0);


	}

//Solution 1:
	public static void swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a is : "+ a);
		System.out.println("b is : "+ b);
	}

//Solution 2:
	public static void swap2(int a, int b) {

		a = a ^ b;	System.out.println(a);
		b = a ^ b;	System.out.println(b);
		a = a ^ b;	System.out.println(a);
		System.out.println("a is : "+ a);
		System.out.println("b is : "+ b);

	}
}
