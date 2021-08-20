package basicPrograms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = Product(a, b);
	System.out.println("product of two numbers " + c);

	}
	public static int Product(int a, int b){
		int c;
		c = a * b;
		return c;
		
	}

}
