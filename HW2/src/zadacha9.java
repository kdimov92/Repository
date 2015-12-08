import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int sum =0;
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if ((i * i) % 3 != 0) {
					System.out.print((i * i) + ",");
				}
				if ((i * i) % 3 == 0) {
					System.out.print("skip 3,");
				}
				sum += (i*i);
				if (sum > 200) {
					break;
				}

			}
			
		}
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				if ((i * i) % 3 != 0) {
					System.out.print((i * i) + ",");
				}
				if ((i * i) % 3 == 0) {
					System.out.print("skip 3,");
				}
				sum += (i*i);
				if (sum > 200) {
					break;
				}

			}
			
		}
		if (num1 == num2) {
			System.out.println("equal numbers");
		}
	}

}
