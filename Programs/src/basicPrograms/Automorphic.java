package basicPrograms;

import java.util.Scanner;

/**
 * Automorphic -> A number is called an Automorphic number if and only if the
 * square of the given number ends with the same number itself
 * This class find outs whether the given number is Automorphic or not
 * @author Deepika
 * 
 */
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isautomorphic = automorphic(n);
		if (isautomorphic) {
			System.out.println("given number is automporphic");
		} else {
			System.out.println("not a automorphic");
		}

	}

	/**
	 * This method find outs the automorphic number
	 * @param n - An integer number    
	 * @return true/false -> if automorphic(true) else (false)
	 */
	public static boolean automorphic(int n) {
		int rem = 0, temp = n;
		n = n * n;

		rem = n % 10;
		n = n / 10;
		if (rem == temp) {
			return true;
		} else {
			return false;
		}

	}

}
