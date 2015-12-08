import java.util.Scanner;

public class zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the first array");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size of the second array");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int broi = 0;
		boolean areEqual = true;
		do {
			if (arr1[broi] != arr2[broi]) {
				areEqual = false;
			}
			broi++;
		} while (broi <= arr1.length - 1 && broi <= arr2.length - 1);
		if (areEqual == true) {
			if (size1 == size2) {
				System.out.println("The arrays are equal");
			} else {
				System.out.println("The arrays are equal untill inex " + (broi-1));
			}
		}
		if (areEqual == false) {
			if (size1 == size2) {
				System.out.println("The arrays are not equal but the same size");
			} else {
				System.out.println("The arrays are not equal and not the same size");
			}
		}

	}

}
