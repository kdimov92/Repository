import java.util.Scanner;

public class zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number. a=");
		int a = sc.nextInt();
		System.out.println("Enter second number. b=");
		int b = sc.nextInt();
		int c = (a*b)%10;
		if (c%2 == 0) 
		{
			System.out.println((c%10) + " is even number");
		}
		else System.out.println((c%10) + " is odd number");

	}

}
