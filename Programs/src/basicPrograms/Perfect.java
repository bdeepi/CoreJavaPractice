package basicPrograms;
import java. util.Scanner;
/**
 * Perfect number -> Perfect number, a positive integer that is equal to the sum of its proper divisors.
 * This program finds whether the given is perfect or not 
 * @author Deepika
 *
 */
public class Perfect {

	public static void main(String[] args) {
		Perfect p = new Perfect();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isperfect = p.perfect(n);
		if (isperfect) {
			System.out.println("perfect number");
		} else {
			System.out.println("not a perfect number");
		}

	}
	/**
	 * This method performs the operation to find the given number is perfect or not
	 * @param n -> An integer number
	 * @return true / false -> (true) if perfect, else (false) 
	 */

	public  boolean perfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}

}
