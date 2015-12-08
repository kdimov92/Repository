
public class zadacha1 {

	public static void main(String[] args) {
		int[][] arr = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		int max = arr[1][1];
		int min = arr[1][1];
		for (int indexRow = 0; indexRow < arr.length; indexRow++) {
			for (int indexCol = 0; indexCol < arr[0].length; indexCol++) {
				if (arr[indexRow][indexCol] > max) {
					max = arr[indexRow][indexCol];
				}
				if (arr[indexRow][indexCol] < min) {
					min = arr[indexRow][indexCol];
				}
			}
		}
		System.out.println("min = " + min +" max = " + max );
	}

}
