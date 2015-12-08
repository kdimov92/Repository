import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number. a=");
		int a = sc.nextInt();
		System.out.println("Enter second number. b=");
		int b = sc.nextInt();
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a="+ a + " b=" + b);
		
		
	}

}
