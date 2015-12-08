import java.util.Scanner;

public class zadacha16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		if (num1 < num2) {
			for (int i = num2; i >= num1 ; i--) {
				if (i% 50 ==0) {
					System.out.println(i);
				}
			}
		}
		if (num1 > num2) {
			for (int i = num1; i >= num2 ; i--) {
				if (i% 50 ==0) {
					System.out.println(i);
				}
			}
		}
		if (num1 == num2) {
			System.out.println("equal numbers");
		}

	}

}
