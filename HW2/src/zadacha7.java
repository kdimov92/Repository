import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter n");
		int n = sc.nextInt();
		int x = 3;
		int broi = 0;
		if (n >= 1) {
			do {
				System.out.println(x);
				x += 3;
				broi += 1;
			} while (broi != n);

		}

	}

}
