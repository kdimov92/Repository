import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word (6 minimum)");
		String firstWord = sc.nextLine();
		System.out.println("Enter second word (6 minimum)");
		String secondWord = sc.nextLine();
		String firstWordNew = secondWord.substring(0, 5) + firstWord.substring(5);
		String secondWordNew = firstWord.substring(0, 5) + secondWord.substring(5);
		if (firstWord.length() == secondWord.length()) {
			System.out.println(firstWord.length() + " " + firstWordNew + " " + secondWordNew);
		}
		if (firstWord.length() > secondWord.length()) {
			System.out.println(firstWord.length() + " " + firstWordNew);
		}
		if (firstWord.length() < secondWord.length()) {
			System.out.println(secondWord.length() + " " + secondWordNew);
		}
		

	}

}
