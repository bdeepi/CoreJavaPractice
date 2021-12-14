package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This This program takes input from the user and prints the Character type
 * array list dynamically
 * 
 * @author deepika
 * 
 */

public class CharacterArrayListDynamically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array List");
		int size = sc.nextInt();
		ArrayList<Character> al = new ArrayList<Character>();
		System.out.println("Enter elements into the array");
		for (int i = 0; i < size; i++) {
			al.add(sc.next().charAt(0));
		}
		System.out.println("The character array list is");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

}
