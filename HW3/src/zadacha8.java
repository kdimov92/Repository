import java.util.Scanner;

public class zadacha8 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of the array");
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int count = 1;
			int maxCount =1;
			int num = arr[0];
			int maxNum = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				if (i== n) {
					break;
				}
				if (arr[i] == arr[i+1]) {
					count+=1;
					num = arr[i];
				}else {
					count = 0;
				}
				if (count >  maxCount) {
					maxCount = count;
					maxNum = num;
				}
			}
			System.out.println(maxNum + " is found " + maxCount + " times");

	}

}
