import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter n");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println(0);
		}
		int x=n-1;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(x);
			}
			x +=2;
			System.out.println();
		}

	}

}
