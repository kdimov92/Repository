import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >5 && arr[i]%5 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
	}

}
