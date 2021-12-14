package arrays;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter elements of the array");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("the elements in the array " + array[i]);
			
		}

	}

}
