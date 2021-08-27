package arrays;

import java.util.Scanner;

public class StringArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringarray[] = new String[4];
		for (int i = 0; i < stringarray.length; i++) {
			stringarray[i] = sc.next();

		}
		for (int i = 0; i < stringarray.length; i++) {
			System.out.print(stringarray[i] + " ");
		}

	}

}
