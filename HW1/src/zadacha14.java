import java.util.Scanner;

public class zadacha14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates ");
		int row = sc.nextInt();
		int collum = sc.nextInt();
		if ((row % 2) == (collum % 2)) {
			System.out.println("White");
		} else {
			System.out.println("Black");
		}

	}

}
