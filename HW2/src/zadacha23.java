
public class zadacha23 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 1) {
					System.out.print(i + "*" + j + " ");
				}
				if (i != 1 && j >= i) {
					System.out.print(i + "*" + j + " ");
				}

			}
			System.out.println();
		}

	}

}
