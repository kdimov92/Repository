import java.util.Scanner;

public class zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = arr[0] - (sum / 7);
		double min = 0;
		for (int i = 1; i < arr.length; i++) {
			double dif = 0;
			if (arr[i] - (sum / 7) <0) {
				dif = -(arr[i] - (sum / 7));
			}else {
				dif=arr[i] - (sum / 7);
			}
			if ( dif < average) {
				min = arr[i];
			}
		}
		System.out.println("Average " + sum / 7 + " closest number " + min);
	}

}
