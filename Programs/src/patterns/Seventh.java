package patterns;

import java.util.Scanner;
/*
 
 1  1  1  1 
 2  2  2  2 
 3  3  3  3 
 4  4  4  4 

 
 */

public class Seventh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
