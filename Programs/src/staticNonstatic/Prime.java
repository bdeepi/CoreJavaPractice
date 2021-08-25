package staticNonstatic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Prime obj = new Prime();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		obj.isPrime(n);

	}
	public void isPrime(int n) {
		boolean flag = true;
		for(int i = 2; i < n ; i++) {
			if(n % i == 0){
				flag = false;
				break;
			}
		}
		if(flag == true){
			System.out.println("prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}

}
