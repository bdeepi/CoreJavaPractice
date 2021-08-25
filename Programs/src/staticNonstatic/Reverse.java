package staticNonstatic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Reverse obj = new Reverse();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 obj.isreverse(n);
		
	}
	public int isreverse(int n){
		int rem = 0, rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
		}
		System.out.println(rev);	
		return rev;
		
		}
}


