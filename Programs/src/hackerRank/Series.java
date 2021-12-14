package hackerRank;

import java.util.Scanner;
/*
 
 (a + 2 ^ 0 * b),(a + 2 ^ 0 * b + 2 ^ 1 * b),(a + 2 ^ 0 * b + 2 ^ 1 * b + 2 ^ 2 * b)...........
 */

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 2; //sc.nextInt();
		int b = 3;//sc.nextInt();
		int s = 0;
        for(int i = 0; i < n; i++) {
		for(int j = 0; j < n; j++){
			s = s + (a + (2^i * b));
			
		}
        }
		System.out.println(s);


	}
	}



