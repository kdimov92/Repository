import java.util.Scanner;

public class zadacha22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num1 = sc.nextInt();
		int count = 0;
		do {
			num1 += 1;
			if (num1 % 2 == 0 || num1 % 3 == 0 || num1 % 5 == 0) {
				count += 1;
				System.out.print(count + ":" + num1 +" ");
			}
		} while (count < 10);

	}

}
