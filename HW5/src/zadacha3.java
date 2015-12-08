import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word ");
		String str1 = sc.nextLine();
		System.out.println("Enter second word ");
		String str2 = sc.nextLine();

		if (str1.length() == str2.length()) {
			System.out.println("The string are the same size");
		} else {
			System.out.println("The string are not the same size");
		}

		int count = (str1.length() > str2.length()) ? str2.length() : str1.length();

		for (int index = 0; index < count; index++) {
			if (str1.charAt(index) != str2.charAt(index)) {
				System.out.println(index + " " + str1.charAt(index) + " " + str2.charAt(index));
			}
		}

	}

}
