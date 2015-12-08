import java.util.Scanner;

public class zadacha19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number (10 to 99)");
		int num1 = sc.nextInt();
		do {
			if (num1 % 2 ==0) {
				num1 /= 2;
			}else {
				num1 = (num1*3) +1;
			}
			System.out.print(num1 + " ");
		} while (num1 !=1);
		

	}

}
