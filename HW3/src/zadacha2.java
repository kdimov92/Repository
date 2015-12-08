import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] copyOfArr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			copyOfArr[i]=arr[i];

		}
		for (int i = 0; i < (arr.length/2); i++) {
			copyOfArr[(n-1)-i] = arr[i];
		}
		for (int i = 0; i < copyOfArr.length; i++) {
			System.out.print(copyOfArr[i] + " ");
		}
	}

}
