package a01;

public class twoDArraySums {

	public static void main(String[] args) {

		int[][] data = { { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };

		display(data);
		sumOfRow(data, 0);
		sumOfColm(data, 5);
		sumOfAll(data);

	}

	public static void display(int[][] data) {

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void sumOfRow(int[][] data, int rowNum) {
		int sum = 0;
		for (int i = 0; i < data[rowNum].length; i++) {
			sum += data[rowNum][i];
		}
		System.out.println(sum);
	}

	public static void sumOfAll(int[][] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
				sum += data[i][j];
		}
		System.out.println(sum);
	}

	public static void sumOfColm(int[][] data, int colmNum) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			if (colmNum > data[i].length - 1)
				continue;
			sum += data[i][colmNum];
		}
		System.out.println(sum);
	}

}
