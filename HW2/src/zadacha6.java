import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		int sum = 0;
		if (num1 > 1) {
			for (int i = 1; i <= num1; i++) {
				sum += i;
			}
		}
		if (num1 < 1) {
			for (int i = num1; i <= 1; i++) {
				sum += i;
			}
		}
		if (num1 == 1) {
			sum = 1;
		}
		System.out.println(sum);

	}

}
