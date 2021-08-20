package Programs;
import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, r = 0;
		for (i = 1; i < n; i++) {
			if (n % i == 0) {
				r = r + i;
			}
		}
		if (n == r) {
			System.out.println("It is a perfect number");
		} else {
			System.out.println("It is not a perfect number");
		}

	}

}
