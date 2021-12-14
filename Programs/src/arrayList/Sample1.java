package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program will read an array and not accepting a particular value and
 * printing the array excluding that value 
 * author @deepika
 * 
 */
public class Sample1 {

	public static void main(String[] args) {
		int index = -1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the array");
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n == 22) {
				i--;
			} else {
				al.add(n);
			}
		}

		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

	}

}
