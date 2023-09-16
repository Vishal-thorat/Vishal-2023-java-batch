package matrix_addition.example;

public class Sum {
	public static void main(String[] args) {
		int[][] arr1 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3 x 3
		int[][] sum = new int[3][3];

		// sum

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {

				sum[i][j] = arr1[i][j] + arr2[i][j];

			}
		}

		printArray(sum);
	}

	public static void printArray(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {

				System.out.println(result[i][j]);

			}
			System.out.println();
		}
	}

}
