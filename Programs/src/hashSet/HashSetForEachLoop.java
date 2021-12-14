package hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetForEachLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println("Enter elements in to the array");
		for (int i = 0; i < 5; i++) {
			hs.add(sc.nextInt());
		}
		System.out.println("The hashset is ");
		for (int n : hs) {
			System.out.println(n);
		}

	}

}
