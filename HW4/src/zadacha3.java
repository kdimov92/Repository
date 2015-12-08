
public class zadacha3 {

	public static void main(String[] args) {
		int[][] arr = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 } };
		double sum = 0;
		for (int indexRow = 0; indexRow < arr.length; indexRow++) {
			for (int indexCol = 0; indexCol < arr[0].length; indexCol++) {
				sum += (double) arr[indexRow][indexRow];
			}
		}
		System.out.println("sum = " + sum + " average = " + (sum / (arr.length + arr[0].length)));

	}

}
