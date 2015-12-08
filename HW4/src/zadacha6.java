
public class zadacha6 {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 }};
		int sumAll =0 ;
		for (int row = 1; row < arr.length; row+=2) {
			int sum =0;
			for (int col = 0; col < arr[0].length; col++) {
				sum+=arr[row][col];
				}
			sumAll+= sum;;
			System.out.println("Row " + (row+1) + " = " + sum );
		}
		System.out.println("Sum of all = " + sumAll);
	}

}
