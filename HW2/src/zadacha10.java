import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <=(num1/2) ; i++) {
			if (num1 % i ==0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}

	}

}
