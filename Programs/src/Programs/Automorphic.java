package Programs;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s, rem, temp;
		s = n * n;
		rem = s % 10;
		temp = rem;
		if (temp == n) {
			System.out.println("Automorphic number");
		} else {
			System.out.println(" Not a Automorphic number");
		}

	}

}
