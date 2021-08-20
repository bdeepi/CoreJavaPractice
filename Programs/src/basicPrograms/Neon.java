package basicPrograms;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isneon = neon(n);
		if(isneon) {
			System.out.println("The given number is neon");
		}else {
			System.out.println("The given number is not neon");
		}

	}
	public static boolean neon(int n) {
		int temp = n;
		n = n * n;
		int rem = 0, r = 0;
		while(n > 0) {
			rem = n % 10;
			r = r + rem;
			n = n /10;
		}
		if(temp == r) {
			return true;
		} else {
			return false;
		}
	}

}
