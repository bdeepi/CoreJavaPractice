package Programs;

import java.util.Scanner;
/**
 * This program performs the sum of sq of digits of the given number
 * @author Deepika
 *
 */

public class SumOfSq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while (n < 100) {
			n = (n * n) + 1;
			i++;
		}
		System.out.println(i);
	}
}
