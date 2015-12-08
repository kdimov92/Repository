import java.util.Scanner;

public class zadacha11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = sc.nextInt();
		for (int i = 0; i <= num1 - 1; i++) {
			for (int j = 1; j <= (i + num1); j++) {
				if (j == i + num1 || i == num1 - 1 || i + j == num1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
