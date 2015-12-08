import java.util.Scanner;

public class zadacha14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number between 10 and 200");//не ми се правят проверки
		int num1 = sc.nextInt();
		for (int i = num1; i >= 10; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
