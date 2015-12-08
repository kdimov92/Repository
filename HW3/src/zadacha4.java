import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean isMirror = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < (arr.length/2); i++) {
			if (arr[(n-1)-i] != arr[i]) {
				isMirror = false ;
			}
		}
		if (arr.length == 1 || isMirror == true) {
			System.out.println("The arrey is mirrored");
		}else {
			System.out.println("The arrey is not mirrored");
		}
	}

}
