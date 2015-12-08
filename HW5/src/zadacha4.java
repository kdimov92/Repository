import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names");
		String str1 = sc.nextLine();
		String[] names = str1.split(",");
		int maxSum = 0;
		int maxIndex = 0;
		for (int i = 0; i < names.length; i++) {
			int sum = 0;
			for (int j = 0; j < names[i].length(); j++) {
				sum += (int) names[i].charAt(j);
			}
			if (maxSum < sum) {   //нямам проверка за равно
				maxSum = sum;
				maxIndex = i;
			}
		}
		System.out.println(names[maxIndex]);

	}

}
