import java.util.Scanner;

public class zadacha25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		long sum = 1;
		int fak = 2;
		do {
			sum *= fak;
			fak += 1;
		} while (fak <= number);
		System.out.println(sum);

	}

}
