package basicPrograms;

import java.util.Scanner;

//method overloading
public class SumOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int addtwo = AddOfTwo(a, b);
		int sumofthree = AddOfTwo(a, b, c);
		System.out.println("Addition of two numbers " + addtwo);
		System.out.println("Addition of three numbers " + sumofthree);

	}

	public static int AddOfTwo(int x, int y) {
		int z;
		z = x + y;
		return z;

	}

	public static int AddOfTwo(int x, int y, int z) {
		int s;
		s = x + y + z;
		return s;
	}

}
