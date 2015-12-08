import java.util.Scanner;

public class zadacha16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int number = sc.nextInt();
		int a = number / 100;
		int b = (number % 100) / 10;
		int c = number % 10;
		int var = 0;
		if (a == b && b == c) {
			var = 1;
		}
		if (a > b && b > c) {
			var = 2;
		}
		if (a < b && b < c) {
			var = 3;
		}
		switch (var) {
		case 1:
			System.out.println("The digits are even");
			break;
		case 2:
			System.out.println("Decreasing order");
			break;
		case 3:
			System.out.println("Increasing order");

		default:
			System.out.println("Unaccounted case");
			break;
		}

	}

}
