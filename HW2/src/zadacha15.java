import java.util.Scanner;

public class zadacha15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		long sum = 1;
		int i = 2;
		do {
			sum += i;
			i += 1;
		} while (i <= number);
		System.out.println(sum);
	}

}
