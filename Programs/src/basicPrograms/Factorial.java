package basicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double factof = FactorialOf(n);
		System.out.println ("factorial of " + n + ":" +factof );
	

	}
	public static double FactorialOf(int n) {
		int fact = 1;
		for(int i = 1;i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
