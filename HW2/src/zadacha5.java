import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			for (int i = num2; i <= num1 ; i++) {
				System.out.println(i);
			}
		}
		if (num2 > num1) {
			for (int i = num1; i <= num2 ; i++) {
				System.out.println(i);
			}
		}
		if (num1 == num2) {
			System.out.println("The numbers you entered are equal");
		}
	}

}
