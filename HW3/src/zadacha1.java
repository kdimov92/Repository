import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		boolean thereIs = false; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min && arr[i] % 3 == 0 ) {
				min = arr[i];
				thereIs = true;
			}
		}
		if (thereIs == false && arr[0] % 3 == 0 ) {
			min = arr[0];
			System.out.println(min);
		}
		if (thereIs == false && arr[0] % 3 != 0) {
			System.out.println("No such number");
		}
		if (thereIs == true) {
			System.out.println(min);
		}
		

	}

}
