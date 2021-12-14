package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This This program takes input from the user and prints the String type
 * array list dynamically
 * 
 * @author deepika
 * 
 */

public class StringArrayListDynamically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array list");
		int size = sc.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter elements into the array");
		for (int i = 0; i < size; i++) {
			al.add(sc.next());
		}
		System.out.println("The string array list is");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.add("Sai");
		al.remove(2);
		System.out.println(al);

	}

}
