import java.util.Scanner;

public class zadacha24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 1;
		do {
			number /= 10;
			count++;
		} while (number > 10);
		System.out.println(count);
	}

}
