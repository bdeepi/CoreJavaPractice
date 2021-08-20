package Programs;
import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 4 == 0) {
			System.out.println("It is a Leap year");
		} else {
			System.out.println("Not a Leap year");
		}

	}

}
