package basicPrograms;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isstrong = strong(n);
		if(isstrong) {
			System.out.println("strong number");
		} else {
			System.out.println("not a strong number");
		}

	}

	public static boolean strong(int n) {
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
