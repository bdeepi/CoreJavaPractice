package basicPrograms;

import java.util.Scanner;

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
