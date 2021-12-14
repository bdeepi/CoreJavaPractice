package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) {
		int key = 6;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the array");
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		for (int i = 0; i < al.size() - 1; i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (key == al.get(i) + al.get(j)) {
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("Super array");
		} else {
			System.out.println("Not a super array");
		}

	}

}
