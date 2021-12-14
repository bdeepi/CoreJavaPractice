package arrays;

import java.util.Scanner;
/**
 * This program reads the elements from the user and print the Character type array of elements
 * @author Deepika
 *
 */

public class CharArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		char array[] = new char[n];
		System.out.println("enter the elements : ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.next().charAt(0);
			
		}
		System.out.println("Array Elements are : ");
		for(int i = 0; i <array.length; i++) {
			System.out.print(array[i]);
			
		}
		
	}

}
