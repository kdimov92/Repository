
public class zadacha5 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, };
		int maxCol = 0;
		int maxRow = 0;
		
		for (int col = 0; col < arr[0].length; col++) {
			int sum1 = 0;
			for (int row = arr.length - 1; row >= 0; row--) {
				sum1 += arr[row][col];
			}
			if (sum1 > maxCol) {
				maxCol = sum1;
			}
		}
		
		for (int row = 0; row < arr.length; row++) {
			int sum2 = 0;
			for (int col = 0; col < arr[0].length; col++) {
				sum2 += arr[row][col];
			}
			if (sum2 > maxRow) {
				maxRow = sum2;
			}
		}

		if (maxCol == maxRow) {
			System.out.println("The biggest collum " + maxCol + " is qual to the biggest row " + maxRow);
		}
		if (maxCol != maxRow && maxRow < maxCol) {
			System.out.println("The biggest collum " + maxCol + " is bigger to the biggest row " + maxRow);
		}
		if (maxCol != maxRow && maxRow > maxCol) {
			System.out.println("The biggest collum " + maxCol + " is lesser to the biggest row " + maxRow);
		}

	}

}
