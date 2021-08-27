package arrays;

import java.util.Scanner;

public class DoubleArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double array[] = new double[5]; //declaring array and initializing and declaring size of array
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
