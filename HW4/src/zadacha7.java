
public class zadacha7 {// за сега нямам идея за един цикъл

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 }};
		int sumAll =0;
		int row=0;
		int col=0;
		int rowSum=0;
		do {
			sumAll +=arr[row][col];
			rowSum +=arr[row][col];
			if (col > arr[0].length) {
				System.out.println("Row " + row + " = " + rowSum);
			}
			if (col < arr[0].length) {
				col+=2;
			}else {
				row+=2;
				col=0;
			}
			if (col > arr[0].length) {
				System.out.println("Row " + row);
			}
		} while (row < arr.length && col<arr[0].length);

	}

}
