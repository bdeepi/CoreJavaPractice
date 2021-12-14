package arrays;
import java.util.Scanner;
/**
 *  This program reads the elements from the user and print the String array of elements 
 * @author admin
 *
 */

public class StringArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		String stringarray[] = new String[n];
		System.out.println("Enter elements : ");
		for (int i = 0; i < stringarray.length; i++) {
			stringarray[i] = sc.next();

		}
		System.out.println("Array elements are : ");
		for (int i = 0; i < stringarray.length; i++) {
			System.out.print(stringarray[i] + " ");
		}

	}

}
