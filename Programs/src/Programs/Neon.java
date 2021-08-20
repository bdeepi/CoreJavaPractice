package Programs;
import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rem;
		int temp = n;
		int r = 0;
		n = n * n;
		while (n > 0) {
			rem = n % 10;
			r = r + rem;
			n = n / 10;
		}
		if (temp == r) {
			System.out.println("neon number");
		} else {
			System.out.println("not a neon number");
		}
	}

}
