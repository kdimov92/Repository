import java.util.Scanner;

public class zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string (40 symbols max)");// не успях да направя го направя с while
		String str1 = sc.nextLine();
		System.out.println("Enter second string (40 symbols max)");
		String str2 = sc.nextLine();
		System.out.print(str1.toLowerCase() + " " + str1.toUpperCase() + " " );
		System.out.print(str2.toLowerCase() + " " + str2.toUpperCase() + " " );

	}

}
