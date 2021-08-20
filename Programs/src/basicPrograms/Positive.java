package basicPrograms;

import java.util.Scanner;

public class Positive {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ispositive = positive(n);
		if(ispositive) {
			System.out.println("is positive");	
		} else {
			System.out.println("is negative");
		}
		
		//boolean isgreater = positive(x , y);

	}
	public static boolean positive(int n) {
		if(n > 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
/*	
	public static boolean positive(int a, int b) {
		if(a > b) {
			return true;
		} else {
			return false;
		}
	}*/

}
