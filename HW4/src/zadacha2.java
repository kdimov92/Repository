import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for (int indexRow = 0; indexRow < arr.length; indexRow++) {
			for (int indexCol = 0; indexCol < arr[0].length; indexCol++) {
				arr[indexRow][indexCol] = sc.nextInt();
			}
		}
		for (int indexRow = 0; indexRow < arr.length; indexRow++) {
			System.out.print(arr[indexRow][indexRow] + " " );
		}
		System.out.println();
		int col = 0;
		for (int index1 = arr.length-1; index1 >= 0; index1--) {
			System.out.print(arr[index1][col] + " " );
			col++;
		}
	}

}
