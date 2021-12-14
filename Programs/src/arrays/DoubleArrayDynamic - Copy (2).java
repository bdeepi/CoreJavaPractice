package arrays;
import java.util.Scanner;
/**
 *  This program reads the elements from the user and print the Double type array of elements 
 * @author Deepika
 *
 */

public class DoubleArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		double array[] = new double[n]; //declaring array and initializing and declaring size of array
		System.out.println("Enter elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		System.out.println("Array elements are : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
