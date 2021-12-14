package basicProgramsMethods;

import java.util.Scanner;
/**
 * Strong number -> A strong number is a number whose sum of the factorial of each digit is equal to that number
 * This program finds whether the given number is strong or not
 * @author Deepika
 *
 */

public class Strong {

	public static void main(String[] args) {
		Strong st = new Strong();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isstrong = st.strong(n);
		if(isstrong) {
			System.out.println("strong number");
		} else {
			System.out.println("not a strong number");
		}

	}
	/**
	 * This method finds whether the given number is strong or not
	 * @param n -> An integer number
	 * @return true / false -> (true) if strong, else (false)
	 */

	public  boolean strong(int n) {
		int rem, sum = 0, temp = n;
		while (n > 0) {
			int fact = 1;
			rem = n % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n /10;
		}
		if(temp == sum) {
			return true;
		} else {
			return false;
		}

	}

}
