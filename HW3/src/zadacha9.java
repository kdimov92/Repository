import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = arr[i] * arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] / arr[arr.length - 1 - i];
			arr[i] = arr[i] / arr[arr.length - 1 - i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
