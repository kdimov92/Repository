import java.util.Scanner;

public class zadacha18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number (1 to 9)");
		int num1 = sc.nextInt();
		System.out.println("Enter second number (1 to 9)");
		int num2 = sc.nextInt();
		int less = 0;
		int more = 0;
		if (num1 >= num2) {
			more = num1;
			num2 = num2;
		} else {
			more = num2;
			less = num1;
		}
		for (int i = 1; i <= less; i++) {
			for (int j = 1; j <= more; j++) {
				System.out.println(i + " * " + j + "=" + (i * j));
			}
		}

	}

}
