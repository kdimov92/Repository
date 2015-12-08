import java.util.Scanner;

public class zadacha17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter b(3 to 20)");
		int b = sc.nextInt();
		System.out.println("Enter symbol");
		char symb = sc.next().charAt(0);
		for (int i = 0; i <= b-1; i++) {
			for (int j = 0; j <= b-1; j++) {
				if (i == 0 || i==(b-1) || j==0 || j==(b-1) ) {
					System.out.print("*");
				}else {
					System.out.print(symb);
				}
			}
			System.out.println();
		}
	}

}
